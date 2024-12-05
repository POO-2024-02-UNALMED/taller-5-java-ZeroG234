package zooAnimales;
import java.util.ArrayList;

public class Pez extends Animal{
    private static ArrayList<Pez> listado;
    public static int salmones;
    public static int bacalaos;
    private String colorEscamas;
    private int cantidadAletas;

    public Pez(){}

    public Pez(String nombre, int edad, String habitat, String genero, String colorEscamas, int cantidadAletas){
        super(nombre, edad, habitat, genero);
        Pez.listado.add(this);
        this.colorEscamas = colorEscamas;
        this.cantidadAletas = cantidadAletas;
    }

    public static int cantidadPeces(){
        return listado.size();
    }

    public String movimiento(){
        return "nadar";
    }

    public static Pez crearSalmon(String nombre, int edad, String genero){
        Pez.salmones++;
        return new Pez(nombre, edad, "océano", genero, "rojo", 6);
    }

    public static Pez crearBacalao(String nombre, int edad, String genero){
        Pez.bacalaos++;
        return new Pez(nombre, edad, "océano", genero, "gris", 6);
    }

    public static ArrayList<Pez> getListado(){
        return listado;
    }

    public static void setListado(ArrayList<Pez> nuevoListado){
        listado = nuevoListado;
    }

    public String getColorEscamas(){
        return colorEscamas;
    }

    public void setColorEscamas(String nuevoColorEscamas){
        colorEscamas = nuevoColorEscamas;
    }

    public int getCantidadAletas(){
        return cantidadAletas;
    }

    public void setCantidadAletas(int nuevoCantidadAletas){
        cantidadAletas = nuevoCantidadAletas;
    }
}