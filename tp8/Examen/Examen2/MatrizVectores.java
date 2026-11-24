package tp8.Examen.Examen2;

import tp8.Examen.Racional;

public class MatrizVectores extends MatrizGenerica {

    // Constructor 
    public MatrizVectores(int n, int m){
        super(n,m);
    }

    // Consulta 
    public boolean siempreCero(){
        boolean resultado = false;
        Vector r = null;
        for(int i = 0; i < cantFilas() && !resultado; i++){
            for(int j = 0; j < cantColumnas() && !resultado; j++){
                r = (Vector) mat[i][j];
                if(r != null && r.obtenerX() == 0 && r.obtenerY() == 0 && r.obtenerZ() == 0){
                    resultado = true;
                }
            }
        }
        return resultado;
    }
    
}



