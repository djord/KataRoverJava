package es.djord.katarover;

public class Coordenadas {
    private Posicion posicion;

    private Orientacion orientacion;

    public Coordenadas(Orientacion orientacion) {
        super();
        this.posicion = new Posicion();
        this.orientacion = orientacion;
    }

    public Coordenadas(Posicion posicion, Orientacion orientacion) {
        super();
        this.posicion = posicion;
        this.orientacion = orientacion;
    }

    public Orientacion getOrientacion() {
        return this.orientacion;
    }

    public void setOrientacion(Orientacion orientacion) {
        this.orientacion = orientacion;
    }

    public Posicion getPosicion() {
        return this.posicion;
    }

    public void setPosicion(Posicion posicion) {
        this.posicion = posicion;
    }

}
