
package tareas8;

import java.util.Scanner;
public class problema1 {

    public static void main(String[] args) {
        // Creando objeto de lectura
        Scanner lectura = new Scanner(System.in);
        //Variables
        int brasil = 0;
        int usa = 0;
        String nombreVelocidadMax = "";
        double velocidadMax = 0;
        //Entrada de datos
        System.out.print("Ingrese el numero de atletas: ");
        int numAtletas = lectura.nextInt();
        //Proceso de datos 
        for (int i = 1; i <= numAtletas; i++) {
            System.out.println("Ingrese los datos del atleta " + i + ":");

            System.out.print("Nombre: ");
            String nombre = lectura.next();

            System.out.print("Pais (Brasil/USA): ");
            String pais = lectura.next();

            System.out.print("Velocidad (m/s): ");
            double velocidad = lectura.nextDouble();

            if (pais.equalsIgnoreCase("Brasil")) {
                brasil++;
            } else if (pais.equalsIgnoreCase("USA")) {
                usa++;
            }

            if (velocidad > velocidadMax) {
                velocidadMax = velocidad;
                nombreVelocidadMax = nombre;
            }
        }

        //Salida de datos
        System.out.println("Cantidad de atletas de Brasil: " + brasil);
        System.out.println("Cantidad de atletas de USA: " + usa);
        System.out.println("Nombre del atleta con la mayor velocidad: " + nombreVelocidadMax);
        System.out.println("Mayor velocidad: " + velocidadMax + " m/s");
    }
}

        
    
    

