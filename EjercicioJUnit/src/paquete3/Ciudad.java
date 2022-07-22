/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete3;

/**
 *
 * @author reroes
 */
public class Ciudad {
    private String nombre;
    private int poblacion;

    public void establecerNombre(String nom) {
        nombre = nom;
    }

    public Object obtenerNombre() {
        return nombre;
    }

    public void establecerPoblacion(int nom) {
        poblacion=nom;
    }

    public Object obtenerPoblacion() {
        return poblacion;
    }
    @Override
    public String toString(){
        String cadena = String.format("Ariendo de Local Comida\n"
                + "Nombre Ciudad: %s\n"
                + "Poblacion: %.2f\n", 
                obtenerNombre(),
                obtenerPoblacion());
        
        return cadena;
    }
    
}
