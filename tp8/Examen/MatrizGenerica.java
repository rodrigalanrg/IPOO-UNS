package tp8.Examen;

public class MatrizGenerica {

    // Atributos instancia
    protected Elemento [][] mat;

    // Constructor 
    public MatrizGenerica(int n, int m){
        mat = new Elemento[n][m];
    }
    
    // Comandos
    public void establecer(int f, int c, Elemento e){
        if(f >= 0 && f < cantFilas() && c >= 0 && c < cantColumnas()){
            mat[f][c] = e;
        }
    }

    // Consultas
    public Elemento obtener(int f, int c){
        Elemento e = null;
        if(f >= 0 && f < cantFilas() && c >= 0 && c < cantColumnas()){
            e = mat[f][c];
        }
        return e;
    }
    public int cantFilas(){
        return mat.length;
    }
    public int cantColumnas(){
        return mat[0].length;
    }
    public boolean enTodasUnNeutro(){
        boolean resultado = true;
        for(int i = 0; i < cantFilas() && resultado; i++){
            for(int j = 0; j < cantColumnas() && resultado; j++){
                if(mat[i][j] != null && !mat[i][j].esNeutro()){
                    resultado = false;
                }
            }
        }
        return resultado;
    }
    public boolean filaComplemento(int f, MatrizGenerica m){
        boolean resultado = true;
         for(int i = 0; i < cantFilas() && resultado; i++){
            for(int j = 0; j < cantColumnas() && resultado; j++){
                if(mat[i][j] != null && m.obtener(i, j) != null && !mat[i][j].esComplemento(m.obtener(i, j))){
                    resultado = false;
                }
            }
    }
}
