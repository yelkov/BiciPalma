package edu.badpals.bicipalma.domain;

import org.junit.Before;

public class TestBicicleta {

    Bicicleta bici = null;

    @Before
    public void setup() {
        this.bici = new Bicicleta(999);
    }
}