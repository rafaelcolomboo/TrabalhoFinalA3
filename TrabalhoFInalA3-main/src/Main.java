import java.util.Scanner;

public class Main {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        Crud.Inicializar();

        int opcao;
        do {
            System.out.println("1 - Cadastrar ferramenta.");
            System.out.println("2 - Listar ferramentas.");
            System.out.println("3 - Buscar ferramenta por ID.");
            System.out.println("4 - Editar ferramenta.");
            System.out.println("5 - Remover ferramenta.");
            System.out.println("6 - Sair.");
            opcao = sc.nextInt();
            sc.nextLine();

            switch (opcao){
                case 1 -> Crud.cadastrar();
                case 2 -> Crud.listar();
                case 3 -> Crud.buscar();
                case 4 -> Crud.editar();
                case 5 -> Crud.excluir();
                case 6 -> System.out.println("Encerrando!!");
                default -> System.out.println("Opção inválida");
            }
        } while (opcao != 6);
    }
}