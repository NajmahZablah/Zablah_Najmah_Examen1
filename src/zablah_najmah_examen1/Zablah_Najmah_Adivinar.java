/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package zablah_najmah_examen1;

import java.util.*;

/**
 *
 * @author najma
 */
public class Zablah_Najmah_Adivinar {
    public static void main(String[] args) {
        Scanner lea= new Scanner(System.in).useDelimiter("\n");
        Random random = new Random();
        
        //Variables tipo int:
        int numeroSecreto = random.nextInt(100);
        int numeroIngresado;
        int intentosMax = 10;
        int contadorIntentos = 0;
        
        //Procedimiento:
        System.out.println("\n===Adivine un numero Secreto ===");
        while (contadorIntentos < intentosMax) {
            System.out.print("Ingrese un numero del 1 al 100: ");
            numeroIngresado = lea.nextInt();
            contadorIntentos++;
            
            if (numeroIngresado == numeroSecreto) {
                System.out.println("Felicidades! Adivinaste el numero secreto "+numeroSecreto);
                break;
            } else if (numeroIngresado < numeroSecreto) {
                System.out.println("El numero que ha ingresado es mayor al numero secreto... ");
            } else {
            System.out.println("El numero que ha ingresado es menor al numero secreto... ");
            }
        }
        
        if (contadorIntentos == intentosMax) {
        System.out.println("Se te han acabado los intentos! el numero secreto era: "+numeroSecreto);
}
}
}