package gestion;
import java.util.ArrayList;

public class Zoologico{
    private String nombre;
    private String ubicacion;
    private ArrayList<Zona> zonas = new ArrayList<Zona>();

    public Zoologico(){}

    public Zoologico(String nombre, String ubicacion){
        this.nombre = nombre;
        this.ubicacion = ubicacion;
    }

    public void agregarZonas(Zona nuevaZona){
        zonas.add(nuevaZona);
    }

    public int cantidadTotalAnimales(){
        int totalAnimales = 0;
        for(Zona zona: zonas){
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
        return zonas;
    }

    public void setZona(ArrayList<Zona> nuevasZonas){
        zonas = nuevasZonas;
    }
}