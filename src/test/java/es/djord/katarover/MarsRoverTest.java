package es.djord.katarover;

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

import es.djord.katarover.Command;
import es.djord.katarover.CommandAvanzar;
import es.djord.katarover.CommandGirarDerecha;
import es.djord.katarover.CommandGirarIzquierda;
import es.djord.katarover.CommandRetroceder;
import es.djord.katarover.MarsRover;
import es.djord.katarover.Orientacion;
import es.djord.katarover.Posicion;

public class MarsRoverTest {
    
    @Test
    public void comprobarPuntoInicialTest() {
        Posicion punto = new Posicion(0, 0);
        MarsRover rover = new MarsRover();

        assertEquals(punto, rover.getPosicion());
        assertEquals(Orientacion.N, rover.getOrientacion());
    }

    @Test
    public void comprobarAvanzarNorteTest() {
        Posicion punto = new Posicion(0, 1);

        MarsRover rover = new MarsRover();
        rover.ejecutarComando(new CommandAvanzar());
        Posicion posicionFinal = rover.getPosicion();
        
        assertEquals(punto, posicionFinal);
        assertEquals(Orientacion.N, rover.getOrientacion());
    }

    @Test
    public void comprobarRetrocederNorteTest() {
        Posicion punto = new Posicion(0, -1);
        MarsRover rover = new MarsRover();

        rover.ejecutarComando(new CommandRetroceder());

        assertEquals(punto, rover.getPosicion());
        assertEquals(Orientacion.N, rover.getOrientacion());
    }

    @Test
    public void comprobarGirarDerechaNorteTest() {
        Posicion punto = new Posicion(0, 0);
        MarsRover rover = new MarsRover();

        rover.ejecutarComando(new CommandGirarDerecha());

        assertEquals(punto, rover.getPosicion());
        assertEquals(Orientacion.E, rover.getOrientacion());
    }

    @Test
    public void comprobarGirarIzquierdaNorteTest() {
        Posicion punto = new Posicion(0, 0);
        MarsRover rover = new MarsRover();

        rover.ejecutarComando(new CommandGirarIzquierda());

        assertEquals(punto, rover.getPosicion());
        assertEquals(Orientacion.O, rover.getOrientacion());
    }

    @Test
    public void comprarlistaComandos() {
        Posicion punto = new Posicion(0, 3);
        MarsRover rover = new MarsRover();

        List<Command> comandos = new ArrayList<Command>();
        comandos.add(new CommandAvanzar());
        comandos.add(new CommandAvanzar());
        comandos.add(new CommandAvanzar());

        rover.ejecutarComando(comandos);

        assertEquals(punto, rover.getPosicion());
        assertEquals(Orientacion.N, rover.getOrientacion());
    }

    // { new Posicion(0, 0), Orientacion.N, "RRR", new Posicion(3, 0), Orientacion.N },
    // { new Posicion(0, 0), Orientacion.O, "RRR", new Posicion(0, -3), Orientacion.O },
    // { new Posicion(0, 0), Orientacion.N, "RAR", new Posicion(1, 0), Orientacion.N },

}
