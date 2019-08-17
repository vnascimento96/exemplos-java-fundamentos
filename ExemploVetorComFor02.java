import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

/**
 * ExemploVetorComFor02
 */
public class ExemploVetorComFor02 {

    public static void main(String[] args) throws IOException{
        Scanner teclado = new Scanner(System.in);

        System.out.print("Quantidade: ");
        int quantidade = Integer.parseInt(teclado.nextLine());

        String[] nomes = new String[quantidade];
        double[] precos = new double[quantidade];

        for(int i = 0; i < nomes.length; i = i + 1){
            System.out.print("Nome: ");
            nomes[i] = teclado.nextLine();

            System.out.print("Preço: ");
            precos[i] = Double.parseDouble(teclado.nextLine());
        }
    

        double total = 0;
        for(int i = 0; i < precos.length; i = i + 1){
            total = total + precos[i];
        }

        System.out.println("Total: " + total);

        String texto = "";
        for(int i = 0; i < precos.length; i = i + 1){
            texto = texto + nomes[i] + " R$ " + precos[i] + "\n";
        }
        texto = texto + "Total: R$ " + total;
        File arquivo = new File("sistema.txt");
        FileWriter escritor = new FileWriter(arquivo);
        escritor.write(texto);
        escritor.flush();

    }
}