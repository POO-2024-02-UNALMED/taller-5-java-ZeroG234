package zooAnimales;
import java.util.ArrayList;

public class Mamifero extends Animal{
    private static ArrayList<Mamifero> listado = new ArrayList<Mamifero>();
    public static int caballos;
    public static int leones;
    private Boolean pelaje;
    private int patas;

    public Mamifero(){
        Mamifero.listado.add(this);
    }

    public Mamifero(String nombre, int edad, String habitat, String genero, Boolean pelaje, int patas){
        super(nombre, edad, habitat, genero);
        Mamifero.listado.add(this);
        this.pelaje = pelaje;
        this.patas = patas;
    }

    public static int cantidadMamiferos(){
        return Mamifero.listado.size();
    }

    public static Mamifero crearCaballo(String nombre, int edad, String genero){
        Mamifero.caballos++;
        return new Mamifero(nombre, edad, "pradera", genero, true, 4);
    }

    public static Mamifero crearLeon(String nombre, int edad, String genero){
        Mamifero.leones++;
        return new Mamifero(nombre, edad, "selva", genero, true, 4);
    }

    public static ArrayList<Mamifero> getListado(){
        return listado;
    }

    public static void setListado(ArrayList<Mamifero> nuevoListado){
        listado = nuevoListado;
    }

    public Boolean isPelaje(){
        return pelaje;
    }

    public void setPelaje(Boolean nuevoPelaje){
        pelaje = nuevoPelaje;
    }

    public int getPatas(){
        return patas;
    }

    public void setPatas(int nuevasPatas){
        patas = nuevasPatas;
    }
}