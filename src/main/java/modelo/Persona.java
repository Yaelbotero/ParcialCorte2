/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

public class Persona {

    private String nombre;
    private String direccion;
    private String telefono;
    private int diaNacimiento;
    private int mesNacimiento;
    private int anioNacimiento;


    public Persona() {
    }

    public Persona(String nombre, String direccion, String telefono,
                   int diaNacimiento, int mesNacimiento, int anioNacimiento) {
        this.nombre          = nombre;
        this.direccion       = direccion;
        this.telefono        = telefono;
        this.diaNacimiento   = diaNacimiento;
        this.mesNacimiento   = mesNacimiento;
        this.anioNacimiento  = anioNacimiento;
    }

    public String getNombre()           { return nombre; }
    public void setNombre(String n)     { this.nombre = n; }

    public String getDireccion()           { return direccion; }
    public void setDireccion(String d)     { this.direccion = d; }

    public String getTelefono()            { return telefono; }
    public void setTelefono(String t)      { this.telefono = t; }

    public int getDiaNacimiento()          { return diaNacimiento; }
    public void setDiaNacimiento(int d)    { this.diaNacimiento = d; }

    public int getMesNacimiento()          { return mesNacimiento; }
    public void setMesNacimiento(int m)    { this.mesNacimiento = m; }

    public int getAnioNacimiento()         { return anioNacimiento; }
    public void setAnioNacimiento(int a)   { this.anioNacimiento = a; }

    public String getDatosPersonales() {
        return "Nombre: " + nombre
             + " | Direccion: " + direccion
             + " | Telefono: " + telefono
             + " | Fecha nac: " + diaNacimiento + "/" + mesNacimiento + "/" + anioNacimiento;
    }

    @Override
    public String toString() {
        return getDatosPersonales();
    }
}