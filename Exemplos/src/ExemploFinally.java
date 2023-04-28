import java.util.Scanner;

public class ExemploFinally {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        try{
            int dividendo,divisor;
            System.out.println("digite o valor do dividendo");
            dividendo = s.nextInt();
            System.out.println("digite o valor do divisor");
            divisor = s.nextInt();

            if (divisor == 0){
                throw new Exception("Não eh permitivo fazer uma divisao por zero");

            }
            System.out.println(dividendo+ " / " +divisor+ "=" +(dividendo / divisor));

        } catch(Exception ex){
            System.out.println(" erro " +ex.getMessage());

        }
        finally {
            System.out.println("bloco finally.");
        }

    }
}