package edu.badpals.bicipalma.domain.estacion;

import edu.badpals.bicipalma.domain.bicicleta.Bicicleta;
import org.junit.Test;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

public class TestEstacion {

    @Test
    public void constructorEstacionTest() {
        Estacion estacion = new Estacion(1, "Manacor", 6);
        assertNotNull(estacion);
        assertEquals("id: 1 \ndireccion: Manacor \nanclajes: 6", estacion.toString());
    }
    @Test
    public void anclajesLibresTest() {
        Estacion estacion = new Estacion(1, "Manacor", 6);
        assertEquals(6, estacion.anclajesLibres());

        estacion = new Estacion(1, "Manacor", 0);
        assertEquals(0, estacion.anclajesLibres());
    }

    @Test
    public void anclarBicicletaTest() {
        Estacion estacion = new Estacion(1, "Manacor", 6);
        estacion.anclarBicicleta(new Bicicleta(911));
        assertEquals(5, estacion.anclajesLibres());
        // cubrir branch del stream
        estacion.anclarBicicleta(new Bicicleta(922));
        assertEquals(4, estacion.anclajesLibres());

        // cubrir else
        estacion = new Estacion(1, "Manacor", 0);
        estacion.anclarBicicleta(new Bicicleta(911));
        assertEquals(0, estacion.anclajesLibres());
    }
    @Test
    public void anclajesLibres_bici_anclada_Test() {

        // cubrir las dos ramas de !a.isOcupado()
        Estacion estacion = new Estacion(1, "Manacor", 1);
        estacion.anclarBicicleta(new Bicicleta(999));
        assertEquals(0, estacion.anclajesLibres());
    }
}
