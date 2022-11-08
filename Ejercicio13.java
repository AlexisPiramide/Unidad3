//Teniendo en cuenta los datos que aparecen más abajo, realiza los siguientes métodos (corresponden a las notas de 3 alumnos en 4 asignaturas):
// Visualizar nota máxima, mínima y media de cada alumno. Visualizar nota máxima, mínima y media de cada asignatura. Visualizar nota máxima, mínima y media del curso.
// A partir de una nota que se pedirá por teclado, visualizar qué alumnos la han obtenido y en qué asignaturas (aunque en el ejemplo no se cumple,
// tened en cuenta que una misma nota podría aparecer repetida en distintas posiciones de la matriz…). DATOS:{ { 5.6, 9.5, 6.8, 7 },{ 7.9, 5.2, 5.7, 6.3 },{ 9.8, 8, 7.6, 8.5} }


import java.sql.SQLOutput;
import java.util.Scanner;
import java.util.SortedMap;

public class Ejercicio13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double [] alumno1 = new double[4];
        double [] alumno2 = new double[4];
        double [] alumno3 = new double[4];

        int [] asignaturas = new int[4];
        for (int i = 0;i<3;i++){
            int z=i+1;
            asignaturas [i]=z;
        }

        rellenarArray(alumno1);
        rellenarArray(alumno2);
        rellenarArray(alumno3);


        System.out.println("Los datos del 1º alumno son:");
        System.out.println("Nota Maxima: "+maximo(alumno1));
        System.out.println("Nota Minima: "+minimo(alumno1));
        System.out.println("Nota Media:"+media(alumno1));
        System.out.println("______________________________");

        System.out.println("Los datos del 2º alumno son:");
        System.out.println("Nota Maxima: "+maximo(alumno2));
        System.out.println("Nota Minima: "+minimo(alumno2));
        System.out.println("Nota Media:"+media(alumno2));
        System.out.println("______________________________");

        System.out.println("Los datos del 3º alumno son:");
        System.out.println("Nota Maxima: "+maximo(alumno3));
        System.out.println("Nota Minima: "+minimo(alumno3));
        System.out.println("Nota Media:"+media(alumno3));
        System.out.println("______________________________");

        System.out.println("Los datos de la asignatura Calculo I son:");
        System.out.println("Nota Maxima: "+maximoasignatura(alumno1,alumno2,alumno3,0));
        System.out.println("Nota Minima: "+minimoasignatura(alumno1,alumno2,alumno3,0));
        System.out.println("Nota Media: "+minimoasignatura(alumno1,alumno2,alumno3,0));
        System.out.println("______________________________");

        System.out.println("Los datos de la asignatura Fisica I son:");
        System.out.println("Nota Maxima: "+maximoasignatura(alumno1,alumno2,alumno3,1));
        System.out.println("Nota Minima: "+minimoasignatura(alumno1,alumno2,alumno3,1));
        System.out.println("Nota Media: "+minimoasignatura(alumno1,alumno2,alumno3,1));
        System.out.println("______________________________");

        System.out.println("Los datos de la asignatura Circuitos y Sistemas I son:");
        System.out.println("Nota Maxima: "+maximoasignatura(alumno1,alumno2,alumno3,2));
        System.out.println("Nota Minima: "+minimoasignatura(alumno1,alumno2,alumno3,2));
        System.out.println("Nota Media: "+minimoasignatura(alumno1,alumno2,alumno3,2));
        System.out.println("______________________________");

        System.out.println("Los datos de la asignatura Algebra son:");
        System.out.println("Nota Maxima: "+maximoasignatura(alumno1,alumno2,alumno3,3));
        System.out.println("Nota Minima: "+minimoasignatura(alumno1,alumno2,alumno3,3));
        System.out.println("Nota Media: "+minimoasignatura(alumno1,alumno2,alumno3,3));

        System.out.println("Que nota desea buscar:");
        int z = sc.nextInt();
        int y =notasacada(alumno1,alumno2,alumno3,z);
        System.out.println("La nota "+z+" a sido sacada "+y+" veces");
    }

    public  static double []rellenarArray (double array []){
        for (int i=0;i<4;i++) {
            System.out.println("Inserte la " + (i + 1) + "ª nota");
            Scanner sc = new Scanner(System.in);
            array[i]= sc.nextDouble();
        }
        System.out.println("______________________________");
        return array;
    }


    public static double maximo (double array []){
        double numero;
        double maximo = -99;
        for (int i=0;i<4;i++){

           numero = array[i];
           if (numero > maximo)
               maximo = array[i];
        }

        return maximo;
    }

    public static double minimo (double array []){
        double numero;
        double minimo = 99;
        for (int i=0;i<4;i++){

            numero = array[i];
            if (numero < minimo)
                minimo = array[i];
        }

        return minimo;
    }

    public  static double media (double array[]){
        double media=0;
        for (int i=0;i<4;i++){
             media =media + array[i];
        }
        media = media/4;

        return media;
    }

    public static double maximoasignatura (double array1[],double array2[],double array3[], int x){
        int  z = x;
        double maximoasignatura = -99;

        if (array1[z]>maximoasignatura)
            maximoasignatura = array1[z];

        if (array2[z]>maximoasignatura)
            maximoasignatura = array2[z];

        if (array3[z]>maximoasignatura)
            maximoasignatura = array3[z];

        return maximoasignatura;
    }

    public static double minimoasignatura (double array1[],double array2[],double array3[], int x){
        int  z = x;
        double minimoasignatura = 99;


        if (array1[z]<minimoasignatura)
            minimoasignatura = array1[z];

        if (array2[z]<minimoasignatura)
             minimoasignatura = array2[z];

        if (array3[z]<minimoasignatura)
             minimoasignatura = array3[z];

        return minimoasignatura;
    }

    public static double mediaasignatura (double array1[],double array2[],double array3[], int x){
        double mediaasignatura;

        mediaasignatura = array1[x]+ array2[x]+array3[x];

     return mediaasignatura;
    }

    public static int notasacada (double array1[],double array2[],double array3[], int x){

        double n=0;
        int counter=0;
        for (int i =0; i< 4;i++){
            n= array1[i];
            if (n == x)
            counter++;
    }
        for (int i =0; i< 4;i++){
            n= array2[i];
        if (n == x)
            counter++;
    }
        for (int i =0; i< 4;i++){
            n= array3[i];
        if (n == x)
            counter++;
    }
        return counter;
    }

}
