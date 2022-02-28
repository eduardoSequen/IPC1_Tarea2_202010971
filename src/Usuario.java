/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Bienvenido
 */
public class Usuario {
    
    private String nombre = "Juan Sequen";
    private int carne = 202010971;
    
    public Usuario(String nombre, int carne){
    this.nombre = nombre;
    this.carne = carne;
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

    /**
     * @return the carne
     */
    public int getCarne() {
        return carne;
    }

    /**
     * @param carne the carne to set
     */
    public void setCarne(int carne) {
        this.carne = carne;
    }
    
}
