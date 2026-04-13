/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package test;

import modelo.Colegio;
import modelo.Estudiante;
import modelo.Profesor;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class TestIntegracion {

    private Colegio colegio;
    private Profesor p1, p2;
    private Estudiante e1;

    @BeforeEach
    public void setUp() {
        colegio = new Colegio("Colegio POO");

        p1 = new Profesor("Carlos", "Calle 1", "3001234567",
                10, 5, 1980, "12345678", "Matematicas", 25000.0, 80);
        p2 = new Profesor("Laura", "Calle 2", "3119876543",
                15, 3, 1985, "87654321", "Ciencias", 20000.0, 60);

        e1 = new Estudiante();
        e1.setNombre("Maria");
        e1.setDireccion("Calle 5");
        e1.setTelefono("3201112233");
        e1.setDiaNacimiento(10);
        e1.setMesNacimiento(7);
        e1.setAnioNacimiento(2008);
        e1.setCodigo("EST001");
        e1.setGrado("9B");
        e1.setPromedio(4.2);

        colegio.agregarProfesor(p1);
        colegio.agregarProfesor(p2);
        colegio.agregarEstudiante(e1);
    }

    @Test
    public void testColegioTieneDosProf() {
        assertEquals(2, colegio.getProfesores().size());
    }

    @Test
    public void testColegioTieneUnEstudiante() {
        assertEquals(1, colegio.getEstudiantes().size());
    }

    @Test
    public void testReporteEstudiantesContieneMariaYCodigo() {
        String reporte = colegio.reporteEstudiantes();
        assertTrue(reporte.contains("Maria"));
        assertTrue(reporte.contains("EST001"));
    }

    @Test
    public void testReporteProfesoresOrdenadoMayorAMenor() {
        //Carlos: 25000*80*1.30 = 2,600,000
        //Laura:  20000*60*1.30 = 1,560,000
        //Carlos debe aparecer primero
        String reporte = colegio.reporteProfesoresPorSalario();
        int posCarlos = reporte.indexOf("Carlos");
        int posLaura  = reporte.indexOf("Laura");
        assertTrue(posCarlos < posLaura);
    }

    @Test
    public void testReporteProfesoresContienePrestaciones() {
        String reporte = colegio.reporteProfesoresPorSalario();
        assertTrue(reporte.contains("Prestaciones"));
    }

    @Test
    public void testPolimorfismoToString() {
        modelo.Persona ref1 = p1;
        modelo.Persona ref2 = e1;
        assertTrue(ref1.toString().contains("Matematicas"));
        assertTrue(ref2.toString().contains("EST001"));
    }
}
