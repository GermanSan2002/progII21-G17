/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package grupos.modelos;

/**
 *
 * @author Usuario
 */
public class Grupo {
    private String nombre;
    private String descripcion;

    public Grupo(String nombre, String descripcion){
        this.nombre = nombre;
        this.descripcion = descripcion;
    }
    
    public Grupo(){
        this(null, null);
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

    /**
     * @return the descripcion
     */
    public String verDescripcion() {
        return descripcion;
    }

    /**
     * @param descripcion the descripcion to set
     */
    public void asignarDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
    
    void mostrar(){
        
    }
}
