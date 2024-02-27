package edu.badpals.bicipalma.domain.estacion;

import org.junit.Test;

import static org.junit.Assert.assertEquals;


public class TestAnclajes {

    @Test
    public void toStringTest() {
        Anclajes anclajes = new Anclajes(6);
        assertEquals("Numero de anclajes: 6", anclajes.toString());
    }

}

