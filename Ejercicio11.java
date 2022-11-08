import java.util.Scanner;

public class Ejercicio11 {

    public static void main(String[] args) {
        int counter = 0;
        int x = 0;

        Scanner sc = new Scanner(System.in);
        System.out.println("Cuantos digitos tiene el numero binario:");
        int longitud =sc.nextInt();
        int nbinario[] = new int[99999];
        while (x == 0) {
            counter = 0;
            System.out.println("Introduce los "+longitud+" digitos del binario con un espacio entre ellos:");

            for (int i = 0; i < longitud; i++) {
                nbinario[i] = sc.nextInt();
                if ((nbinario[i] != 1) & (nbinario[i] != 0)) {
                    counter++;
                }
            }

            if (counter > 0) {
                System.out.println("Ese numero no es binario, aprende a leer");
            } else x = 1;
        }



        System.out.println("El numero Binario: ");

        for(int z=0; z< longitud ;z++){

            System.out.print(nbinario[z]);

        }
        System.out.println();
        System.out.println("Vale en decimal: ");
        int convertido = conversor(nbinario,longitud);
        System.out.println(convertido);
    }



    public static int conversor( int nbinario [],int longitud) {

        int decimalNumber=0;



        for (int i = 0;i<longitud; i++){
            if (nbinario[i]== 1)
                decimalNumber= (int) (decimalNumber + nbinario[i]*Math.pow(2,i));
        }
        return decimalNumber;

    }
}