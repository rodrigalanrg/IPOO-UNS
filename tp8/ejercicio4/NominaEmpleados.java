package tp8.ejercicio4;

import tp8.ejercicio2.Coleccion;

public class NominaEmpleados extends Coleccion {

    // Constructor 
    public NominaEmpleados(int n){
        super(n);
    }
    
    // Consultas
    public int contarSupHoras(int h){
        int cant = 0;
        Empleado empleado = null;
        for(int i = 0; i < cant; i++){
            if(col[i].getClass() == Empleado.class || col[i].getClass() == Tecnico.class){
                empleado = (Empleado) col[i];
                if(empleado.obtenerCantHoras() > h)
                    cant++;
            }
        }
        return cant;
    }
    public float sumarSueldos(){
        float suma = 0;
        Empleado e = null;
        for(int i = 0; i < cant; i++){
            if(col[i].getClass() == Empleado.class || col[i].getClass() == Tecnico.class){
                e = (Empleado) col[i];
                suma = suma + e.obtenerSueldo();
            }
        }
        return suma;
    }
    
}
