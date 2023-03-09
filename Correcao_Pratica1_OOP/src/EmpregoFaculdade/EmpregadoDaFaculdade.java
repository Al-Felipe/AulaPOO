package EmpregoFaculdade;

public class EmpregadoDaFaculdade {
    private String nome;
    private double salario;
    private int horasAula;

    public EmpregadoDaFaculdade(String name, double sal, int horAula) {
        nome = name;
        salario = sal;
        horasAula = horAula;
    }

    double getGastos(){
        return this.salario + this.horasAula * 40;
    }
    String getInfo(){
        return "nome: " + this.nome + " com salário " + this.getGastos();
    }

    public static void main(String[] args) {
      EmpregadoDaFaculdade Funcionario = new EmpregadoDaFaculdade("Joao", 2500, 4);
        System.out.println( Funcionario.getGastos());
        System.out.println( Funcionario.getInfo());
    }

}
