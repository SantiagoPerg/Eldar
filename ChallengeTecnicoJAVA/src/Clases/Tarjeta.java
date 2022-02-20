package Clases;

import java.time.LocalDate;
import java.util.Calendar;
import java.util.Date;


public class Tarjeta {
    
    private String marca;
    private int numeroTarjeta;
    private String cardholder;
    private LocalDate fechaVencimiento;

    public Tarjeta() {
        
    }

    public Tarjeta(String marca, int numeroTarjeta, String cardholder, LocalDate fechaVencimiento) {
        this.marca = marca;
        this.numeroTarjeta = numeroTarjeta;
        this.cardholder = cardholder;
        this.fechaVencimiento = fechaVencimiento;
        
    }

    @Override
    public String toString() {
        return "Tarjeta{" + "marca=" + marca + ", numeroTarjeta=" + numeroTarjeta + ", cardholder=" + cardholder + ", fechaVencimiento=" + fechaVencimiento + '}';
    }   
    
    public String TarjetaValida(){
        LocalDate fechaActual = LocalDate.now();       
        if (fechaActual.isBefore(this.fechaVencimiento)){
            return "Tarjeta Valida";
        }return "Tarjeta Invalida";
    }
    
    public String getMarca(){
        return this.marca;
    }
}
