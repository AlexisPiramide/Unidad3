import java.util.Scanner;

public class Ejercicio10 {

    public static void main(String[] args) {
        int counter = 0;
        int x = 0;
        int nbinario[] = new int[8];

        while (x == 0) {
            counter = 0;
            Scanner sc = new Scanner(System.in);
            System.out.println("Introduce los 8 digitos del binario con un espacio entre ellos:");

            for (int i = 0; i < 8; i++) {
                nbinario[i] = sc.nextInt();
                if ((nbinario[i] != 1) & (nbinario[i] != 0)) {
                    counter++;
                }
            }

            if (counter > 0) {
                System.out.println("Ese numero no es binario, aprende a leer");
            } else x = 1;
    }
        int numero =nbinario[7]+(nbinario[6]*10)+(nbinario[5]*100+(nbinario[4]*1000)+(nbinario[3]*10000)+(nbinario[2]*100000)+(nbinario[1]*1000000)+(nbinario[0]*10000000));
        System.out.println("El numero Binario: "+numero+" vale en decimal: ");
        conversor(nbinario);

    }


    public static int conversor( int nbinario []) {

        int decimalNumber;

        decimalNumber= (int) ((nbinario[0]* Math.pow(2,7)+(nbinario[1]* Math.pow(2,6)+(nbinario[2]* Math.pow(2,5)+(nbinario[3]* Math.pow(2,4)+(nbinario[4]* Math.pow(2,3)+(nbinario[5]* Math.pow(2,2)+(nbinario[6]* Math.pow(2,1)+(nbinario[7]* Math.pow(2,0))))))))));
        System.out.println(decimalNumber);

        return decimalNumber;

    }
}

