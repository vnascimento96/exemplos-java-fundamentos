import java.util.Scanner;

public class ExemploFor05 {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        double somaNotas = 0;
        for(int i = 0; i < 3; i = i + 1){
            System.out.print("Nota: ");
            double nota = Double.parseDouble(teclado.nextLine());

            somaNotas = somaNotas + nota;
        }

        double media = somaNotas / 3;
        System.out.println("Média: " + media);
    }
}