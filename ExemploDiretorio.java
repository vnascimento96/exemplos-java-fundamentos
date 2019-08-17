import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class ExemploDiretorio {

    public static void main(String[] args) throws IOException {
        String caminho = "C:\\Users\\fsens\\Desktop\\Pasta\\";
        new File(caminho).mkdirs();
        for(int i = 0; i < 10; i++){
            File file = new File(caminho + "arquivo0" + i + ".txt");
            FileWriter writer = new FileWriter(file);
            writer.write("Oi");
            writer.flush();
        }
    }
}