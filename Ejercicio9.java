import java.util.Scanner;

public class Ejercicio9 {
    public static void main(String[] args) {


        double[] array;
        array = new double[30];



        for (int i = 0; i < 30; i++) {

            Scanner sc = new Scanner(System.in);
            System.out.println("Introduce el " + (i + 1) + "º numero| Los decimales se escriben con coma|");
            array[i] = sc.nextDouble();
            if (array[i]>10) {
                System.out.println("La nota tiene que estar entre 0 y 10");
                i--;
            }

            if (array[i]<0) {
                System.out.println("La nota tiene que estar entre 0 y 10");
                i--;
            }
        }

        double media =media(array);
        int suspenso = suspensos(array);
        double maximo = maximo(array);

        for (int i = 0; i < 30; i++) {

            if (array[i] == maximo)
                System.out.println("El valor Nº " + (i + 1) + " es " + array[i] + " | Maxima");
            if (array[i]<5)
                System.out.println("El valor Nº " + (i + 1) + " es " + array[i] + " | Suspenso");
            else
                System.out.println("El valor Nº " + (i + 1) + " es " + array[i] + " |");


        }
        System.out.println();
        System.out.println("El numero de suspensos es " + suspenso);
        System.out.println();
        System.out.println("La media es " + media);
    }

    public static double media(double array[]) {

        double media = 0;
        double sumatorio=0;
        for (int i = 0; i < 30; i++) {

            sumatorio = sumatorio + array[i];

        }
        media = sumatorio/30;

        return media;
    }


    public static int suspensos(double array[]) {

        int suspenso = 0;
        for (int i = 0; i < 30; i++) {

            if (array[i] < 5) {
                suspenso++;
            }

        }

        return suspenso;
    }


    public static double maximo (double array[]){

        double maximo = array[0];
        for (int i = 1; i < 30; i++) {

            if (array[i] > maximo) {
                maximo = array[i];
            }
        }


        return maximo;
    }

}


