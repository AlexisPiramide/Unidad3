public class Ejercicio5 {
    public static void main(String[] args) {

        int[] Numero;
        Numero = new int[20];
        int[] Cuadrado;
        Cuadrado = new int[20];
        int[] Cubo;
        Cubo = new int[20];


        for(int i=0;i<20;i++){
            int random = (int) (Math.random()*100);
            Numero [i]= random;
            Cuadrado [i]= (Numero [i]*Numero [i]);
            Cubo [i]= (Numero [i]*Numero [i]*Numero [i]);

            System.out.println("El valor Nº "+(i+1)+" es "+Numero [i]+" |  El valor Nº "+(i+1)+" al cuadrado es "+Cuadrado [i]+" |  El valor Nº "+(i+1)+" al cubo es "+Cubo [i]);
        }
    }
}
