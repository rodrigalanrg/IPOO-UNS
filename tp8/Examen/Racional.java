package tp8.Examen;

public class Racional extends Elemento {

    // Atributos de Instancia
    protected int num;
    protected int den;

    // Constructor 
    public Racional(int n, int d){
        num = n;
        den = d;
    }

    // Comandos
    public void establecerNum(int n){
        num = n;
    }
    public void establecerDen(int d){
        den = d;
    }
    
    // Consultas
    public int obtenerNum(){
        return num;
    }
    public int obtenerDen(){
        return den;
    }
    public boolean esComplemento(Elemento e){
        boolean resultado = false;
        Racional r = null;
        if(e != null && this.getClass() == e.getClass()){
            r = (Racional) e;
            if(obtenerNum() * r.obtenerNum() == obtenerDen() * r.obtenerDen()){
                resultado = true;
            }
        }
        return resultado;
    }
    public boolean esNeutro(){
        boolean resultado = false;
        if(obtenerDen() == 1 || obtenerNum() == 1){
            resultado = true;
        }
        return resultado;
    }
}
