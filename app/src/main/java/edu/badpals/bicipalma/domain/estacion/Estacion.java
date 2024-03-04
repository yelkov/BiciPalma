package edu.badpals.bicipalma.domain.estacion;

import edu.badpals.bicipalma.domain.bicicleta.Bicicleta;
import edu.badpals.bicipalma.domain.tarjetaUsuario.Autenticacion;

public class Estacion {

    private final Integer id;
    private final String direccion;
    private final Anclajes anclajes;


    Estacion(Integer id, String direccion, int numeroAnclajes) {

        this.id = id;
        this.direccion = direccion;
        this.anclajes = new Anclajes(numeroAnclajes);
    }

    private Integer getId() {
        return this.id;
    }

    private String getDireccion() {
        return this.direccion;
    }

    private int numAnclajes() {
        return this.anclajes.numAnclajes();
    }

    public String toString() {
        return "id: " + this.getId() + " \ndireccion: " + this.getDireccion() + " \nanclajes: " + this.numAnclajes();
    }

    private Anclaje[] anclajes() {
        return this.anclajes.anclajes();
    }

    public int anclajesLibres() {
        int numeroAnclajesLibres = 0;
        for (Anclaje anclaje : anclajes()) {
            if (anclaje.isOcupado()){
                continue;
            }else{
                numeroAnclajesLibres += 1;
            }
        }return numeroAnclajesLibres;
    }
    public void anclarBicicleta(Bicicleta bici){
        for (int i = 0; i < anclajes().length; i++ ){
            if (anclajes()[i].isOcupado()){
                continue;
            }else{
                anclajes.ocuparAnclaje(i,bici);
                break;
        }
    }
}
    public boolean leerTarjetaUsuario(Autenticacion tarjeta){
        return tarjeta.isActivada();
    }
}
