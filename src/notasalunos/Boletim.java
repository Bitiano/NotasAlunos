package notasalunos;

public class Boletim {
    public Resultado avaliar(NotasAlunos notasAlunos) {
        Aluno aluno = notasAlunos.getAluno();
        NotaDiciplina[] diciplinas = notasAlunos.getDiciplinas();
        
        int qtdAprovacoes = 0;
        int qtdReprovacoes = 0;
        
        for (NotaDiciplina notaDiciplina : diciplinas) {
            if (notaDiciplina.getMedia() >= 6) {
                qtdAprovacoes++;
            } else {
                qtdReprovacoes++;
            }
        }
        
        String situacao;
        if (qtdAprovacoes == diciplinas.length) {
            situacao = "Aprovado";
        } else {
            situacao = "Reprovado";
        }
        Resultado resultado = new Resultado(aluno, diciplinas, situacao, qtdAprovacoes, qtdReprovacoes);
        resultado.setSituacao(situacao);
        return resultado;
    }

    public String verificarSituacao(double media, int faltas){
        if (media >= 6 && faltas <= 4) {
            return "Aprovado";
        } else {
            return "Reprovado";
        }
    }
}
