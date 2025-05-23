/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package zablah_najmah_examen1;
import java.util.*;

/**
 *
 * @author najma
 */
public class Zablah_Najmah_Piramide {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner lea = new Scanner(System.in).useDelimiter("\n");
        
        int opcion = 0;
        do {
        //Menu principal:
        System.out.println("\n=== Menu Principal ===");
        System.out.println("1. Suma");
        System.out.println("2. Resta");
        System.out.println("3. Multiplicacion");
        System.out.println("4. Division");
        System.out.println("5. Piramide");
        System.out.print("Seleccione una de las opciones: ");
        opcion = lea.nextByte();
        
        //Variables tipo int:
        int numero1 = 0;
        int numero2 = 0;
        
        //Datos desde el teclado:
        if (opcion >= 1 && opcion <= 4) {
        System.out.print("Por favor, ingrese un primer numero: ");
        numero1 = lea.nextInt();
        System.out.print("Por favor, ingrese un segundo numero: ");
        numero2 = lea.nextInt();
        
        //Procedimiento:
        }
        if (opcion == 1) {
            int suma = numero1+numero2;
            System.out.println(numero1+" + "+numero2+" = "+suma);
        } else if (opcion == 2) {
            int resta = numero1-numero2;
            System.out.println(numero1+" - "+numero2+" = "+resta);
        } else if (opcion == 3) {
            int multi = numero1*numero2;
            System.out.println(numero1+" x "+numero2+" = "+multi);
        } else if (opcion == 4 ) {
            if (numero2!= 0) {
                int division = numero1/numero2;
                System.out.println(numero1+"/"+numero2+" = "+division);
            } else {
                System.out.println("Error. No se puede dividir por cero.");
            }
        } else if (opcion == 5 ) {
            //Logica de la piramide:
            System.out.print("\nIngrese la cantidad de filas de la piramide: ");
            int altura = lea.nextInt();
            
            int numeroActual = 1;
            
            for (int i = 1; i <= altura; i++) {
                int sumaFila = 0;
                System.out.print("");
                
                for (int j = 0; j < (2*i-1); j++) {
                    System.out.print(numeroActual);
                    sumaFila += numeroActual;
                    numeroActual += 2;
                    if (j < (2 * i - 1)-1) {
                        System.out.print(" ");
                    }
                } 
                System.out.println(" = "+sumaFila);
            }
        } else {
            System.out.println("Opcion invalida. Por favor, seleccione una de las opciones presentes: ");
        }
            System.out.println();
        } while (opcion != 5);
        
        lea.close();
        System.out.println("Saliendo del programa... nos vemos!");
        }
}

