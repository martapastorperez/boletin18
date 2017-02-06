package boletin18;

public class Correo {

    String contido;
    boolean leido;

    public Correo() {
    }

    public Correo(String contido, boolean leido) {
        this.contido = contido;
        this.leido = leido;
    }

    public String getContido() {
        return contido;
    }

    public boolean getLeido() {
        return leido;
    }

    public void setContido(String contido) {
        this.contido = contido;
    }

    public void setLeido(boolean leido) {
        this.leido = leido;
    }

    @Override
    public String toString() {
        return "Correo{" + "contido=" + contido + ", leido=" + leido + '}';
    }

}
