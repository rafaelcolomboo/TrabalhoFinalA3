import java.util.Scanner;

public class ValidarCampos {
    Scanner sc = new Scanner(System.in);

    public boolean validarNome(String nome) {

        if (nome.isBlank()){
            System.out.println("\nNão utilize somente espaços em branco\n");
            return false;
        }

        if (!nome.matches("^[\\p{L}\\p{N}]+([+-]?[\\p{L}\\p{N}]+)*( [\\p{L}\\p{N}]+([+-]?[\\p{L}\\p{N}]+)*)*$")) {
            System.out.println("\nNome deve conter apenas letras, números, espaços e os sinais '-' ou '+' no meio das palavras.\n");

            return false;
        }
        return true;
    }


    public boolean validarMarca(String marca) {

        if (marca.isBlank()){
            System.out.println("\nNão utilize somente espaços em branco\n");
            return false;
        }

        if (!marca.matches("^[\\p{L}\\p{N}]+([+-]?[\\p{L}\\p{N}]+)*( [\\p{L}\\p{N}]+([+-]?[\\p{L}\\p{N}]+)*)*$")) {
            System.out.println("\nMarca deve conter apenas letras, números, espaços e os sinais '-' ou '+' no meio das palavras.\n");
            return false;
        }
        return true;
    }

    public boolean validarPreco(String precoStr) {
        if (precoStr.isBlank()){
            System.out.println("\nNão utilize somente espaços em branco\n");
            return false;
        }

        if (!precoStr.matches("\\d+(\\.\\d+)?")) {
            System.out.println("\nPreço inválido. Use apenas números e ponto decimal.\n");
            return false;
        }

        double preco = Double.parseDouble(precoStr);

        if (preco < 0.01) {
            System.out.println("\nPreço deve ser maior ou igual a 0.01\n");
            return false;
        }

        return true;
    }

    public boolean validarQuantidade(String quantidadeStr) {
        if (quantidadeStr.isBlank()){
            System.out.println("\nNão utilize somente espaços em branco\n");
            return false;
        }

        if (!quantidadeStr.matches("\\d+")) {
            System.out.println("\nQuantidade deve conter apenas números.\n");
            return false;
        }

        int quantidade = Integer.parseInt(quantidadeStr);
        if (quantidade >= 0){
            return true;
        }

        return false;
    }

    public boolean validarId(String idStr) {
        if (idStr.isBlank()) {
            System.out.println("\nID não pode estar em branco ou vazio.\n");
            return false;
        }

        if (!idStr.matches("\\d+")) {
            System.out.println("\nID deve conter apenas números.\n");
            return false;
        }

        return true;
    }

}