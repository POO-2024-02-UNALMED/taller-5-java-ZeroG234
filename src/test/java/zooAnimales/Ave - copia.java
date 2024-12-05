package zooAnimales;
import gestion.Zona;
import java.util.ArrayList;

class Anfibio extends Animal{
    private static ArrayList<Anfibio> listado;
    public static int ranas;
    public static int salamandras;
    private String colorPiel;
    private Boolean venenoso;

    public Anfibio(){}

    public Anfibio(String nombre, int edad, String habitat, String genero, Zona[] zona,
                   String colorPiel, Boolean venenoso){
        super(nombre, edad, habitat, genero, zona);
        Anfibio.listado.add(this);
        this.colorPiel = colorPiel;
        this.venenoso = venenoso;
    }

    public static int cantidadAnfibios(){
        return listado.size();
    }

    public String movimiento(){
        return "Saltar";
    }

    public void crearRana(String nombre, int edad, String genero, Zona[] zona){
        Anfibio.ranas++;
        new Anfibio(nombre, edad, "selva", genero, zona, "rojo", true);
    }

    public void crearSalamandra(String nombre, int edad, String genero, Zona[] zona){
        Anfibio.salamandras++;
        new Anfibio(nombre, edad, "selva", genero, zona, "negro y amarillo", false);
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

    public Boolean getVenenoso(){
        return venenoso;
    }

    public void setVenenoso(Boolean nuevoVenenoso){
        venenoso = nuevoVenenoso;
    }
}