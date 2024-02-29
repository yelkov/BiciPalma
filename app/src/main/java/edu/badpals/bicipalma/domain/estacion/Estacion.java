package edu.badpals.bicipalma.domain.estacion;

public class Estacion {

    private final Integer id;
    private final String direccion;


    Estacion (Integer id, String direccion, int numeroAnclajes) {

        this.id = id;
        this.direccion = direccion;
    }

    private Integer getId() {
        return this.id;
    }

    private String getDireccion() {
        return this.direccion;
    }

    public String toString() {

    }

}
