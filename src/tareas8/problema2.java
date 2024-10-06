
package tareas8;

import java.util.Scanner;
public class problema2 {

    public static void main(String[] args) {
        // Creando objeto de lectura
        Scanner lectura = new Scanner(System.in);
        //Variables
        int n, num, pares = 0, impares = 0, sumaPares = 0, sumaImpares = 0;
        //Entrada de datos
        System.out.print("Ingrese la cantidad de numeros: ");
        n = lectura.nextInt();
        //Proceso de datos
        for (int i = 1; i <= n; i++) {
            System.out.print("Ingrese el numero " + i + ": ");
            num = lectura.nextInt();

            if (num % 2 == 0) {
                pares++;
                sumaPares += num;
            } else {
                impares++;
                sumaImpares += num;
            }
        }
        //Salida de datos
        System.out.println("Cantidad de numeros pares: " + pares);
        System.out.println("Cantidad de numeros impares: " + impares);
        System.out.println("Suma de numeros pares: " + sumaPares);
        System.out.println("Suma de numeros impares: " + sumaImpares);
    }
}

    

