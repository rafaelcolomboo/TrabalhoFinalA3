import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public class GravadorDeFerramentas {
    public static void salvar(ArrayList<Ferramenta> ferramentas, String caminho) {
        try {
            FileWriter escritor = new FileWriter(caminho);
            for (Ferramenta f : ferramentas) {
                escritor.write(f.toString() + "\n");
            }
            escritor.close();
            System.out.println("Ferramenta salva com sucesso!\n");
        } catch ( IOException e) {
            System.out.println("Erro ao salvar ferramenta." +e.getMessage());
            e.printStackTrace();
        }
    }
}
