/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

import java.util.ArrayList;
import java.util.List;

public class Colegio {

    private String nombre;
    private List<Profesor> profesores;
    private List<Estudiante> estudiantes;

    public Colegio(String nombre) {
        this.nombre      = nombre;
        this.profesores  = new ArrayList<>();
        this.estudiantes = new ArrayList<>();
    }

    public String getNombre()                    { return nombre; }
    public void setNombre(String n)              { this.nombre = n; }

    public List<Profesor> getProfesores()        { return profesores; }
    public List<Estudiante> getEstudiantes()     { return estudiantes; }

    public void agregarProfesor(Profesor p) {
        profesores.add(p);
    }

    public void agregarEstudiante(Estudiante e) {
        estudiantes.add(e);
    }

    
    //lista de estudiantes registrados.
     
    public String reporteEstudiantes() {
        if (estudiantes.isEmpty()) {
            return "No hay estudiantes registrados.";
        }
        StringBuilder sb = new StringBuilder();
        sb.append("=== REPORTE DE ESTUDIANTES ===\n");
        sb.append("Total: ").append(estudiantes.size()).append("\n\n");
        for (Estudiante e : estudiantes) {
            sb.append(e.toString()).append("\n");
            sb.append("-----------------------------\n");
        }
        return sb.toString();
    }

    //Reporte 2: lista de profesores ordenada por salario total de mayor a menor.

    public String reporteProfesoresPorSalario() {
        if (profesores.isEmpty()) {
            return "No hay profesores registrados.";
        }

        List<Profesor> ordenados = new ArrayList<>(profesores);

        //burbuja de mayor a menor por pago mensual
        for (int i = 0; i < ordenados.size() - 1; i++) {
            for (int j = 0; j < ordenados.size() - 1 - i; j++) {
                if (ordenados.get(j).calcularPagoMensual()
                        < ordenados.get(j + 1).calcularPagoMensual()) {
                    Profesor temp = ordenados.get(j);
                    ordenados.set(j, ordenados.get(j + 1));
                    ordenados.set(j + 1, temp);
                }
            }
        }

        StringBuilder sb = new StringBuilder();
        sb.append("=== REPORTE DE PROFESORES (mayor a menor salario) ===\n");
        sb.append("Total: ").append(ordenados.size()).append("\n\n");
        for (Profesor p : ordenados) {
            sb.append(p.toString()).append("\n");
            sb.append("-----------------------------\n");
        }
        return sb.toString();
    }
}
