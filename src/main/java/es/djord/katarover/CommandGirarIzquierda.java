package es.djord.katarover;

public class CommandGirarIzquierda extends Command {

    @Override
    public Coordenadas execute(CalculadorCordenadas calculadorCoordenadas, Coordenadas coordenadas) {
        return calculadorCoordenadas.girarIzquierda(coordenadas.getPosicion(), coordenadas.getOrientacion());
    }


}
