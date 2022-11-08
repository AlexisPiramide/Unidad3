import java.util.Scanner;

public class Ejercicio6 {
    public static void main(String[] args) {


        int[] array;
        array = new int[10];

        for (int i = 0; i < 10; i++) {
            Scanner sc = new Scanner(System.in);
            System.out.println("Inserte el " + (i + 1) + " º numero");
            array[i] = sc.nextInt();

        }

        int maximo = array[0];
        for (int i = 1; i < 10; i++) {

            if (array[i] > maximo) {
                maximo = array[i];
            }
        }

        int minimo = array[0];
        for (int i = 1; i < 10; i++) {

            if (array[i] < minimo) {
                minimo = array[i];
            }
        }


        for (int i = 0; i < 10; i++) {

            if (array[i] == maximo) {
                System.out.println(array[i]+" | Maximo");
            }
            if (array[i] == minimo) {
                System.out.println(array[i]+" | Minimo");
            }
            else {
                System.out.println(array[i]+" |");
            }
        }
    }
}