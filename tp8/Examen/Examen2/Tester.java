package tp8.Examen.Examen2;

public class Tester {
    public static void main(String[] args) {
        MatrizVectores m = new MatrizVectores(1,3);

        // Fila 1 (Corta por bandera booleana)
        m.establecerEnPos(0, 0, new Vector(0, 0, 0));
        m.establecerEnPos(0, 1, new Vector(4, 6, 2));
        m.establecerEnPos(0, 2, new Vector(2, 1, 8));

        // Imprimir resultado en pantalla
        System.out.println("Esperamos que retorne true y lo que nos da es  " +m.siempreCero());

        // 
    }
}

