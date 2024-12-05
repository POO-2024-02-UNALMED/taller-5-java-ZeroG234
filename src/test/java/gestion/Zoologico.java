package gestion;
import java.util.ArrayList;

class Zoologico{
    private String nombre;
    private String ubicacion;
    private ArrayList<Zona> zonas;

    public Zoologico(){}

    public Zoologico(String nombre, String ubicacion, ArrayList<Zona> zonas){
        this.nombre = nombre;
        this.ubicacion = ubicacion;
        this.zonas = zonas;
    }

    public void agregarZonas(Zona nuevaZona){
        zonas.add(nuevaZona);
    }

    public int cantidadTotalAnimales(){
        int totalAnimales = 0;
        for (Zona zona : zonas) {
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
}