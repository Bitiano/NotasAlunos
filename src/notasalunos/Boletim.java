package notasalunos;

public class Boletim {
    public Resultado avaliar (NotasAluno notasAluno) {
        Resultado resultado = new Resultado(notasAluno.getAluno(), notasAluno.getDisciplinas());
        int qtdAprovacoes = 0;
        int qtdReprovacoes = 0;
        for (NotaDisciplina notaDisciplina : notasAluno.getDisciplinas()) {
            if (VerificarSituacao(notaDisciplina.getMedia(), notaDisciplina.getFaltas()).equals("Aprovado")) {
                qtdAprovacoes++;
            } else {
                qtdReprovacoes++;
            }
        }
        if (qtdReprovacoes > 0) {
            resultado.setSituacao("Reprovado");
        } else {
            resultado.setSituacao("Aprovado");
        }
        resultado.setQtdAprovacoes(qtdAprovacoes);
        resultado.setQtdReprovacoes(qtdReprovacoes);
        return resultado;
    }

    public String VerificarSituacao (double media, int faltas) {
        if (media < 6) {
            return "DP por Nota";
        } 
        if (faltas > 4) {
            return "DP por Faltas";
        }  
        return "Aprovado";
    }
}
