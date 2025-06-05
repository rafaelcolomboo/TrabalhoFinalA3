import java.util.ArrayList;
import java.util.Scanner;

public class Crud {
    static Scanner sc = new Scanner(System.in);
    static ArrayList<Ferramenta> ferramentas = new ArrayList<>();
    static int contadorId = 1;

    public static ValidarCampos vc = new ValidarCampos();
    public static LeitorValidador lv = new LeitorValidador();

    public static void Inicializar() {
        LeitorDeFerramentas.ler(ferramentas, "ferramentas.txt");
        contadorId = obterMaiorId(ferramentas) + 1;
    }

    static void cadastrar(){

        String nome = lv.lerNome(vc);
        String marca = lv.lerMarca(vc);
        int quantidade = lv.lerQuantidade(vc);
        Double preco = lv.lerPreco(vc);

        Ferramenta novaFerramenta = new Ferramenta(contadorId, nome, marca, quantidade, preco);

        contadorId++;
        ferramentas.add(novaFerramenta);

        salvaAutomatico();
    }

    static void listar(){
        for (Ferramenta f : ferramentas) {
            imprimirFerramenta(f);
        }
    }

    static void buscar(){
        int buscarId = lv.lerId(vc);

        Ferramenta idEncontrado = null;

        for (Ferramenta f : ferramentas){
            if (f.getId()== buscarId){
                idEncontrado = f;
                break;
            }
        }
        if (idEncontrado !=null){
            imprimirFerramenta(idEncontrado);

        } else{
            System.out.println("Id "+buscarId + " não encontrado");
        }
    }

    static void editar() {
        int idEditar = lv.lerId(vc);

        Ferramenta f = buscarPorId(idEditar);

        if (f != null) {
            int opcao;
            do {
                System.out.println("O que deseja editar?");
                System.out.println("1 - Todos os campos");
                System.out.println("2 - Nome");
                System.out.println("3 - Marca");
                System.out.println("4 - Quantidade");
                System.out.println("5 - Preço");
                System.out.println("6 - Voltar");
                opcao = sc.nextInt();
                sc.nextLine();

                switch (opcao){
                    case 1 -> {
                        String novoNome = lv.lerNome(vc);
                        String novaMarca = lv.lerMarca(vc);
                        int novaQuantidade = lv.lerQuantidade(vc);
                        Double novoPreco = lv.lerPreco(vc);

                        f.setNome(novoNome);
                        f.setMarca(novaMarca);
                        f.setPreco(novoPreco);
                        f.setQuantidade(novaQuantidade);

                        opcao= 6;
                        salvaAutomatico();
                        System.out.println("Dados atualizado com sucesso.");

                    }
                    case 2 -> {
                        String novoNome = lv.lerNome(vc);
                        f.setNome(novoNome);
                        System.out.println("Nome atualizado com sucesso.");
                        salvaAutomatico();

                    }
                    case 3 -> {
                        String novaMarca = lv.lerMarca(vc);
                        f.setMarca(novaMarca);
                        System.out.println("Marca atualizada com sucesso.");
                        salvaAutomatico();

                    }
                    case 4 -> {
                        int novaQuantidade = lv.lerQuantidade(vc);
                        f.setQuantidade(novaQuantidade);
                        System.out.println("Quantidade atualizado com sucesso.");
                        salvaAutomatico();

                    }


                    case 5 -> {
                        Double novoPreco = lv.lerPreco(vc);
                        f.setPreco(novoPreco);
                        System.out.println("Preço atualizado com sucesso.");
                        salvaAutomatico();

                    }

                    case 6 ->
                            System.out.println("Vontando!");
                    default -> System.out.print("Opção Inválida!\n");
                }
            } while (opcao != 6);
        } else {
            System.out.println("ID não encontrado.");
        }
    }

    static void excluir() {

        int idRemover = lv.lerId(vc);



        boolean encontrou = false;

        for (int i = ferramentas.size() - 1; i >= 0; i--) {
            if (ferramentas.get(i).getId() == idRemover) {
                encontrou = true;

                String resposta;
                do {
                    System.out.println("Tem certeza que deseja excluir a ferramenta \"" +
                            ferramentas.get(i).getNome() + "\" (S/N)?");
                    resposta = sc.nextLine().trim();

                    if (!resposta.equalsIgnoreCase("S") && !resposta.equalsIgnoreCase("N")) {
                        System.out.println("Responda S ou N.");
                    }

                } while (!resposta.equalsIgnoreCase("S") && !resposta.equalsIgnoreCase("N"));

                if (resposta.equalsIgnoreCase("S")) {
                    ferramentas.remove(i);
                    System.out.println("Ferramenta removida com sucesso.");
                } else {
                    System.out.println("Exclusão cancelada.");
                }

                break;
            }
        }

        if (!encontrou) {
            System.out.println("ID não encontrado.");
        }
    }



    static int obterMaiorId(ArrayList<Ferramenta> lista) {
        int maior = 0;
        for (Ferramenta f : lista) {
            if (f.getId() > maior) {
                maior = f.getId();
            }
        }
        return maior;
    }

    static Ferramenta buscarPorId(int idBuscado) {
        for (Ferramenta f : ferramentas) {
            if (f.getId() == idBuscado) {
                return f;
            }
        }
        return null;
    }
    static void salvaAutomatico(){
        GravadorDeFerramentas.salvar(ferramentas, "ferramentas.txt");
    }
    static void imprimirFerramenta(Ferramenta f) {
        System.out.printf(
                "ID: %d | Nome: %s | Marca: %s | Quantidade: %d | Preço: R$%.2f | Disponível: %s\n",
                f.getId(), f.getNome(), f.getMarca(),
                f.getQuantidade(), f.getPreco(), f.isDisponivel() ? "Sim" : "Não"
        );
    }
}