import java.util.Scanner;

public class Ejercicio10_2 {

    public static void main(String[] args) {
        int nbinario[] = new int[8];

        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce los 8 digitos del binario con un espacio entre ellos:");
        for (int i = 0; i < 8; i++) {
            nbinario[i] = sc.nextInt();
            System.out.println(nbinario[i]);
        }
        int decimalNumber = conversor(nbinario);
        System.out.println("El numero binario convertido vale: "+ decimalNumber);

    }


    public static int conversor(int nbinario[]) {

        int decimalNumber=0;



        for (int i = 0;i<8; i++){
            if (nbinario[i]== 1)
                decimalNumber= (int) (decimalNumber + nbinario[i]*Math.pow(2,i));
        }
        return decimalNumber;

    }
}