import java.util.Scanner;

/**
 * exercicioL4e3
 */
public class exercicioL4e3 {

    public static void main(String[] args) {
        
        Scanner teclado = new Scanner(System.in);
        
        System.out.println("Digite um numero para saber a tabuada dele: ");
    
        int numero = Integer.parseInt(teclado.nextLine());
      

        System.out.println(numero + " x 0: " + numero * 0);
        System.out.println(numero + " x 1: " + numero * 1);
        System.out.println(numero + " x 2: " + numero * 2);
        System.out.println(numero + " x 3: " + numero * 3);
        System.out.println(numero + " x 4: " + numero * 4);
        System.out.println(numero + " x 5: " + numero * 5);
        

    }
}