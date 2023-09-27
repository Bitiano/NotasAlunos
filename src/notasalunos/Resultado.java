package notasalunos;

public class Resultado {
    private Aluno aluno;
    private NotaDisciplina[] disciplinas;

    private String situacao;
    private int qtdAprovacoes;
    private int qtdReprovacoes;

    public Resultado(Aluno aluno, NotaDisciplina[] disciplinas) {
        this.aluno = aluno;
        this.disciplinas = disciplinas;
        this.situacao = "";
        this.qtdAprovacoes = 0;
        this.qtdReprovacoes = 0;
    }

    public Aluno getAluno() {
        return aluno;
    }

    public NotaDisciplina[] getDisciplinas() {
        return disciplinas;
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

    public void setDisciplinas(NotaDisciplina[] disciplinas) {
        this.disciplinas = disciplinas;
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

    public void calcularSituacao() {
        for (int i = 0; i < this.disciplinas.length; i++) {
            if (this.disciplinas[i].getMedia() >= 7) {
                this.qtdAprovacoes++;
            } else {
                this.qtdReprovacoes++;
            }
        }

        if (this.qtdReprovacoes > 0) {
            this.situacao = "Reprovado";
        } else {
            this.situacao = "Aprovado";
        }
    }

}
