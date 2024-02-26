package edu.badpals.bicipalma.domain;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class Bicicleta {

    private Integer id = 0;

    public Bicicleta (int id) {
        this.id = id;
    }

    public Integer getId () {
        return this.id ;
    }

    @Override
    public String toString(){
        return getId().toString();
    }
}
