package notasalunos;

public class NotaDisciplina {
    private String disciplina;
    private double media;
    private int faltas; 

    public NotaDisciplina(String disciplina, double media, int faltas) {
        this.disciplina = disciplina;
        this.media = media;
        this.faltas = faltas;
    }

    public String getDisciplina() {
        return disciplina;
    }

    public double getMedia() {
        return media;
    }

    public int getFaltas() {
        return faltas;
    }

    public void setDisciplina(String disciplina) {
        this.disciplina = disciplina;
    }

    public void setMedia(double media) {
        this.media = media;
    }

    public void setFaltas(int faltas) {
        this.faltas = faltas;
    }
}
