/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tipos.modelos;

/**
 *
 * @author Usuario
 */
public class Tipo {
    private String nombre;

    public Tipo(String nombre){
        this.nombre = nombre;
    }
    public Tipo(){
        this(null);
    }
    
    /**
     * @return the nombre
     */
    public String asignarNombre() {
        return nombre;
    }

    /**
     * @param nombre the nombre to set
     */
    public void verNombre(String nombre) {
        this.nombre = nombre;
    }
    
    String ToString(){
        return "";
    }
}
