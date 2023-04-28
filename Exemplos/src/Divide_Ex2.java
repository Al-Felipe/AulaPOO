public class Divide_Ex2 {
    public static void main(String[] args) {
        try {
            int dividendo = Integer.parseInt(args[0]);
            int divisor = Integer.parseInt(args[1]);
        } catch (ArithmeticException e1) {
            System.out.println("Nao pode dividir por zero");
        } catch (ArrayIndexOutOfBoundsException e2) {
            System.out.println("Favor informar dois numeros");
        }
    }
    public static void divide(int dividendo, int divisor){
        System.out.println("Divisao = " + (dividendo/divisor));
    }
}
