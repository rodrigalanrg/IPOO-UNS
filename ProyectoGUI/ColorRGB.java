package ProyectoGUI;
public class ColorRGB{   
    //Atributos de instancia
    private int rojo;
    private int verde;
    private int azul;
   
    //Constructor
    public ColorRGB(int r, int v, int a){
        rojo = r;
        verde = v;
        azul = a;
    }

    //Consultas
    public int obtenerRojo(){
        return rojo;
    }
    
    public int obtenerVerde(){
        return verde;
    } 
    
    public int obtenerAzul(){
        return azul;
    } 
    
    private boolean valorValido(int x){
        return x>=0 && x<=255;
    }

    //Comandos
    public boolean establecerRojo(int r){
        boolean pude = false;
        if(valorValido(r)){
            rojo = r;
            pude = true;
        }
        return pude;
    }
    
    public boolean establecerVerde(int v){
        boolean pude = false;
        if(valorValido(v)){
            verde = v;
            pude = true;
        }
        return pude;
    }
    
    public boolean establecerAzul(int a){
        boolean pude = false;
        if(valorValido(a)){
            azul = a;
            pude = true;
        }  
        return pude;
    }
    
    public String toString(){
        return "("+rojo+","+verde+","+azul+")";
    }

}
