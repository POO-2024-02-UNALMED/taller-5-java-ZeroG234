package zooAnimales;
import java.util.ArrayList;

public class Ave extends Animal{
    private static ArrayList<Ave> listado = new ArrayList<Ave>();
    public static int halcones;
    public static int aguilas;
    private String colorPlumas;

    public Ave(){
        Ave.listado.add(this);
    }

    public Ave(String nombre, int edad, String habitat, String genero, String colorPlumas){
        super(nombre, edad, habitat, genero);
        Ave.listado.add(this);
        this.colorPlumas = colorPlumas;
    }

    public static int cantidadAves(){
        return Ave.listado.size();
    }

    public String movimiento(){
        return "volar";
    }

    public static Ave crearHalcon(String nombre, int edad, String genero){
        Ave.halcones++;
        return new Ave(nombre, edad, "montañas", genero, "café glorioso");
    }

    public static Ave crearAguila(String nombre, int edad, String genero){
        Ave.aguilas++;
        return new Ave(nombre, edad, "montañas", genero, "blanco y amarillo");
    }

    public static ArrayList<Ave> getListado(){
        return listado;
    }

    public static void setListado(ArrayList<Ave> nuevoListado){
        listado = nuevoListado;
    }

    public String getColorPlumas(){
        return colorPlumas;
    }

    public void setColorPlumas(String nuevoColorPlumas){
        colorPlumas = nuevoColorPlumas;
    }
}