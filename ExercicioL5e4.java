import java.util.Scanner;

public class ExercicioL5e4 {

     public static void main(String[] args) {
         
        Scanner teclado = new Scanner(System.in);
        
        
        System.out.println("Digite a unidade de medida: ");
        String c = teclado.nextLine();
        
        System.out.println("Digite a outra unidade de temperatura: ");
        String F = teclado.nextLine();

        double celsius = 32;
        
        double calculo = ((celsius * 1.8000) + 32.00);

        System.out.println("A temperatura convertida: " + calculo + "F" );
    }
    
}