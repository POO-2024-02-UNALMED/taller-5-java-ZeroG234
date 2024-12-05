package zooAnimales;
import gestion.Zona;
import java.util.ArrayList;

class Mamifero extends Animal{
    private static ArrayList<Mamifero> listado;
    public static int caballos;
    public static int leones;
    private Boolean pelaje;
    private int patas;

    public Mamifero(){}

    public Mamifero(String nombre, int edad, String habitat, String genero, Zona[] zona,
                    Boolean pelaje, int patas){
        super(nombre, edad, habitat, genero, zona);
        Mamifero.listado.add(this);
        this.pelaje = pelaje;
        this.patas = patas;
    }

    public static int cantidadMamiferos(){
        return listado.size();
    }

    public void crearCaballo(String nombre, int edad, String genero, Zona[] zona){
        Mamifero.caballos++;
        new Mamifero(nombre, edad, "pradera", genero, zona, true, 4);
    }

    public void crearLeon(String nombre, int edad, String genero, Zona[] zona){
        Mamifero.leones++;
        new Mamifero(nombre, edad, "selva", genero, zona, true, 4);
    }

    public static ArrayList<Mamifero> getListado(){
        return listado;
    }

    public static void setListado(ArrayList<Mamifero> nuevoListado){
        listado = nuevoListado;
    }

    public Boolean getPelaje(){
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