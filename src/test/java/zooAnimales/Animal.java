package zooAnimales;
import gestion.Zona;

public class Animal{
    private static int totalAnimales;
    private String nombre;
    private int edad;
    private String habitat;
    private String genero;
    private Zona[] zona = new Zona[1];

    public Animal(){
        totalAnimales++;
    }

    public Animal(String nombre, int edad, String habitat, String genero){
        this.nombre = nombre;
        this.edad = edad;
        this.habitat = habitat;
        this.genero = genero;
        totalAnimales++;
    }

    public String movimiento(){
        return "desplazarse";
    }

    public static String totalPorTipo(){
        return "Mamiferos: " + Mamifero.cantidadMamiferos() + "\n" +
               "Aves: " + Ave.cantidadAves() + "\n" +
			   "Reptiles: " + Reptil.cantidadReptiles() + "\n" +
				"Peces: " + Pez.cantidadPeces() + "\n" +
				"Anfibios: " + Anfibio.cantidadAnfibios();
    }

    public String toString(){
        return "Mi nombre es " + nombre + ", tengo una edad de " + edad + ", habito en " + habitat +
               " y mi genero es " + genero;// + ", la zona en la que me ubico es " + zona +", en el " + zona[0].getZoo();
    }

    public static int getTotalAnimales(){
        return Animal.totalAnimales;
    }

    public static void setTotalAnimales(int nuevoTotalAnimales){
        totalAnimales = nuevoTotalAnimales;
    }

    public String getNombre(){
        return nombre;
    }

    public void setNombre(String nuevoNombre){
        nombre = nuevoNombre;
    }

    public int getEdad(){
        return edad;
    }

    public void setEdad(int nuevaEdad){
        edad = nuevaEdad;
    }

    public String getHabitat(){
        return habitat;
    }

    public void setHabitat(String nuevoHabitat){
        habitat = nuevoHabitat;
    }

    public String getGenero(){
        return genero;
    }

    public void setGenero(String nuevoGenero){
        genero = nuevoGenero;
    }

    public Zona[] getZona(){
        return zona;
    }

    public void setZona(Zona[] nuevaZona){
        zona = nuevaZona;
    }
}