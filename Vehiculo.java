
public class Vehiculo {

private String patente;
private Double kilometreje;
private Boolean encendido;

Public Vehiculo (String patente, double kilometreje , boolean encendido)  {

    this.patente = patente ;

if (kilometraje < 0 ) {
    this.kilometraje = 0;

} else {
    this.kilometraje = kilometreje;
}
this.encendido = false;
   
}


public void encender  () {

    if (this.encendido ){
        System.out.println("Vehiculo con patente " + patente + "esta encendido"); 

    } else {

        this. encendido = true;

         System.out.println("El Vehiculo esta encendido" ); 
    }




}

public void apagado () {
    if (this.encendido ) {
        System.out.println("Vehiculo con patente " + patente + "esta apagado");

    } 

     else {

        this. encendido = false;

         System.out.println("El Vehiculo esta apagado" ); 
    }


}

public void recorrer (double kilometraje) {
    if (this.encendido && kilometraje > 0) {
        this kilometraje += kilometraje; 
        System.out.println("Recorrio " + kilometraje + "esta apagado");

    }


} 


}