package es.djord.katarover;

public class CommandAvanzar extends Command {

    @Override
    public Coordenadas execute(CalculadorCordenadas calculadorCoordenadas, Coordenadas coordenadas) {
        return calculadorCoordenadas.avanzar(coordenadas.getPosicion(), coordenadas.getOrientacion());
    }

}
