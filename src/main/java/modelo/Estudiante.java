/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

public class Estudiante extends Persona {

    private String codigo;
    private String grado;
    private double promedio;



    public String getCodigo()              { return codigo; }
    public void setCodigo(String c)        { this.codigo = c; }

    public String getGrado()               { return grado; }
    public void setGrado(String g)         { this.grado = g; }

    public double getPromedio()            { return promedio; }
    public void setPromedio(double p)      { this.promedio = p; }

    //SOBREESCRITURA de toString
    @Override
    public String toString() {
        return super.toString()
             + " | Codigo: " + codigo
             + " | Grado: " + grado
             + " | Promedio: " + promedio;
    }
}
