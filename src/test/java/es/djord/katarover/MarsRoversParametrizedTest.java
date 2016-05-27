package es.djord.katarover;

import static org.junit.Assert.assertEquals;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameter;
import org.junit.runners.Parameterized.Parameters;

import es.djord.katarover.Command;
import es.djord.katarover.CommandAvanzar;
import es.djord.katarover.CommandGirarDerecha;
import es.djord.katarover.CommandGirarIzquierda;
import es.djord.katarover.MarsRover;
import es.djord.katarover.Orientacion;
import es.djord.katarover.Posicion;

@RunWith(Parameterized.class)
public class MarsRoversParametrizedTest {

    @Parameters
    public static Collection<Object[]> data() {
        return Arrays.asList(new Object[][] {
                // Movimiento
                { new Posicion(0, 0), Orientacion.N, new CommandAvanzar(), new Posicion(0, 1), Orientacion.N },
                { new Posicion(0, 0), Orientacion.S, new CommandAvanzar(), new Posicion(0, -1), Orientacion.S },
                { new Posicion(0, 0), Orientacion.E, new CommandAvanzar(), new Posicion(1, 0), Orientacion.E },
                { new Posicion(0, 0), Orientacion.O, new CommandAvanzar(), new Posicion(-1, 0), Orientacion.O },


                // Giro
                { new Posicion(0, 0), Orientacion.N, new CommandGirarIzquierda(), new Posicion(0, 0), Orientacion.O },
                { new Posicion(0, 0), Orientacion.O, new CommandGirarIzquierda(), new Posicion(0, 0), Orientacion.S },
                { new Posicion(0, 0), Orientacion.S, new CommandGirarIzquierda(), new Posicion(0, 0), Orientacion.E },
                { new Posicion(0, 0), Orientacion.E, new CommandGirarIzquierda(), new Posicion(0, 0), Orientacion.N },

                { new Posicion(0, 0), Orientacion.N, new CommandGirarDerecha(), new Posicion(0, 0), Orientacion.E },
                { new Posicion(0, 0), Orientacion.O, new CommandGirarDerecha(), new Posicion(0, 0), Orientacion.N },
                { new Posicion(0, 0), Orientacion.S, new CommandGirarDerecha(), new Posicion(0, 0), Orientacion.O },
                { new Posicion(0, 0), Orientacion.E, new CommandGirarDerecha(), new Posicion(0, 0), Orientacion.S }, });
    }

    // Importante que sean public
    @Parameter(value = 0)
    public Posicion inicio;

    @Parameter(value = 1)
    public Orientacion orientacion;

    @Parameter(value = 2)
    public Command comando;

    @Parameter(value = 3)
    public Posicion posicionEsperada;

    @Parameter(value = 4)
    public Orientacion orientacionEsperada;

    @Test
    public void test() {

        MarsRover mars = new MarsRover(this.inicio, this.orientacion);

        mars.ejecutarComando(this.comando);

        assertEquals(this.posicionEsperada, mars.getPosicion());
        assertEquals(this.orientacionEsperada, mars.getOrientacion());
    }
}
