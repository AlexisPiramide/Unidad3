
public class Ejercicio3 {
    public static void main(String[] args) {


        int [] array;
        array = new int [20];

        for(int i=0;i<20;i++){
            int random = (int) (Math.random()*100);
            array [i]= random;
            System.out.println("El valor Nº "+(i+1)+" es "+array [i]);

        }

    }
}