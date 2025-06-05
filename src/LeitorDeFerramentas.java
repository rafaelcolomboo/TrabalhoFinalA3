import java.io.*;
import java.util.ArrayList;

public class LeitorDeFerramentas {
    public static void ler(ArrayList<Ferramenta> ferramentas, String caminho) {
        ferramentas.clear();
        try {
            File arquivo = new File(caminho);

            if (!arquivo.exists()) {
                arquivo.createNewFile();
                return;
            }

            BufferedReader leitor = new BufferedReader(new FileReader(arquivo));
            String linha;
            while ((linha = leitor.readLine()) != null) {
                String[] partes = linha.split(";");
                int id = Integer.parseInt(partes[0]);
                String nome = partes[1];
                String marca = partes[2];
                int quantidade = Integer.parseInt(partes[3]);
                double preco = Double.parseDouble(partes[4]);
                Ferramenta f = new Ferramenta(id, nome, marca, quantidade, preco);
                ferramentas.add(f);
            }
            leitor.close();
        } catch (IOException e) {
            System.out.println("Erro ao ler o arquivo de ferramentas.");
            e.printStackTrace();
        }
    }
}
