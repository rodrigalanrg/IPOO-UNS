package tp8.Examen.Examen2;

public class MatrizGenerica {

    // Atributos
    protected Elemento [][] mat;

    // Constructor 
    public MatrizGenerica(int n, int m){
        mat = new Elemento [n][m];
    }

    // Comandos
    public void establecerEnPos(int fila, int col, Elemento e){
        if(fila >= 0 && fila < cantFilas() && col >= 0 && col < cantColumnas()){
            mat[fila][col] = e;
        }
    }
    public void desplazarDerecha(){
        Elemento aux = null;
        for(int i = 0; i < cantFilas(); i++){
            aux = mat[i][cantColumnas() - 1];
            for(int j = cantColumnas() - 1; j > 0; j++){
                mat[i][j] = mat[i][j - 1];
            }
            mat[i][0] = aux;
        }
    }

    // Consultas
    public Elemento obtenerElemento(int fila, int col){
        Elemento resultado = null;
        if(fila >= 0 && fila < cantFilas() && col >= 0 && col < cantColumnas()){
            resultado = mat[fila][col];
        }
        return resultado;
    }
    public int cantFilas(){
        return mat.length;
    }
    public int cantColumnas(){
        return mat[0].length;
    }
    public boolean NigualesEnC(MatrizGenerica m, int c, int n){
        int resultado = 0;
        for(int i = 0; i < cantFilas() && resultado < n; i++){
            if(mat[i][c] != null && m.obtenerElemento(i, c) != null && mat[i][c].inverso(m.obtenerElemento(i, c))){
                resultado++;
            }
            else 
                resultado = 0;
        }
        return resultado >= n;

    }
}