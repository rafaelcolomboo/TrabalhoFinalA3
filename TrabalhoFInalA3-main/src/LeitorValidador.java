import java.util.Scanner;

public class LeitorValidador {

    Scanner sc = new Scanner(System.in);

    public String lerNome(ValidarCampos vc) {
        String nome;
        while (true) {
            System.out.print("Digite o nome da ferramenta: ");
            nome = sc.nextLine();
            if (vc.validarNome(nome)) {
                return nome;
            }
        }
    }
    public String lerMarca(ValidarCampos vc) {
        String marca;
        while (true) {
            System.out.print("Digite a marca da ferramenta: ");
            marca = sc.nextLine();
            if (vc.validarMarca(marca)) {
                return marca;
            }
        }
    }
    public Double lerPreco(ValidarCampos vc) {
        String precoStr;
        while (true) {
            System.out.print("Digite o preco da ferramenta: ");
            precoStr = sc.nextLine();
            if (vc.validarPreco(precoStr)) {
                return Double.parseDouble(precoStr);
            }
        }
    }
    public int lerQuantidade(ValidarCampos vc) {
        String quantidadeStr;
        while (true) {
            System.out.print("Digite a quantidade da ferramenta: ");
            quantidadeStr = sc.nextLine();

            if (vc.validarQuantidade(quantidadeStr)) {
                return Integer.parseInt(quantidadeStr);
            }
        }
    }

    public int lerId(ValidarCampos vc) {
        String idStr;
        while (true) {
            System.out.print("Digite o ID da ferramenta: ");
            idStr = sc.nextLine();
            if (vc.validarId(idStr)) {
                return Integer.parseInt(idStr);
            }
        }
    }
}
