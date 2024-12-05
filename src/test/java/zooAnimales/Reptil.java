package zooAnimales;
import gestion.Zona;
import java.util.ArrayList;

class Reptil extends Animal{
    private static ArrayList<Reptil> listado;
    public static int iguanas;
    public static int serpientes;
    private String colorEscamas;
    private int largoCola;

    public Reptil(){}

    public Reptil(String nombre, int edad, String habitat, String genero, Zona[] zona,
                  String colorEscamas, int largoCola){
        super(nombre, edad, habitat, genero, zona);
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

    public void crearIguana(String nombre, int edad, String genero, Zona[] zona){
        Reptil.iguanas++;
        new Reptil(nombre, edad, "humedal", genero, zona, "verde", 3);
    }

    public void crearSerpientes(String nombre, int edad, String genero, Zona[] zona){
        Reptil.serpientes++;
        new Reptil(nombre, edad, "jungla", genero, zona, "blanco", 1);
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