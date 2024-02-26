package edu.badpals.bicipalma.domain.anclaje;

import edu.badpals.bicipalma.domain.bicicleta.Bicicleta;
import edu.badpals.bicipalma.domain.estacion.Anclaje;
import org.junit.Test;

import static org.junit.Assert.assertTrue;

public class TestAnclaje {

    @Test
    public void anclarBiciTest() {
        Anclaje anclaje = new Anclaje();
        anclaje.anclarBici(new Bicicleta(911));
        assertTrue(anclaje.isOcupado());
    }

}
