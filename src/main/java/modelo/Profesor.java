/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

public class Profesor extends Persona {

    private String cedula;
    private String area;
    private double salarioPorHora;
    private int horasDictadasMes;

    //constructor
    public Profesor(String nombre, String direccion, String telefono,
                    int diaNacimiento, int mesNacimiento, int anioNacimiento,
                    String cedula, String area,
                    double salarioPorHora, int horasDictadasMes) {
        super(nombre, direccion, telefono, diaNacimiento, mesNacimiento, anioNacimiento);
        this.cedula           = cedula;
        this.area             = area;
        this.salarioPorHora   = salarioPorHora;
        this.horasDictadasMes = horasDictadasMes;
    }

    public String getCedula()               { return cedula; }
    public void setCedula(String c)         { this.cedula = c; }

    public String getArea()                 { return area; }
    public void setArea(String a)           { this.area = a; }

    public double getSalarioPorHora()             { return salarioPorHora; }
    public void setSalarioPorHora(double s)       { this.salarioPorHora = s; }

    public int getHorasDictadasMes()              { return horasDictadasMes; }
    public void setHorasDictadasMes(int h)        { this.horasDictadasMes = h; }

    
     //Salario base = salarioPorHora * horasDictadasMes
     
    public double calcularSalarioBase() {
        return salarioPorHora * horasDictadasMes;
    }

   
   //Pago mensual = salarioBase + 30% de salarioBase
    
    public double calcularPagoMensual() {
        double base = calcularSalarioBase();
        return base + (base * 0.30);
    }

    
    
      //Prestaciones = 19% del pago mensual 
    public double calcularPrestaciones() {
        return calcularPagoMensual() * 0.19;
    }

    //SOBRECARGAA
    public double calcularPagoMensual(int horasExtra) {
        double base = (salarioPorHora * horasDictadasMes) + (salarioPorHora * horasExtra);
        return base + (base * 0.30);
    }

    @Override
    public String toString() {
        return super.toString()
             + " | Cedula: " + cedula
             + " | Area: " + area
             + " | Pago mensual: $" + String.format("%.2f", calcularPagoMensual())
             + " | Prestaciones: $" + String.format("%.2f", calcularPrestaciones());
    }
}
