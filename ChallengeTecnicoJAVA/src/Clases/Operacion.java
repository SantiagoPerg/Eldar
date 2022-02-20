
package Clases;

import java.util.Scanner;

public class Operacion {
    
    private int monto;

    public Operacion(int monto) {
        this.monto = monto;
    }
    
    public Operacion (){
       
    }

    @Override
    public String toString() {
        return "Operacion{" + "monto=" + monto + '}';
    }
    

    public String OperacionValida(){
        if (monto < 1000){
            return "Tarjeta Valida";
        }return "Tarjeta Invalida";
    }
}   
