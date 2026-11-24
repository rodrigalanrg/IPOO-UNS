package tp8.Examen;

public class MatrizRacional extends MatrizGenerica {

    //Constructor 
    public MatrizRacional(int n, int m){
        super(n,m);
    }
    
    // Consultas
    public int columnasConUnos(int n){
        int cantSeguidos = 0;
        int cant = 0;
        Racional r = null;
        if(n > 0){
            for(int j = 0; j < cantColumnas(); j++){
                cantSeguidos = 0;
                for(int i = 0; i < cantFilas() && cantSeguidos < n; i++){
                    if(mat[i][j] != null){
                        r = (Racional) mat[i][j];
                        if(r.obtenerDen() != 0 && r.obtenerNum() == r.obtenerDen())
                            cantSeguidos++;                 
                        else 
                            cantSeguidos = 0;
                    }
                    else 
                        cantSeguidos = 0;
                }
                if(cantSeguidos >= n)
                    cant++;
            }
        }
        return cant;
    }
}
