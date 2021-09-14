/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package autores.modelos;

/**
 *
 * @author Usuario
 */
public class Profesor {
    private int dni;
    private String apellidos;
    private String nombres;
    private String clave;
    private String cargo;

    public Profesor(int dni, String apellidos, String nombres, String clave, String cargo){
        this.dni = dni;
        this.apellidos = apellidos;
        this.nombres = nombres;
        this.clave = clave;
        this.cargo = cargo;
    }
    
    public Profesor(){
        this(0, null, null, null, null);
    }
    
    /**
     * @return the dni
     */
    public int verDni() {
        return dni;
    }

    /**
     * @param dni the dni to set
     */
    public void asignarDni(int dni) {
        this.dni = dni;
    }

    /**
     * @return the apellidos
     */
    public String verApellidos() {
        return apellidos;
    }

    /**
     * @param apellidos the apellidos to set
     */
    public void asignarApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    /**
     * @return the nombres
     */
    public String verNombres() {
        return nombres;
    }

    /**
     * @param nombres the nombres to set
     */
    public void asignarNombres(String nombres) {
        this.nombres = nombres;
    }

    /**
     * @return the clave
     */
    public String verClave() {
        return clave;
    }

    /**
     * @param clave the clave to set
     */
    public void asignarClave(String clave) {
        this.clave = clave;
    }

    /**
     * @return the cargo
     */
    public String verCargo() {
        return cargo;
    }

    /**
     * @param cargo the cargo to set
     */
    public void asignarCargo(String cargo) {
        this.cargo = cargo;
    }
    
    void mostrar(){
        
    }
}
