package zooAnimales;
import gestion.Zona;
import java.util.ArrayList;

class Pez extends Animal{
    private static ArrayList<Pez> listado;
    public static int salmones;
    public static int bacalaos;
    private String colorEscamas;
    private int cantidadAletas;

    public Pez(){}

    public Pez(String nombre, int edad, String habitat, String genero, Zona[] zona,
               String colorEscamas, int cantidadAletas){
        super(nombre, edad, habitat, genero, zona);
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

    public void crearSalmon(String nombre, int edad, String genero, Zona[] zona){
        Pez.salmones++;
        new Pez(nombre, edad, "océano", genero, zona, "rojo", 6);
    }

    public void crearBacalao(String nombre, int edad, String genero, Zona[] zona){
        Pez.bacalaos++;
        new Pez(nombre, edad, "océano", genero, zona, "gris", 6);
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