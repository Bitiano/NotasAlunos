package notasalunos;

public class Resultado {
    private Aluno aluno;
    private NotaDiciplina[] disciplina;

    private String situacao;
    private int qtdAprovacoes;
    private int qtdReprovacoes;

    public Resultado(Aluno aluno, NotaDiciplina[] disciplina, String situacao2, int qtdAprovacoes, int qtdReprovacoes) {
        this.aluno = aluno;
        this.disciplina = disciplina;
    }

    public void calcular() {
        for (NotaDiciplina notaDiciplina : disciplina) {
            if (notaDiciplina.getMedia() >= 6) {
                qtdAprovacoes++;
            } else {
                qtdReprovacoes++;
            }
        }

        if (qtdAprovacoes == disciplina.length) {
            situacao = "Aprovado";
        } else {
            situacao = "Reprovado";
        }
    }

    public Aluno getAluno() {
        return aluno;
    }

    public NotaDiciplina[] getDisciplina() {
        return disciplina;
    }

    public String getSituacao() {
        return situacao;
    }

    public int getQtdAprovacoes() {
        return qtdAprovacoes;
    }

    public int getQtdReprovacoes() {
        return qtdReprovacoes;
    }

    public void setAluno(Aluno aluno) {
        this.aluno = aluno;
    }

    public void setDisciplina(NotaDiciplina[] disciplina) {
        this.disciplina = disciplina;
    }

    public void setSituacao(String situacao) {
        this.situacao = situacao;
    }

    public void setQtdAprovacoes(int qtdAprovacoes) {
        this.qtdAprovacoes = qtdAprovacoes;
    }

    public void setQtdReprovacoes(int qtdReprovacoes) {
        this.qtdReprovacoes = qtdReprovacoes;
    }

}
