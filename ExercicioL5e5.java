import java.util.Scanner;

/**
 * ExercicioL5e5
 */
public class ExercicioL5e5 {

    public static void main(String[] args) {
        
        Scanner teclado = new Scanner(System.in);

        System.out.println("Digite os lado para saber se é um triangulo");

        System.out.println("digite o primeiro lado do triangulo: ");
        double ladoA = Double.parseDouble(teclado.nextLine());

        System.out.println("Digite o segundo lado do tiangulo: ");
        double ladoB = Double.parseDouble(teclado.nextLine());

        System.out.println("Digite o terceiro lado do triangulo: ");
        double ladoC = Double.parseDouble(teclado.nextLine());

        double somaLados = (ladoA + ladoB);

        if (somaLados > ladoC) {
            System.out.println("È um triangulo");
        }else {
            System.out.println("Não é um triangulo");
        }
    }
}