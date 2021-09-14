/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package idiomas.modelos;

/**
 *
 * @author Usuario
 */
public class Idioma {
    private String nombre;

    public Idioma(String nombre){
        this.nombre = nombre;
    }
    public Idioma(){
        this(null);
    }
    /**
     * @return the nombre
     */
    public String verNombre() {
        return nombre;
    }

    /**
     * @param nombre the nombre to set
     */
    public void asignarNombre(String nombre) {
        this.nombre = nombre;
    }
    
    String ToString(){
        return "";
    }
}
