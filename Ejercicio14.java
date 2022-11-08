import java.util.Scanner;

public class Ejercicio14 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("¿De cuanto es la matiz simetrica?");
        int matriz = sc.nextInt();
        int array[][] = new int [matriz][matriz];
        rellenaarray(array,matriz);
        boolean fin= comprobador(array,matriz);

        if (fin){
            System.out.println("La matriz es simetrica");
        }else{
            System.out.println("La matriz no es simetrica");
        }

    }

    public static void rellenaarray (int array [][],int matriz){
        Scanner sc = new Scanner(System.in);

        for(int i=0;i<matriz;i++){
            for (int z=0;z<matriz;z++){

                System.out.println("Inserta el siguiente digito");
                array[i][z]= sc.nextInt();
            }
        }

    }
    public static boolean comprobador (int array [][],int matriz){

        for ( int fila=1; fila < matriz; fila++ )
        {
            for ( int columna=0; columna < fila; columna++ )
            {
                if ( array[fila][columna] != array[columna][fila] )
                {
                    return false;
                }
            }
        }
        return true;
}
}
