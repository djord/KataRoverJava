package es.djord.katarover;

public class CommandRetroceder extends Command {

    @Override
    public Coordenadas execute(CalculadorCordenadas calculadorCoordenadas, Coordenadas coordenadas) {
        return calculadorCoordenadas.retroceder(coordenadas.getPosicion(), coordenadas.getOrientacion());
    }

}
