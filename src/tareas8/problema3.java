
package tareas8;

import java.util.Scanner;
public class problema3 {
    public static void main(String[] args) {
        // Creando objeto de lectura
        Scanner scanner = new Scanner(System.in);
        //Variables
        String mesActual = "", mesMayorGasto = "";
        double gastoActual = 0, totalGastos = 0, mayorGasto = 0, promedioMensual; 
        //Proceso de datos
        for (int i = 1; i <= 12; i++) {
            switch (i) {
                case 1: mesActual = "Enero"; break;
                case 2: mesActual = "Febrero"; break;
                case 3: mesActual = "Marzo"; break;
                case 4: mesActual = "Abril"; break;
                case 5: mesActual = "Mayo"; break;
                case 6: mesActual = "Junio"; break;
                case 7: mesActual = "Julio"; break;
                case 8: mesActual = "Agosto"; break;
                case 9: mesActual = "Septiembre"; break;
                case 10: mesActual = "Octubre"; break;
                case 11: mesActual = "Noviembre"; break;
                case 12: mesActual = "Diciembre"; break;
            }
            System.out.print("Ingrese el gasto de " + mesActual + ": ");
            gastoActual = scanner.nextDouble();
            totalGastos += gastoActual;
            
            if (gastoActual > mayorGasto) {
                mayorGasto = gastoActual;
                mesMayorGasto = mesActual;
            }
        }

        promedioMensual = totalGastos / 12;
        promedioMensual = Math.round(promedioMensual * 100.0) / 100.0;
        //Salida de datos
        System.out.println("Total de gastos del año: " + totalGastos);
        System.out.println("Promedio mensual de gastos: " + promedioMensual);
        System.out.println("Mes con el mayor gasto: " + mesMayorGasto);
        System.out.println("Mayor gasto registrado: " + mayorGasto);
    }
}

    

