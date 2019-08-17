import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class ExemploFile {

    public static void main(String[] args) throws IOException {

        File arquivo = new File("C:\\Users\\fsens\\Desktop\\arquivo.txt");
        FileWriter escritor = new FileWriter(arquivo);
        escritor.write("Olá mundo");
        escritor.flush();
    }
}