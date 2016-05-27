package es.djord.katarover;

import java.util.List;

public class MarsRover {

    private Coordenadas coordenadas;

    private CalculadorCordenadas calculadorCoordenadas;

    public MarsRover() {
        this(new Posicion(), Orientacion.N);
    }

    public MarsRover(Posicion punto, Orientacion orientacion) {
        this(new Coordenadas(punto, orientacion));
    }

    public MarsRover(Coordenadas coordenadas) {
        super();
        this.coordenadas = coordenadas;
        this.calculadorCoordenadas = new CalculadorCoodenadasImpl();
    }

    public Orientacion getOrientacion() {
        return this.coordenadas.getOrientacion();
    }
    
    public Posicion getPosicion() {
        return this.coordenadas.getPosicion();
    }

    public Coordenadas getCoordenadas() {
        return this.coordenadas;
    }

    public void setCoordenadas(Coordenadas coordenadas) {
        this.coordenadas = coordenadas;
    }

    public void ejecutarComando(Command comando) {
        this.coordenadas = comando.execute(this.calculadorCoordenadas, this.coordenadas);
    }

    public void ejecutarComando(List<Command> comandos) {
        for (Command comando : comandos) {
            this.ejecutarComando(comando);
        }
    }
}
