package es.djord.katarover;

import org.junit.Assert;
import org.junit.Test;

import es.djord.katarover.Orientacion;

public class OrientacionTest {

    @SuppressWarnings("boxing")
    @Test
    public void isEjeY() {
        Assert.assertEquals(true, Orientacion.N.isEjeY());
    }
}
