/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package palabrascables.modelos;

/**
 *
 * @author Usuario
 */
public class PalabraClave {
    private String nombre;
    
    public PalabraClave(String nombre){
        this.nombre = nombre;
    }
    public PalabraClave(){
        this(null);
    }
    
    /**
     * @return the nombre
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * @param nombre the nombre to set
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
     String ToString(){
        return "";
    }
}
