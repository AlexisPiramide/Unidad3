import javax.sound.midi.Soundbank;
import java.util.SortedMap;

public class Gato {

    private String Nombre;
    private String Raza;
    private String Color;
    private Boolean Vivo;
    private  String Tamaño;
    private int Edad;
    private int TazasRotas;
    private int NumeroDeVecesDiariosQueLeMiraALosOjosAdiosYSeRieEnSuCara;
    int PactosConElDiablo;
    private double Miausporminuto;
    private int CrimenesDeGuerraCometidos;

    
    
    Gato(String nombre,String raza,String color,boolean vivo,int edad,int tazasRotas,int ndvdqlmaloaysresc, int pactosConElDiablo,int miausporminuto, int crimenesDeGuerraCometidos){
        this.Nombre=nombre;
        this.Raza=raza;
        this.Color=color;
        this.Vivo=vivo;
        this.Edad=edad;
        this.TazasRotas=tazasRotas;
        this.NumeroDeVecesDiariosQueLeMiraALosOjosAdiosYSeRieEnSuCara=ndvdqlmaloaysresc;
        this.PactosConElDiablo=pactosConElDiablo;
        this.Miausporminuto=miausporminuto;
        this.CrimenesDeGuerraCometidos=crimenesDeGuerraCometidos;
    }
@Override
    public String toString(){

        String salida;
        salida= String.format("Nombre: %s\tRaza: %s\tColor: %s\tVivo: %b\nEdad: %d\nTazas rotas: %d\nNº de veces diarias que a mirado a Dios a los ojos y se ha reido de el en su cara: %d\nPactos con el diablo: %d\tMiaus Por Minuto: %f\tCrimenes de guerra: %d",Nombre,Raza,Color,Vivo,Edad,TazasRotas,NumeroDeVecesDiariosQueLeMiraALosOjosAdiosYSeRieEnSuCara,PactosConElDiablo,Miausporminuto,CrimenesDeGuerraCometidos);

        return salida;
    }
    public boolean vivo(){

       if (this.Vivo==false)
        return false;

        return true;
    }
    public void revive(){
        this.Vivo=true;
        this.PactosConElDiablo=0;
    }

    public void matagato(){
        this.Vivo=false;
        System.out.println("El gato a muerto");
    }
    public void tazas1(){
        this.TazasRotas++;
        System.out.println("Tazas rotas: "+TazasRotas);
    }
    public void pactos(){
        this.PactosConElDiablo++;
        System.out.println("Pactos con el diablo hechos: "+PactosConElDiablo);
    }
}
