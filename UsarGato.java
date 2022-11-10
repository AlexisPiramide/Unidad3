import java.util.Scanner;

public class UsarGato {

    public static void main(String[] args) {
        Gato migato = new Gato("Marramiau", "Caniche", "Negro", true, 9, 104, 3, 5, 5, 8);
        System.out.println(migato);

        int Lasaña;
        Scanner sc = new Scanner(System.in);

        int contador = 0;
        int lasaña = 0;
        int x = 1;
        boolean estado = migato.vivo();
        while (x==1){
        while (estado) {
            System.out.println("----------------------------");
            System.out.println("¿Que hace el gato?");
            System.out.println("----------------------------");
            System.out.println("1º Lamerse las bolas");
            System.out.println("2º Tirar una taza");
            System.out.println("3º Comer Lasaña");
            System.out.println("4º Hacer un pacto con el diablo");
            System.out.println("5º Salir");
            contador = sc.nextInt();

            if (contador == 1) {
                System.out.println("El gato se lame las bolas");
            }
            if (contador == 2) {
                System.out.println("El gato ha tirado 1 taza");
                migato.tazas1();

            }
            if (contador == 3) {
                System.out.println("El gato se ha comido una lasaña");
                lasaña++;
                if (lasaña == 13) {
                    migato.matagato();
                    estado = migato.vivo();
                }

            }
            if (contador == 4) {
                System.out.println("El gato a hecho un pacto con el diablo");
                migato.pactos();
                if (migato.PactosConElDiablo == 9) {
                    migato.matagato();
                    contador = 5;
                    estado = migato.vivo();
                }
            }
        }
        if (contador == 5) x = 0;

        while (!estado) {
            System.out.println("----------------------------");
            System.out.println("¿Que hacer con el gato muerto?");
            System.out.println("----------------------------");
            System.out.println("1º Revivirlo");
            System.out.println("2º Irse");
            contador = sc.nextInt();
            if (contador == 1) {
                migato.revive();
                lasaña = 0;
            }
            if (contador == 2) {
                x = 0;
            }
        }
    }
    }
}
