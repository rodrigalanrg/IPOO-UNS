package tp8.Examen.Examen2;

public class Vector extends Elemento {

    // Atributos Instancia 
    protected int x;
    protected int y;
    protected int z;

    // Constructor
    public Vector(int px, int py, int pz){
        x = px;
        y = py;
        z = pz;
    }

    // Consultas
    public int obtenerX(){
        return x;
    }
    public int obtenerY(){
        return y;
    }
    public int obtenerZ(){
        return z;
    }
    public boolean Inverso(Elemento e){
        boolean resultado = false;
        Vector v = null;
        if(e != null && this.getClass() == e.getClass()){
            v = (Vector) e;
            resultado = obtenerX() == v.obtenerZ() && obtenerZ() == v.obtenerX();
        }
        return resultado;
    }
    
}
