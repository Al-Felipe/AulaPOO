import java.util.Scanner;
public class Aluno {
    private String nome;
    private String matricula;
    private float notaAv1;
    private float notaAv2;
    private float notaAE;
    private String curso;
    private String periodo;

    public Aluno (String name, String matri, float ntaAv1, float ntaAv2, String curs, String period){
       nome = name;
       matricula = matri;
       notaAv1 = ntaAv1;
       notaAv2 = ntaAv2;
       curso = curs;
       periodo = period;
    }

    Scanner input = new Scanner(System.in);
    float alteraNotaAV1() {
        System.out.println("Digite a nota da AV1: ");
        return this.notaAv1 = input.nextFloat();
    }
    float alteraNotaAV2() {
        System.out.println("Digite a nota da AV2: ");
        return this.notaAv2 = input.nextFloat();
    }

    float alteraNotaAE() {
       System.out.println("Digite a nota da AE: ");
       return this.notaAE = input.nextFloat();
    }

    String avaliarAluno () {
        return this.notaAv1 + this.notaAv2 >= 60 ? "Aprovado" : "Reprovado";
    }

    String avaliarRecuperação(float notaAE) {
        return (this.notaAv1 + this.notaAv2) / this.notaAE >= 60 ? "Aprovado" : "Reprovado";
    }

    public static void main(String[] args) {
        Aluno infoAluno = new Aluno("Maria", "1234567", 30, 40, "Educacao fisica", "Noite");
        infoAluno.alteraNotaAV1();
        infoAluno.alteraNotaAV2();
        System.out.println(infoAluno.avaliarAluno());
    }
}
