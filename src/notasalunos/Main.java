package notasalunos;

public class Main {
    public static void main(String[] args) {
        Aluno aluno = new Aluno("João", 1, "ads", "D");
        NotaDiciplina[] diciplinas = new NotaDiciplina[3];
        diciplinas[0] = new NotaDiciplina("Matemática", 10, 2);
        diciplinas[1] = new NotaDiciplina("Português", 10, 3);
        diciplinas[2] = new NotaDiciplina("História", 10, 1);

        NotasAlunos notasAlunos = new NotasAlunos(aluno, diciplinas);

        Boletim boletim = new Boletim();
        Resultado resultado = boletim.avaliar(notasAlunos);

        System.out.println("O resultado da avaliacão é foi: " + resultado.getSituacao() + "no curso : " + aluno.getCurso() + "sendo avaliado nas seguintes materias");

        for (NotaDiciplina notaDiciplina : diciplinas) {
            System.out.println("Diciplina: " + notaDiciplina.getDiciplina() + "media " + notaDiciplina.getMedia() + "e com " + notaDiciplina.getFaltas() + "faltas");
        }
    }
}
