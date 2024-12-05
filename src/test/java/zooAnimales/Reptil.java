package zooAnimales;
import java.util.ArrayList;

public class Reptil extends Animal{
    private static ArrayList<Reptil> listado = new ArrayList<Reptil>();
    public static int iguanas;
    public static int serpientes;
    private String colorEscamas;
    private int largoCola;

    public Reptil(){
        Reptil.listado.add(this);
    }

    public Reptil(String nombre, int edad, String habitat, String genero, String colorEscamas, int largoCola){
        super(nombre, edad, habitat, genero);
        Reptil.listado.add(this);
        this.colorEscamas = colorEscamas;
        this.largoCola = largoCola;
    }

    public static int cantidadReptiles(){
        return listado.size();
    }

    public String movimiento(){
        return "reptar";
    }

    public static Reptil crearIguana(String nombre, int edad, String genero){
        Reptil.iguanas++;
        return new Reptil(nombre, edad, "humedal", genero, "verde", 3);
    }

    public static Reptil crearSerpiente(String nombre, int edad, String genero){
        Reptil.serpientes++;
        return new Reptil(nombre, edad, "jungla", genero, "blanco", 1);
    }

    public static ArrayList<Reptil> getListado(){
        return listado;
    }

    public static void setListado(ArrayList<Reptil> nuevoListado){
        listado = nuevoListado;
    }

    public String getColorEscamas(){
        return colorEscamas;
    }

    public void setColorEscamas(String nuevoColorEscamas){
        colorEscamas = nuevoColorEscamas;
    }

    public int getLargoCola(){
        return largoCola;
    }

    public void setLargoCola(int nuevoLargoCola){
        largoCola = nuevoLargoCola;
    }
}