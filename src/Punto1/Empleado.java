//clase Empleado, la cual posee un legajo, dni, nombre, fecha de  nacimiento  y  correo  electrónico

package Punto1;

import java.time.LocalDate;

public class Empleado {
    private int legajo;
    private int dni;
    private String nombre;
    private LocalDate fechaNacimiento;
    private String correoElectronico;
    
    public Empleado() {
    }

    public Empleado(int legajo, int dni, String nombre, LocalDate fechaNacimiento, String correoElectronico) {
        this.legajo = legajo;
        this.dni = dni;
        this.nombre = nombre;
        this.fechaNacimiento = fechaNacimiento;
        this.correoElectronico = correoElectronico;
    }

    public int getLegajo() {
        return legajo;
    }

    public void setLegajo(int legajo) {
        this.legajo = legajo;
    }

    public int getDni() {
        return dni;
    }

    public void setDni(int dni) {
        this.dni = dni;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public LocalDate getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(LocalDate fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public String getCorreoElectronico() {
        return correoElectronico;
    }

    public void setCorreoElectronico(String correoElectronico) {
        this.correoElectronico = correoElectronico;
    }

    @Override
    public String toString() {
        return "Empleado [legajo=" + legajo + ", dni=" + dni + ", nombre=" + nombre + ", fechaNacimiento="
                + fechaNacimiento + ", correoElectronico=" + correoElectronico + "]";
    }
}