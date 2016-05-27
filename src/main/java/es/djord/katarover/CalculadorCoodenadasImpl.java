package es.djord.katarover;

public class CalculadorCoodenadasImpl implements CalculadorCordenadas {

    // public Coordenadas avanzar(Posicion posicion, Orientacion orientacion) {
    // Posicion posicionFinal;
    // int incremento = getIncremento(orientacion);
    // if (orientacion.isEjeY()) {
    // posicionFinal = posicion.incrementarY(incremento);
    // } else {
    // posicionFinal = posicion.incrementarX(incremento);
    // }
    // return new Coordenadas(posicionFinal, orientacion);
    // }

    public Coordenadas avanzar(Posicion posicion, Orientacion orientacion) {
        int incremento = getIncrementoAvanzar(orientacion);
        return mover(posicion, orientacion, incremento);
    }

    public Coordenadas retroceder(Posicion posicion, Orientacion orientacion) {
        int incremento = getIncrementoRetroceder(orientacion);
        return mover(posicion, orientacion, incremento);
    }

    private Coordenadas mover(Posicion posicion, Orientacion orientacion, int incremento) {
        Posicion posicionFinal;
        if (orientacion.isEjeY()) {
            posicionFinal = posicion.incrementarY(incremento);
        } else {
            posicionFinal = posicion.incrementarX(incremento);
        }
        return new Coordenadas(posicionFinal, orientacion);
    }

    private int getIncrementoAvanzar(Orientacion orientacion) {
        if(orientacion.isOrientacionPositiva()){
            return +1;
        }
        return -1;
    }

    private int getIncrementoRetroceder(Orientacion orientacion) {
        if (orientacion.isOrientacionPositiva()) {
            return -1;
        }
        return +1;
    }

    public Coordenadas girarIzquierda(Posicion posicion, Orientacion orientacion) {
        Orientacion orientacionFinal = getAnteriorOrientacion(orientacion);
        return new Coordenadas(posicion, orientacionFinal);
    }

    public Coordenadas girarDerecha(Posicion posicion, Orientacion orientacion) {
        Orientacion orientacionFinal = getSiguienteOrientacion(orientacion);
        return new Coordenadas(posicion, orientacionFinal);
    }

    private Orientacion getSiguienteOrientacion(Orientacion orientacion) {
        if (orientacion.isUtimoOrdinal()) {
            return Orientacion.N;
        }
        int ordinal = orientacion.ordinal();
        return Orientacion.values()[++ordinal];
    }

    private Orientacion getAnteriorOrientacion(Orientacion orientacion) {
        if (orientacion.isPrimerOrdinal()) {
            return Orientacion.O;
        }
        int ordinal = orientacion.ordinal();
        return Orientacion.values()[--ordinal];
    }

}
