package es.djord.katarover;

public interface CalculadorCordenadas {

    public Coordenadas avanzar(Posicion posicion, Orientacion orientacion);

    public Coordenadas retroceder(Posicion posicion, Orientacion orientacion);

    public Coordenadas girarIzquierda(Posicion posicion, Orientacion orientacion);

    public Coordenadas girarDerecha(Posicion posicion, Orientacion orientacion);

}
