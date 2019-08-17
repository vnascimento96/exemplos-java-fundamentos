import java.util.Scanner;

/**
 * ExercicioL4e5
 */
public class ExercicioL4e5 {

    public static void main(String[] args) {
        
        Scanner teclado = new Scanner(System.in);

        System.out.println("Valor conta de LUZ: ");
        double luz = Double.parseDouble(teclado.nextLine());

        System.out.println("Valor conta da ÀGUA: ");
        double agua = Double.parseDouble(teclado.nextLine());

        System.out.println("Valor conta da NET: ");
        double net = Double.parseDouble(teclado.nextLine());

        System.out.println("Valor conta da VIVO: ");
        double vivo = Double.parseDouble(teclado.nextLine());

        System.out.println("Valor conta da OI: ");
        double oi = Double.parseDouble(teclado.nextLine());

        System.out.println("Valor conta do IPTU: ");
        double iptu = Double.parseDouble(teclado.nextLine());

        System.out.println("Valor conta do IPVA: ");
        double ipva = Double.parseDouble(teclado.nextLine());

        System.out.println("Valor licenciamento do Carro: ");
        double licenciamentoCarro = Double.parseDouble(teclado.nextLine());

        System.out.println("Valor licenciamento do Iate: ");
        double licenciamentoIate = Double.parseDouble(teclado.nextLine());

        System.out.println("Valor seguro do Carro: ");
        double seguroCarro = Double.parseDouble(teclado.nextLine());

        System.out.println("Valor do seguro da Casa");
        double seguroCasa = Double.parseDouble(teclado.nextLine());

        System.out.println("Valor do seguro do Iate: ");
        double seguroIate = Double.parseDouble(teclado.nextLine());

        System.out.println("Valor do combustível do Carro: ");
        double combustivelCarro = Double.parseDouble(teclado.nextLine());

        System.out.println("Valor combustível do Iate");
        double combustivelIate = Double.parseDouble(teclado.nextLine());

        System.out.println("Valor total das contas telefonicas: " + (vivo + oi));
        System.out.println("Valor total dos impostos: " + (iptu + ipva));
        System.out.println("Valor total dos seguros: " + (seguroCarro + seguroIate + seguroCasa));
        System.out.println("Valor total de combustivel: " + (combustivelCarro + combustivelIate));
        System.out.println("Valor outras contas: " + (net + luz + agua + licenciamentoCarro + licenciamentoIate));
        System.out.println("Valor total das contas: " + (vivo + oi + iptu + ipva + seguroCarro + seguroCasa + seguroIate + combustivelCarro + combustivelIate + net + luz + agua + licenciamentoCarro + licenciamentoIate));

    }
}