import java.util.Scanner;

/**
 * ExemploL6e1
 */
public class ExemploL6e1 {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        String sair = "";
        double mediaAltura = 0;
        int mediaIdade = 0;
        double mediaPeso = 0;
        double imc = 0;

        while (!sair.equalsIgnoreCase("sim")) {

            System.out.println("Deseja sair?");
            sair = teclado.nextLine();

            if (sair.equalsIgnoreCase("sim")) {
                
                System.out.println("Media altura: " + mediaAltura);
                System.out.println("Media idade: " + mediaIdade);
                System.out.println("Media peso: " + mediaPeso);
                System.out.println("IMC: " + imc);

                break;
            } else {

                System.out.println("Digite sua idade: ");
                int idade = Integer.parseInt(teclado.nextLine());

                System.out.println("Digite seu peso: ");
                int peso = Integer.parseInt(teclado.nextLine());

                System.out.println("Digite sua altura: ");
                double altura = Double.parseDouble(teclado.nextLine());

                mediaAltura = mediaAltura + altura;
                mediaIdade = mediaIdade + idade;
                mediaPeso = mediaPeso + peso;
                imc = mediaPeso / (mediaAltura * 2);

                

            }
        }

    }
}