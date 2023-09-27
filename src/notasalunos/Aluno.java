package notasalunos;

public class Aluno {
    private String nome;
    private int chamada;
    private String curso;
    private String turma;

    public Aluno(String nome, int chamada, String curso, String turma) {
        this.nome = nome;
        this.chamada = chamada;
        this.curso = curso;
        this.turma = turma;
    }

    public String getNome() {
        return nome;
    }

    public int getChamada(){
        return chamada;
    }

    public String getCurso() {
        return curso;
    }

    public String getTurma() {
        return turma;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setChamada(int chamada) {
        this.chamada = chamada;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    public void setTurma(String turma) {
        this.turma = turma;
    }    
}
