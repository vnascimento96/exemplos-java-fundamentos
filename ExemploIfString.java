import java.util.Scanner;
/**
 * exercicioL4e3
 */
public class ExemploIfString {

    public static void main(String[] args) {
        
        Scanner teclado = new Scanner(System.in);

        System.out.print("Nome: ");
        String nome = teclado.nextLine();

        // equals -> compara o texto porem diferencia caixa baixa de caixa alta 
        // equalsIgnoreCase -> compara texto porem ignorando caixa baixa de caixa alta
        if(nome.equals("Vitor")){
            System.out.println("IGUAL");
        }else {
            System.out.println("DIFERENTE");
            
        }

        while(!nome.equalsIgnoreCase("Vitor")){

            
        }



    }
}