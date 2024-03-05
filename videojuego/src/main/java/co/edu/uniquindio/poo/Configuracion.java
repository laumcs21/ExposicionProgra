package co.edu.uniquindio.poo;

public class Configuracion {
    private Configuracion configuracion;
    private Dificultad dificultad;
    private short volumenSonido;
    private short volumenMusica;

    private Configuracion(Dificultad dificultad, short volumenSonido, short volumenMusica) {
        this.dificultad = dificultad;
        this.volumenMusica = volumenMusica;
        this.volumenSonido = volumenSonido;

        assert volumenMusica >= 0 & volumenMusica <= 100;
        assert volumenSonido >= 0 & volumenMusica <= 100;
    }

    public Configuracion getConfiguracion() {
        if (configuracion == null) {
            configuracion = new Configuracion(dificultad, volumenSonido, volumenMusica);
        }

        return configuracion;
    }

    public Dificultad getDificultad() {
        return this.dificultad;
    }

    public Short getVolumenSonido() {
        return this.volumenSonido;
    }

    public Short getVolumenMusica() {
        return this.volumenMusica;
    }

    public void setDificultad(Dificultad dificultad) {
        this.dificultad = dificultad;
    }

    public void setVolumenMusica(short volumenMusica) {
        this.volumenMusica = volumenMusica;
    }

    public void setVolumenSonido(short volumenSonido) {
        this.volumenSonido = volumenSonido;
    }
}
