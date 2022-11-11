//A partir de un vector de enteros positivos, implementa una solución (iterativa) de búsqueda binaria sobre el mismo en el que además de indicar
// en que posición se encuentra un valor buscado (-1 si no se encuentra), indique también el número de intentos hasta encontrarlo/ no encontrarlo.
// Prueba con números aleatorios grandes y una elevada dimensión para el vector.

import java.util.Scanner;

public class Ejercicio17 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("¿Cuantos numeros tiene el vector?");
        int x= sc.nextInt();
        int [] array = new int [x-1];
        System.out.println("¿Que numero quieres buscar?)");
        int buscado= sc.nextInt();
        rellenaarray(array);
        burbuja(array);
        int end=busquedaBinaria(array,buscado);
        System.out.println("El numero buscado esta en el "+end);


    }
    public static void rellenaarray(int[]array){
        for (int i=0;i<array.length; i++){
            int alreatorio = (int)(Math.random()*100+1);
            array[i]=alreatorio;
        }
    }
    public static void burbuja(int[]matrix){
        int temp;
        for(int i=1;i < matrix.length;i++){
            for (int j=0 ; j < matrix.length- 1; j++){
                if (matrix[j] > matrix[j+1]){
                    temp = matrix[j];
                    matrix[j] = matrix[j+1];
                    matrix[j+1] = temp;
                }
            }
        }
    }
     public static int busquedaBinaria(int[] numeros, int valorbuscado) {
                int izquierda = 0, derecha = numeros.length - 1, centro;
                while (izquierda <= derecha) {
                    centro = (derecha - izquierda) / 2 + izquierda;
                    if (numeros[centro] == valorbuscado)
                        return centro;
                    if (valorbuscado < numeros[centro])
                        derecha = centro - 1;
                    else
                        izquierda = centro + 1;

                }
                return -1;

            }
        }

