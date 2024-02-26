package edu.badpals.bicipalma.domain.bicicleta;

public class Bicicleta {

    private final Integer id;

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
