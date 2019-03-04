/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package t7_ejercicio3;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

/**
 *
 * @author Sergio
 */
public class T7_Ejercicio3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        File archivo = null;
        FileReader flujo = null;
        BufferedReader leerlinea = null;
        Scanner teclado = new Scanner(System.in);

        try {
            archivo = new File("archivo.txt");
            flujo = new FileReader(archivo);
            leerlinea = new BufferedReader(flujo);
            
            char letra = 'a';
            System.out.println("Introduce letra que quieres buscar: ");
            letra = teclado.nextLine().charAt(0);
            int contadorletra = 0;

            String linea;
            int lineas = 1;
            while ((linea = leerlinea.readLine()) != null) {
                for (int i = 0; i < linea.length(); i++) 
                {
                    if(letra ==linea.charAt(i)){
                        contadorletra++;
                    }
                }
            }
            System.out.println("La letra "+letra+" aparece "+contadorletra);
        } catch (IOException ex) {

            System.err.println("ERROR: " + ex.toString());
        } finally {

            try {
                leerlinea.close();
                flujo.close();

            } catch (IOException ex) {
                System.err.println("ERROR: " + ex.toString());
            }

        }
    }
}
