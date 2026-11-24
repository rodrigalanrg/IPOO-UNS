package tp8.ejercicio5;

public class MatrizGenerica {

    // Atributos instancia
    protected Elemento [][] m;

    // Constructor
    public MatrizGenerica(int nf, int nc){
        m = new Elemento[nf][nc];
    }

    // Comandos
    public void establecer(int f, int c, Elemento e){
        if(f >= 0 && f < cantFilas() && c >= 0 && c < cantColumnas()){
            m[f][c] = e;
        }
    }

    // Consultas
    public Elemento obtener(int f, int c){
        return m[f][c];
    }
    public int cantFilas(){
        return m.length;
    }
    public int cantColumnas(){
        return m[0].length;
    }
    public boolean pertenece(Elemento e){
        boolean resultado = false;
        for(int i = 0; i < cantFilas() && !resultado; i++){
            for(int j = 0; j < cantColumnas() && !resultado; j++){
                if(e != null && m[i][j] != null && m[i][j].equals(e)){
                    resultado = true;
                }
            }
        }
        return resultado;
    }
    public int contarElem(Elemento e){
        int cant = 0;
        for(int i = 0; i < cantFilas(); i++){
            for(int j = 0; j < cantColumnas(); j++){
                if(e != null && m[i][j] != null && m[i][j].equals(e)){
                    cant++;
                 }
            }
        }
        return cant;
    }
    public boolean esEquivalente(MatrizGenerica c){
        boolean resultado = false;
        if(cantFilas() == c.cantFilas() && cantColumnas() == c.cantColumnas()){
            resultado = true;
            for(int i = 0; i < cantFilas() && resultado; i++){
                for(int j = 0; j < cantColumnas() && resultado; j++){
                    if(m[i][j] != null && c.obtener(i, j) != null && !m[i][j].equals(c.obtener(i, j))){
                        resultado = false;

                    }
                }
            }
        }
        return resultado;
    }
    public boolean esComplemento(MatrizGenerica c){
        boolean resultado = false;
        if(cantFilas() == c.cantFilas() && cantColumnas() == c.cantColumnas()){
            resultado = true;
            for(int i = 0; i < cantFilas() && resultado; i++){
                for(int j = 0; j < cantColumnas() && resultado; j++){
                    if(m[i][j] != null && c.obtener(i, j) != null && !(m[i][j].complemento() == c.obtener(i, j).complemento())){
                        resultado = false;

                    }
                }
            }
        }
        return resultado;
    }
    public MatrizGenerica clone(){
        
    }

    
}
