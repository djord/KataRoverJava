package es.djord.katarover;

public class CommandGirarDerecha extends Command {


    @Override
    public Coordenadas execute(CalculadorCordenadas calculadorCoordenadas, Coordenadas coordenadas) {
        return calculadorCoordenadas.girarDerecha(coordenadas.getPosicion(), coordenadas.getOrientacion());
    }

}
