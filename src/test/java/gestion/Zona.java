package gestion;
import zooAnimales.Animal;
import java.util.ArrayList;

public class Zona{
    private String nombre;
    private Zoologico zoo;
    private ArrayList<Animal> animales = new ArrayList<Animal>();

    public Zona(){}

    public Zona(String nombre, Zoologico zoo){
        this.nombre = nombre;
        this.zoo = zoo;
    }

    public void agregarAnimales(Animal nuevoAnimal){
        animales.add(nuevoAnimal);
    }

    public int cantidadAnimales(){
        return animales.size();
    }

    public String getNombre(){
        return nombre;
    }

    public void setNombre(String nuevoNombre){
        nombre = nuevoNombre;
    }

    public Zoologico getZoo(){
        return zoo;
    }

    public void setZoo(Zoologico nuevoZoo){
        zoo = nuevoZoo;
    }

    public ArrayList<Animal> getAnimales(){
        return animales;
    }

    public void setAnimales(ArrayList<Animal> nuevosAnimales){
        animales = nuevosAnimales;
    }
}