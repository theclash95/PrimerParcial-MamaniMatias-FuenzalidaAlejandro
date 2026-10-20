

public class Vehiculo {

private String patente;
private Double kilometraje;
private Boolean encendido;

public Vehiculo(String patente, Double kilometraje , Boolean encendido) {

    this.patente = patente ;

if (kilometraje < 0) {
    this.kilometraje =0.0;

} else {
    this.kilometraje = kilometraje;
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
        this.kilometraje += kilometraje; 
        System.out.println("Recorrio " + kilometraje + " los kilometros con exito");

    }
    else 
        if (!this.encendido) {
        System.out.println("No Recorrio los kilometros, el vehiculo esta apagado");


    } else {
        System.out.println("Los kilometros no se puede recorrer , deben ser mayor a 0");



    }

    


} public void mostrarDatos () {

System.out.println("Patente " + patente);
System.out.println("kilometraje " + kilometraje);
System.out.println("encendido " + encendido);


}


}