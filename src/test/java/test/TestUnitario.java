/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package test;

import modelo.Profesor;
import modelo.Estudiante;
import modelo.Colegio;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class TestUnitario {

    //Profesor 
    @Test
    public void testProfesorGetNombre() {
        Profesor p = new Profesor("Carlos", "Calle 1", "3001234567",
                10, 5, 1980, "12345678", "Matematicas", 25000.0, 80);
        assertEquals("Carlos", p.getNombre());
    }

    @Test
    public void testProfesorGetCedula() {
        Profesor p = new Profesor("Carlos", "Calle 1", "3001234567",
                10, 5, 1980, "12345678", "Matematicas", 25000.0, 80);
        assertEquals("12345678", p.getCedula());
    }

    @Test
    public void testProfesorGetArea() {
        Profesor p = new Profesor("Carlos", "Calle 1", "3001234567",
                10, 5, 1980, "12345678", "Matematicas", 25000.0, 80);
        assertEquals("Matematicas", p.getArea());
    }

    @Test
    public void testCalcularSalarioBase() {
        Profesor p = new Profesor("Carlos", "Calle 1", "3001234567",
                10, 5, 1980, "12345678", "Matematicas", 25000.0, 80);
        // 25000 * 80 = 2,000,000
        assertEquals(2000000.0, p.calcularSalarioBase(), 0.01);
    }

    @Test
    public void testCalcularPagoMensual() {
        Profesor p = new Profesor("Carlos", "Calle 1", "3001234567",
                10, 5, 1980, "12345678", "Matematicas", 25000.0, 80);
        // base = 2,000,000 → pago = 2,000,000 * 1.30 = 2,600,000
        assertEquals(2600000.0, p.calcularPagoMensual(), 0.01);
    }

    @Test
    public void testCalcularPrestaciones() {
        Profesor p = new Profesor("Carlos", "Calle 1", "3001234567",
                10, 5, 1980, "12345678", "Matematicas", 25000.0, 80);
        // prestaciones = 2,600,000 * 0.19 = 494,000
        assertEquals(494000.0, p.calcularPrestaciones(), 0.01);
    }

    @Test
    public void testCalcularPagoMensualConHorasExtra() {
        Profesor p = new Profesor("Carlos", "Calle 1", "3001234567",
                10, 5, 1980, "12345678", "Matematicas", 25000.0, 80);
        // base = (25000*80 + 25000*10) = 2,250,000 → pago = 2,250,000*1.30
        assertEquals(2925000.0, p.calcularPagoMensual(10), 0.01);
    }

    @Test
    public void testProfesorToStringUsaSuper() {
        Profesor p = new Profesor("Carlos", "Calle 1", "3001234567",
                10, 5, 1980, "12345678", "Matematicas", 25000.0, 80);
        assertTrue(p.toString().contains("Carlos"));
        assertTrue(p.toString().contains("12345678"));
        assertTrue(p.toString().contains("Matematicas"));
    }

    //EEstudiante

    @Test
    public void testEstudianteSettersYGetters() {
        Estudiante e = new Estudiante();
        e.setNombre("Maria");
        e.setCodigo("EST001");
        e.setGrado("10A");
        e.setPromedio(4.5);
        assertEquals("Maria", e.getNombre());
        assertEquals("EST001", e.getCodigo());
        assertEquals("10A", e.getGrado());
        assertEquals(4.5, e.getPromedio(), 0.001);
    }

    @Test
    public void testEstudianteToStringUsaSuper() {
        Estudiante e = new Estudiante();
        e.setNombre("Maria");
        e.setDireccion("Calle 2");
        e.setTelefono("3109876543");
        e.setDiaNacimiento(5);
        e.setMesNacimiento(8);
        e.setAnioNacimiento(2005);
        e.setCodigo("EST001");
        e.setGrado("10A");
        e.setPromedio(4.5);
        assertTrue(e.toString().contains("Maria"));
        assertTrue(e.toString().contains("EST001"));
    }

    //Colegio

    @Test
    public void testColegioAgregarProfesor() {
        Colegio c = new Colegio("Colegio Test");
        Profesor p = new Profesor("Luis", "Calle 3", "3101112233",
                1, 1, 1975, "99887766", "Fisica", 20000.0, 60);
        c.agregarProfesor(p);
        assertEquals(1, c.getProfesores().size());
    }

    @Test
    public void testColegioAgregarEstudiante() {
        Colegio c = new Colegio("Colegio Test");
        Estudiante e = new Estudiante();
        e.setNombre("Ana");
        c.agregarEstudiante(e);
        assertEquals(1, c.getEstudiantes().size());
    }

    @Test
    public void testReporteEstudiantesContieneNombre() {
        Colegio c = new Colegio("Colegio Test");
        Estudiante e = new Estudiante();
        e.setNombre("Pedro");
        c.agregarEstudiante(e);
        assertTrue(c.reporteEstudiantes().contains("Pedro"));
    }
}
