package notasalunos;

public class NotaDiciplina {
    private String diciplina;
    private double media;
    private int faltas;

    public NotaDiciplina(String diciplina, double media, int faltas) {
        this.diciplina = diciplina;
        this.media = media;
        this.faltas = faltas;
    }

    public String getDiciplina() {
        return diciplina;
    }   

    public double getMedia() {
        return media;
    }

    public int getFaltas() {
        return faltas;
    }

    public void setDiciplina(String diciplina) {
        this.diciplina = diciplina;
    }

    public void setMedia(double media) {
        this.media = media;
    }

    public void setFaltas(int faltas) {
        this.faltas = faltas;
    }

    public String toString() {
        return "NotaDiciplina{" + "diciplina=" + diciplina + ", media=" + media + ", faltas=" + faltas + '}';
    }
}
