/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controlador;

import modelo.Colegio;
import modelo.Estudiante;
import modelo.Profesor;
import vista.ColegioVista;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ColegioControlador {

    private Colegio colegio;
    private ColegioVista vista;

    public ColegioControlador(Colegio colegio, ColegioVista vista) {
        this.colegio = colegio;
        this.vista   = vista;
        initEventos();
    }

    private void initEventos() {

        //Agregamos Profesor
        vista.getBtnAgregarProfesor().addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    Profesor p = new Profesor(
                        vista.getCampoNombreP(),
                        vista.getCampoDireccionP(),
                        vista.getCampoTelefonoP(),
                        vista.getCampoDiaP(),
                        vista.getCampoMesP(),
                        vista.getCampoAnioP(),
                        vista.getCampoCedulaP(),
                        vista.getCampoAreaP(),
                        vista.getCampoSalarioHoraP(),
                        vista.getCampoHorasP()
                    );
                    colegio.agregarProfesor(p);
                    vista.mostrarResultado("Profesor agregado correctamente.\n" + p.toString());
                    vista.limpiarCamposProfesor();
                } catch (NumberFormatException ex) {
                    vista.mostrarError("Verifica que dia, mes, anio, salario y horas sean numeros validos.");
                }
            }
        });

        //Agregamos estudiante
        vista.getBtnAgregarEstudiante().addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    Estudiante est = new Estudiante();
                    est.setNombre(vista.getCampoNombreE());
                    est.setDireccion(vista.getCampoDireccionE());
                    est.setTelefono(vista.getCampoTelefonoE());
                    est.setDiaNacimiento(vista.getCampoDiaE());
                    est.setMesNacimiento(vista.getCampoMesE());
                    est.setAnioNacimiento(vista.getCampoAnioE());
                    est.setCodigo(vista.getCampoCodigoE());
                    est.setGrado(vista.getCampoGradoE());
                    est.setPromedio(vista.getCampoPromedioE());
                    colegio.agregarEstudiante(est);
                    vista.mostrarResultado("Estudiante agregado correctamente.\n" + est.toString());
                    vista.limpiarCamposEstudiante();
                } catch (NumberFormatException ex) {
                    vista.mostrarError("Verifica que dia, mes, anio y promedio sean numeros validos.");
                }
            }
        });

        //Reporte Estudiantes
        vista.getBtnReporteEstudiantes().addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                vista.mostrarResultado(colegio.reporteEstudiantes());
            }
        });

        //Reporte Profesores por salario
        vista.getBtnReporteProfesores().addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                vista.mostrarResultado(colegio.reporteProfesoresPorSalario());
            }
        });
    }

    public Colegio getColegio() { return colegio; }
}
