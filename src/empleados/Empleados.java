/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package empleados;

/**
 *
 * @author csuarez25
 */
public class Empleados {

    private int identificacion;
    private String nombre;
    private String apellido;
    private String dirrecion;
    private long celular;
    private String correo;

    public Empleados() {
        identificacion = 0;
        nombre = "";
        apellido = "";
        dirrecion = "";
        celular = 0;
        correo = "";
    }

    public int getIdentificacion() {
        return identificacion;
    }

    public void setIdentificacion(int identificacion) {
        this.identificacion = identificacion;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getDirrecion() {
        return dirrecion;
    }

    public void setDirrecion(String dirrecion) {
        this.dirrecion = dirrecion;
    }

    public long getCelular() {
        return celular;
    }

    public void setCelular(long celular) {
        this.celular = celular;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public  String mostrar() {

        String info = "-Id: " + this.identificacion + "\n-Nombre: " + this.nombre + "\n-Apellido: " + this.apellido + "\n-Dirreción: " + this.dirrecion + "\n-Celular: " + this.celular
                + "\n-Correo: " + this.correo;

        return info;
    }

}
