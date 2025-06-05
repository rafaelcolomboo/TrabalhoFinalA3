public class Ferramenta {
    private final int id;
    private String nome;
    private String marca;
    private int quantidade;
    private  double preco;

    public Ferramenta(int id, String nome, String marca, int quantidade, double preco) {
        this.id = id;
        this.nome = nome;
        this.marca = marca;
        this.quantidade = quantidade;
        this.preco = preco;

    }

    public int getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {

        this.preco = preco;
    }

    public boolean isDisponivel() {
        return  this.quantidade > 0;
    }

    @Override
    public String toString() {
        return id + ";" + nome + ";" + marca + ";" + quantidade + ";" + preco + ";" +isDisponivel();
    }
}
