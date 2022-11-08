//Implementa un programa que determine la frecuencia de aparición de cada letra en una cadena de caracteres introducida por teclado.
//Comenzará solicitando la cadena y, posteriormente, construirá un array con las frecuencias de cada letra. Finalmente, imprimirá el array de frecuencias por pantalla.
//Cuanto más preciso sea, mejor (ten en cuenta tildes, diéresis, símbolos...) (NOTA: No debe ser sensible a mayúsculas/minúsculas).


import java.util.Scanner;

public class Ejercicio16 {
    public static void main(String[] args) {

        char minusculas[]= new char [26];
        char otros[]= new char [13];
        char palabras[]= new char [999999999];
        for (int i=0;i<26;i++){
            minusculas[i]= (char) (97+i);
        }

        char contador[]= new char [39];

        otros[0]= (char) 160;
        otros[1]= (char) 130;
        otros[2]= (char) 161;
        otros[3]= (char) 162;
        otros[4]= (char) 163;
        otros[5]= (char) 181;
        otros[6]= (char) 144;
        otros[7]= (char) 214;
        otros[8]= (char) 224;
        otros[9]= (char) 233;
        otros[10]= (char) 154;
        otros[11]= (char) 241;
        otros[12]= (char) 209;

        System.out.println(minusculas);
        System.out.println(otros);

        rellenaarray(palabras);
        contador(palabras,minusculas,contador);
        for (int i=0;i< minusculas.length;i++)
            System.out.println("La letra "+minusculas[i]+" aparece "+ contador[i]+" veces");

        for (int i=0;i< otros.length;i++)
            System.out.println("La letra "+otros[i]+" aparece "+ contador[i]+" veces");
    }

    public static void rellenaarray( char array[]){
        System.out.println("Escriba los que desea analizar");
        Scanner sc = new Scanner(System.in);
        int i=0;
        while (sc.hasNextInt()){
            array[i]= (char) sc.nextInt();
            i++;
        }
    }

    public static void contador (char array[], char arraymin[], char arraycon[]){

        for(int i=0; i< array.length;i++){

            if (array[i]==arraymin[0]){
                arraycon[0]++;
            }
            if (array[i]==arraymin[1]){
                arraycon[1]++;
            }
            if (array[i]==arraymin[2]){
                arraycon[2]++;
            }
            if (array[i]==arraymin[3]){
                arraycon[3]++;
            }
            if (array[i]==arraymin[4]){
                arraycon[4]++;
            }
            if (array[i]==arraymin[5]){
                arraycon[5]++;
            }if (array[i]==arraymin[6]){
                arraycon[6]++;
            }if (array[i]==arraymin[7]){
                arraycon[7]++;
            }if (array[i]==arraymin[8]){
                arraycon[8]++;
            }
            if (array[i]==arraymin[19]){
                arraycon[9]++;
            }
            if (array[i]==arraymin[10]){
                arraycon[10]++;
            }
            if (array[i]==arraymin[11]){
                arraycon[11]++;
            }
            if (array[i]==arraymin[12]){
                arraycon[12]++;
            }
            if (array[i]==arraymin[13]){
                arraycon[13]++;
            }


        }
    }
}
