
package edu.badpals.bicipalma.domain.estacion;
import edu.badpals.bicipalma.domain.bicicleta.Bicicleta;


public class Anclaje {

    private boolean ocupado = false;
    private Bicicleta bici;

    public Anclaje () {}

    boolean isOcupado(){
        return this.ocupado;
    }

    Bicicleta getBici (){
        return this.bici;
    }

    void anclarBici(Bicicleta bici) {
        this.bici = bici;
        this.ocupado = true;
    }

    void liberarBici() {
        this.bici = null;
        this.ocupado = false;
    }

}
