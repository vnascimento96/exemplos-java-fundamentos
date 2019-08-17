public class ExemploFor04 {

    public static void main(String[] args) throws InterruptedException {
        
        for(int hora = 0; hora <= 23; hora = hora + 1){
            for(int minuto = 0; minuto <= 59; minuto = minuto + 1){
                for(int segundo = 0; segundo <= 59; segundo = segundo + 1){
                    System.out.println(hora + ":" + minuto + ":" + segundo);
                    Thread.sleep(1000);
                }
            }
        }

    }
}