package gestion;
import java.util.ArrayList;

public class Zoologico{
    private String nombre;
    private String ubicacion;
    private static ArrayList<Zona> zona;

    public Zoologico(){}

    public Zoologico(String nombre, String ubicacion){
        this.nombre = nombre;
        this.ubicacion = ubicacion;
    }

    public void agregarZonas(Zona nuevaZona){
        zona.add(nuevaZona);
    }

    public int cantidadTotalAnimales(){
        int totalAnimales = 0;
        for (Zona zona : zona) {
            totalAnimales += zona.cantidadAnimales();
        }

        return totalAnimales;
    }

    public String getNombre(){
        return nombre;
    }

    public void setNombre(String nuevoNombre){
        nombre = nuevoNombre;
    }

    public String getUbicacion(){
        return ubicacion;
    }

    public void setUbicacion(String nuevaUbicacion){
        ubicacion = nuevaUbicacion;
    }

    public ArrayList<Zona> getZona(){
        return zona;
    }

    public void setZona(ArrayList<Zona> nuevasZonas){
        zona = nuevasZonas;
    }
}