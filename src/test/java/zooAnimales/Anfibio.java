package zooAnimales;
import java.util.ArrayList;

public class Anfibio extends Animal{
    private static ArrayList<Anfibio> listado = new ArrayList<Anfibio>();
    public static int ranas;
    public static int salamandras;
    private String colorPiel;
    private Boolean venenoso;

    public Anfibio(){
        Anfibio.listado.add(this);
    }

    public Anfibio(String nombre, int edad, String habitat, String genero, String colorPiel, Boolean venenoso){
        super(nombre, edad, habitat, genero);
        Anfibio.listado.add(this);
        this.colorPiel = colorPiel;
        this.venenoso = venenoso;
    }

    public static int cantidadAnfibios(){
        return Anfibio.listado.size();
    }

    public String movimiento(){
        return "saltar";
    }

    public static Anfibio crearRana(String nombre, int edad, String genero){
        Anfibio.ranas++;
        return new Anfibio(nombre, edad, "selva", genero, "rojo", true);
    }

    public static Anfibio crearSalamandra(String nombre, int edad, String genero){
        Anfibio.salamandras++;
        return new Anfibio(nombre, edad, "selva", genero, "negro y amarillo", false);
    }

    public static ArrayList<Anfibio> getListado(){
        return listado;
    }

    public static void setListado(ArrayList<Anfibio> nuevoListado){
        listado = nuevoListado;
    }

    public String getColorPiel(){
        return colorPiel;
    }

    public void setColorPiel(String nuevoColorPiel){
        colorPiel = nuevoColorPiel;
    }

    public Boolean isVenenoso(){
        return venenoso;
    }

    public void setVenenoso(Boolean nuevoVenenoso){
        venenoso = nuevoVenenoso;
    }
}