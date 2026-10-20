import java.util.Scanner;

public class Main {

    public static void main ( String [] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese la patente ");
        String patente = scanner.nextLine();

        System.out.println("Ingrese la kilometraje ");
        double kilometrajeInicial = scanner.nextDouble();

        
        Vehiculo miVehiculo = new Vehiculo(patente, kilometrajeInicial, false );


        System.out.println("Ingrese la cantidad de km a recorrer  ");
        double kilometrajeArecorrer = scanner.nextDouble();

        System.out.println("Intentando recorrer con el vehiculo apagado");
        miVehiculo.recorrer(kilometrajeArecorrer);
        

        System.out.println("Encendiendo el vehiculo");
        miVehiculo.encender();

        System.out.println("Intentando recorrer con el vehiculo encendido");
        miVehiculo.recorrer(kilometrajeArecorrer);

        miVehiculo.mostrarDatos();

        scanner.close();

        





    }

    
}