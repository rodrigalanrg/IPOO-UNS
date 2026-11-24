package tp8.ejercicio4;

import tp8.ejercicio2.Elemento;

public class Empleado extends Elemento  {

    // Atributos de instancia 
    protected int legajo;
    protected String nombre;
    protected int cantHoras;
    protected float valorHora;

    // Constructor 
    public Empleado(int leg, String nombre, int canth, float valorh){
        legajo = leg;
        this.nombre = nombre;
        cantHoras = canth;
        valorHora = valorh;
    }

    // Consultas
    public int obtenerLegajo(){
        return legajo;
    }
    public float obtenerSueldo(){
        return cantHoras * valorHora;
    }
    public int obtenerCantHoras(){
        return cantHoras;
    }
    public float obtenerValorHoras(){
        return valorHora;
    }
    public String obtenerNombre(){
        return nombre;
    }
    public boolean esEquivalente(Elemento e){
        boolean resultado = false;
        Empleado a = null;
        if(e != null && this.getClass() == e.getClass()){
            a = (Empleado) e;
            resultado = obtenerLegajo() == a.obtenerLegajo();
        }
        return resultado;
    }
    public boolean esMayor(Elemento e){
        boolean resultado = false;
        Empleado empleado = null;
        if(e != null && this.getClass() == e.getClass()){
            empleado = (Empleado) e;
            resultado = obtenerLegajo() > empleado.obtenerLegajo();
        }
        return resultado;
    }
    
}
