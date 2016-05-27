package es.djord.katarover;

import org.junit.Assert;
import org.junit.Test;

import es.djord.katarover.CalculadorCoodenadasImpl;
import es.djord.katarover.Coordenadas;
import es.djord.katarover.Orientacion;
import es.djord.katarover.Posicion;

public class CalculadorCoodenadasTest {

    @Test
    public void girarDerecha() {
        CalculadorCoodenadasImpl calculador = new CalculadorCoodenadasImpl();
        Assert.assertEquals(Orientacion.E, calculador.girarDerecha(new Posicion(), Orientacion.N).getOrientacion());
    }

    @Test
    public void girarIzquierda() {
        CalculadorCoodenadasImpl calculador = new CalculadorCoodenadasImpl();
        Coordenadas coordenadas = new Coordenadas(Orientacion.N);
        Assert.assertEquals(Orientacion.O, calculador.girarIzquierda(new Posicion(), Orientacion.N).getOrientacion());
    }

}
