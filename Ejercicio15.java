import java.util.Scanner;

public class Ejercicio15 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("¿De cuanto es la matiz a trasponer?");
        int matriz = sc.nextInt();
        int array[][] = new int [matriz][matriz];
        int arrayT[][] = new int [matriz][matriz];
        rellenaarray(array,matriz);
        traspuesta(array,arrayT,matriz);


        System.out.println("La matriz traspuesta es:");
        for(int i=0;i<matriz;i++){
            for (int z=0;z<matriz;z++){
                System.out.printf("|"+arrayT[i][z]);

            }
            System.out.println("|");
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
    public static void traspuesta (int array [][], int arrayT[][],int matriz){

        for (int x=0; x < matriz; x++) {
            for (int y=0; y < matriz; y++) {
                arrayT[y][x] = array[x][y];
            }
        }
    }
}

