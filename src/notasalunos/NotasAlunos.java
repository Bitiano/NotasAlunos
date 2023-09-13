package notasalunos;

public class NotasAlunos {
    private Aluno aluno;
    private NotaDiciplina[] diciplinas;

    public NotasAlunos(Aluno aluno, NotaDiciplina[] diciplinas) {
        this.aluno = aluno;
        this.diciplinas = diciplinas;
    }

    public Aluno getAluno() {
        return aluno;
    }

    public NotaDiciplina[] getDiciplinas() {
        return diciplinas;
    }

    public void setAluno(Aluno aluno) {
        this.aluno = aluno;
    }

    public void setDiciplinas(NotaDiciplina[] diciplinas) {
        this.diciplinas = diciplinas;
    }

    public String toString() {
        return "NotasAlunos{" + "aluno=" + aluno + ", diciplinas=" + diciplinas + '}';
    }
}
