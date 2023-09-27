package notasalunos;

public class NotasAluno {
    private Aluno aluno;
    private NotaDisciplina[] disciplinas;

    public NotasAluno(Aluno aluno, NotaDisciplina[] disciplinas) {
        this.aluno = aluno;
        this.disciplinas = disciplinas;
    }

    public Aluno getAluno() {
        return aluno;
    }

    public NotaDisciplina[] getDisciplinas() {
        return disciplinas;
    }

    public void setAluno(Aluno aluno) {
        this.aluno = aluno;
    }

    public void setDisciplinas(NotaDisciplina[] disciplinas) {
        this.disciplinas = disciplinas;
    }
}
