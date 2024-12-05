package zooAnimales;
import gestion.Zona;

public class Animal{
    private static int totalAnimales;
    private String nombre;
    private int edad;
    private String habitat;
    private String genero;
    private Zona[] zona = new Zona[1];

    public enum Tipo{MAMIFERO, AVE, REPTIL, PEZ, ANFIBIO}

    public Animal(){}

    public Animal(String nombre, int edad, String habitat, String genero, Zona[] zona){
        this.nombre = nombre;
        this.edad = edad;
        this.habitat = habitat;
        this.genero = genero;
        this.zona = zona;
    }

    public String movimiento(){
        return "desplazarse";
    }

    public int totalPorTipo(Tipo tipo){
        switch(tipo){
            case MAMIFERO:
                return Mamifero.cantidadMamiferos();

            case AVE:
                return Ave.cantidadAves();

            case REPTIL:
                return Reptil.cantidadReptiles();

            case PEZ:
                return Pez.cantidadPeces();

            case ANFIBIO:
                return Anfibio.cantidadAnfibios();

            default:
                return 0;
        }
    }

    public String toString(){
        return "Mi nombre es " + nombre + ", tengo una edad de " + edad + ", habito en " + habitat +
               " y mi género es " + genero + ", la zona en la que me ubico es " + zona +", en el #zoo.";
    }

    public static int getTotalAnimales(){
        return Animal.totalAnimales;
    }
}