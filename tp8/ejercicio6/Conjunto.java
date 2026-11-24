package tp8.ejercicio6;

public class Conjunto {

    // Atributos Instancia
    protected Elemento [] ce;
    protected int cantElementos;

    // Constructor 
    public Conjunto(int max){
        ce = new Elemento[max];
        cantElementos = 0;
    }
    
    // Comandos
    public void insertar(Elemento e){
        if(!pertenece()){
            ce[cantElementos] = e;
        }
    }

    // Consultas
    public Elemento obtener(int pos){
        
    }
    
}
