import java.util.Scanner;

public class Ejercicio7 {
    public static void main(String[] args) {


        int[] array,array2;
        array = new int[15];
        array2 = new int[15];

        for (int i = 0; i < 15; i++) {
            Scanner sc = new Scanner(System.in);
            System.out.println("Inserte el " + (i + 1) + " º numero");
            array[i] = sc.nextInt();

        }

        for (int i = 0; i < 15; i++) {
            int x=14;
            array2[i] = array [x];
            x--;
        }
        System.out.println("El array:");
        for (int i = 0; i < 15; i++) {
            System.out.println("El valor Nº "+(i+1)+" es "+array[i]+" |");
        }

        System.out.println("El array Invertido:");
        for (int x = 0; x < 15; x++) {
            System.out.println("El valor Nº "+(x+1)+" es "+array[x]+" |");
        }
    }
}
