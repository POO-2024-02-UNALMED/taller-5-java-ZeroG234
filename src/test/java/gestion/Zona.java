package gestion;
import zooAnimales.Animal;
import java.util.ArrayList;

public class Zona{
    private String nombre;
    private Zoologico[] zoo = new Zoologico[1];
    private ArrayList<Animal> animales;

    public Zona(){}

    public Zona(String nombre, Zoologico[] zoo, ArrayList<Animal> animales){
        this.nombre = nombre;
        this.zoo = zoo;
        this.animales = animales;
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

    public Zoologico[] getZoo(){
        return zoo;
    }

    public void setZoo(Zoologico[] nuevoZoo){
        zoo = nuevoZoo;
    }

    public ArrayList<Animal> getAnimales(){
        return animales;
    }

    public void setAnimales(ArrayList<Animal> nuevosAnimales){
        animales = nuevosAnimales;
    }
}