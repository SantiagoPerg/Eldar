package Ejecutable;

import Clases.Operacion;
import Clases.Tarjeta;
import java.time.LocalDate;
import java.time.Month;
import java.util.Scanner;

public class Ejecutable {
    public static void main (String [] args){
        Ejecutable ejecutable = new Ejecutable();
        ejecutable.InfoTarjeta();
        ejecutable.ValidarOperacion();
        ejecutable.ValidarTarjeta();
        ejecutable.Operar();
    } 
    
    public void InfoTarjeta (){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese la marca de su tarjeta: ");
        String marca = scanner.nextLine();
        
        System.out.println("Ingrese numero de la tarjeta: ");
        int numeroTarjeta = Integer.parseInt (scanner.nextLine());
        
        System.out.println("Ingrese cardHolder(Nombre y Apellido): ");
        String cardHolder = scanner.nextLine();
        
        LocalDate fechaVencimiento = LocalDate.of(2022, Month.MARCH, 10);
                   
        Tarjeta tarjeta = new Tarjeta(marca, numeroTarjeta, cardHolder, fechaVencimiento);
            
        System.out.println(tarjeta.toString()); 
    }
    
    public void ValidarOperacion(){
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Ingrese el monto de la operacion: ");
        int monto = Integer.parseInt(scanner.nextLine());   
        Operacion operacion = new Operacion (monto);        
        System.out.println(operacion.OperacionValida());
    }
    
    public void ValidarTarjeta(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese la marca de su tarjeta: ");
        String marca = scanner.nextLine();
        
        System.out.println("Ingrese numero de la tarjeta: ");
        int numeroTarjeta = Integer.parseInt (scanner.nextLine());
        
        System.out.println("Ingrese cardHolder(Nombre y Apellido): ");
        String cardHolder = scanner.nextLine();
        
        LocalDate fechaVencimiento = LocalDate.of(2022, Month.JANUARY, 10);
                   
        Tarjeta tarjeta = new Tarjeta(marca, numeroTarjeta, cardHolder, fechaVencimiento);
        
        System.out.println(tarjeta.TarjetaValida());
    }
        
    public void Operar(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese la marca de su tarjeta: ");
        String marca = scanner.nextLine();
        
        System.out.println("Ingrese numero de la tarjeta: ");
        int numeroTarjeta = Integer.parseInt (scanner.nextLine());
        
        System.out.println("Ingrese cardHolder(Nombre y Apellido): ");
        String cardHolder = scanner.nextLine();
        
        LocalDate fechaVencimiento = LocalDate.of(2027, Month.JANUARY, 10);
                   
        Tarjeta tarjeta = new Tarjeta(marca.toUpperCase(), numeroTarjeta, cardHolder, fechaVencimiento);

        System.out.println("Ingrese el monto de la operacion: ");
        int monto = Integer.parseInt(scanner.nextLine());   
        Operacion operacion = new Operacion (monto); 
        
        float tasa = 0;
        switch(tarjeta.getMarca()){
            case "VISA":
                tasa = (float) (LocalDate.now().getYear()%100)/LocalDate.now().getMonthValue();
                break;
            case "NARA":
                tasa = (float) (LocalDate.now().getDayOfMonth() * 0.5);
                break;
            case "AMEX":
                tasa = (float) (LocalDate.now().getMonthValue() * 0.1);
                break;
        }
        System.out.println("La tasa de la operacion es: " + tasa);
        System.out.println("La marca de la tarjeta es: " + tarjeta.getMarca());
        System.out.println(operacion.toString());
    }
    
}
