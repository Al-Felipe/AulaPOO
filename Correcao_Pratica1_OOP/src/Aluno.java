public class Aluno {
    private String nome;
    private String matricula;
    private float notaAv1;
    private float notaAv2;
    private float notaAE;
    private String curso;
    private String periodo;

    public Aluno (String name, String matri, float ntaAv1, float ntaAv2, String curs, String period){
       this.nome = name;
       this.matricula = matri;
       this.notaAv1 = ntaAv1;
       this.notaAv2 = ntaAv2;
       this.curso = curs;
       this.periodo = period;
    }
    public void alteraNotaAV1(float nota) {;
         this.notaAv1 = nota;
    }
    public void alteraNotaAV2(float nota) {
        this.notaAv2 = nota;
    }

    public void alteraNotaAE(float nota) {
        this.notaAE = nota;
    }
    public void avaliarAluno () {
        if((this.notaAv1 + this.notaAv2) >= 60)
            System.out.println("Aprovado");
        else
            System.out.println("Recuperacao");
    }

    public void avaliarRecuperaca(float notaAE) {
        if(((this.notaAv1 + this.notaAv2 + notaAE)/2) >= 60)
            System.out.println("Aprovado");
        else
            System.out.println("Reprovado");
    }

    public static void main(String[] args) {
        Aluno infoAluno = new Aluno("Maria", "1234567", 30, 40, "Educacao fisica", "Noite");
        infoAluno.avaliarRecuperaca(80);
    }
}
