package zooAnimales;
import gestion.Zona;
import java.util.ArrayList;

class Ave extends Animal{
    private static ArrayList<Ave> listado;
    public static int halcones;
    public static int aguilas;
    private String colorPlumas;

    public Ave(){}

    public Ave(String nombre, int edad, String habitat, String genero, Zona[] zona,
               String colorPlumas){
        super(nombre, edad, habitat, genero, zona);
        Ave.listado.add(this);
        this.colorPlumas = colorPlumas;
    }

    public static int cantidadAves(){
        return listado.size();
    }

    public String movimiento(){
        return "volar";
    }

    public void crearHalcon(String nombre, int edad, String genero, Zona[] zona){
        Ave.halcones++;
        new Ave(nombre, edad, "montañas", genero, zona, "café glorioso");
    }

    public void crearAguila(String nombre, int edad, String genero, Zona[] zona){
        Ave.aguilas++;
        new Ave(nombre, edad, "montañas", genero, zona, "blanco y amarillo");
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