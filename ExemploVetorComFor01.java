import java.util.Scanner;

public class ExemploVetorComFor01 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        String[] nomes = new String[3];

        for (int i = 0; i < nomes.length; i = i + 1) {

            System.out.print("Nome: ");
            nomes[i] = teclado.nextLine();
        }

        System.out.println("Nomes: ");
        for (int i = 0; i < nomes.length; i = i + 1) {
            System.out.print(nomes[i] + ",");
        }

    }
}