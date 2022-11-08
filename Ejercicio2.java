//Define un array de 12 números y asigna valores a los elementos según la tabla que se muestra a continuación.
// Muestra el contenido de todos los elementos del array.
// ¿Qué sucede con los valores de los elementos que no han sido inicializados?. Indica la respuesta en forma de comentario.

import javax.swing.*;
import javax.swing.plaf.synth.SynthInternalFrameUI;
import java.util.Scanner;

public class Ejercicio2 {
    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);

        int [] array;
        array = new int [13];
        array [1]= 39;
        array [2]= -2;
        array [7]= 14;
        array [9]= 5;
        array [10]= 120;

        for(int i=0;i<13;i++){

            System.out.println("El valor "+i+" vale "+array[i]);

        }

    }
}
// Los vacios se quedan en 0
