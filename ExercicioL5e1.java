import java.util.Scanner;

/**
 * ExercicioL5e1
 */
public class ExercicioL5e1 {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        System.out.println("Digite sua primeira nota: ");
        double notaUm = Double.parseDouble(teclado.nextLine());

        System.out.println("Digite sua segunda nota: ");
        double notaDois = Double.parseDouble(teclado.nextLine());

        System.out.println("Digite sua terceira nota: ");
        double notaTres = Double.parseDouble(teclado.nextLine());

        System.out.println("Digite sua quarta nota: ");
        double notaQuatro = Double.parseDouble(teclado.nextLine());

        double media = (notaUm + notaDois + notaTres + notaQuatro) / 4;

        if (media < 5) {
            System.out.println("Reprovado: " + media);
        } else if ((media >= 5) && (media < 7)) {
            System.out.println("Exame: " + media);
        } else if (media >= 7) {
            System.out.println("Aprovado: " + media);
        }
    }
}