package ProyectoGUI;
public class MatrizColor {
    
    //Atributos de instancia
    private ColorRGB[][] m;
    
    //Constructor 
    public MatrizColor(int cantf, int cantc){
        m = new ColorRGB[cantf][cantc];
        for(int f=0; f<m.length; f++){
            for(int c=0; c<m[0].length; c++){
                m[f][c] = new ColorRGB(255,255,255);
            }
        }
    }
    
    //Comandos
    public void establecerColor(int f, int c, ColorRGB col){
      m[f][c] = col;  
    }  
    
    //Consultas
    public ColorRGB obtenerColor(int f, int c){
        return m[f][c];
    }
    
    public int cantFilas(){
        return m.length;
    }
    
    public int cantColumnas(){
        return m[0].length;
    }
}
