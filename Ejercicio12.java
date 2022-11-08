//Implementa un programa que determine la frecuencia de aparición de cada vocal en una cadena de caracteres introducida por teclado.
// Comenzará solicitando la cadena y, posteriormente, construirá un array con las frecuencias de cada vocal. Finalmente, imprimirá el array de frecuencias por pantalla.
// (NOTA: No debe ser sensible a mayúsculas/minúsculas).

import java.util.Scanner;

public class Ejercicio12 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Inserta la frase a utilizar");
        String s = sc.nextLine();

        System.out.println("¿Cuantas letras tiene la frase escrita?(Recuerda que los espacios cuentan)");
        int n = sc.nextInt();
        char a = 97;
        char e = 101;
        char i = 105;
        char o = 111;
        char u = 117;
        int contadora=0,contadore=0,contadori=0,contadoro=0,contadoru=0;
        char [] array = StringToChar(s,n);
        for (int z=0;z<n;z++){
            s.toLowerCase();
        }
        for (int k=0; k<n;k++){
            if (array[k]== a){contadora++;
            }
            if (array[k]== e){contadore++;
            }
            if (array[k]== i){contadori++;
            }
            if (array[k]== o){contadoro++;
            }
            if (array[k]== u){contadoru++;
            }
        }

        System.out.println("La frase tiene: ");
        System.out.println(contadora+" letras a");
        System.out.println(contadore+" letras e");
        System.out.println(contadori+" letras i");
        System.out.println(contadoro+" letras o");
        System.out.println(contadoru+" letras u");

    }

    public static char [] StringToChar(String s,int n) {

         char[] array = new char[n];
       for (int i=0;i<n;i++) {

               array[i] = s.charAt(i);

       }



        return array ;
    }


}

