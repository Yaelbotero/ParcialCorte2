/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package vista;

import javax.swing.*;
import java.awt.*;

public class ColegioVista extends JFrame {


    private JTextField campoNombreP, campoDireccionP, campoCedulaP;
    private JTextField campоAreaP, campoSalarioHoraP, campoHorasP;
    private JTextField campoTelefonoP, campoDiaP, campoMesP, campoAnioP;


    private JTextField campoNombreE, campoDireccionE, campoTelefonoE;
    private JTextField campoDiaE, campoMesE, campoAnioE;
    private JTextField campoCodigoE, campoGradoE, campoPromedioE;

    //Botonees
    private JButton btnAgregarProfesor;
    private JButton btnAgregarEstudiante;
    private JButton btnReporteEstudiantes;
    private JButton btnReporteProfesores;

    //Área de resultados
    private JTextArea areaResultados;

    public ColegioVista() {
        initComponentes();
    }

    private void initComponentes() {
        setTitle("Sistema Colegio - POO");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(620, 700);
        setLocationRelativeTo(null);
        setLayout(new BorderLayout(8, 8));

        //Panel Profesor
        JPanel panelP = new JPanel(new GridLayout(5, 4, 5, 5));
        panelP.setBorder(BorderFactory.createTitledBorder("Datos del Profesor"));

        panelP.add(new JLabel("Nombre:"));
        campoNombreP = new JTextField();
        panelP.add(campoNombreP);

        panelP.add(new JLabel("Cedula:"));
        campoCedulaP = new JTextField();
        panelP.add(campoCedulaP);

        panelP.add(new JLabel("Direccion:"));
        campoDireccionP = new JTextField();
        panelP.add(campoDireccionP);

        panelP.add(new JLabel("Telefono:"));
        campoTelefonoP = new JTextField();
        panelP.add(campoTelefonoP);

        panelP.add(new JLabel("Dia nac:"));
        campoDiaP = new JTextField();
        panelP.add(campoDiaP);

        panelP.add(new JLabel("Mes nac:"));
        campoMesP = new JTextField();
        panelP.add(campoMesP);

        panelP.add(new JLabel("Anio nac:"));
        campoAnioP = new JTextField();
        panelP.add(campoAnioP);

        panelP.add(new JLabel("Area:"));
        campоAreaP = new JTextField();
        panelP.add(campоAreaP);

        panelP.add(new JLabel("Salario/hora:"));
        campoSalarioHoraP = new JTextField();
        panelP.add(campoSalarioHoraP);

        panelP.add(new JLabel("Horas/mes:"));
        campoHorasP = new JTextField();
        panelP.add(campoHorasP);

        btnAgregarProfesor = new JButton("Agregar Profesor");
        panelP.add(btnAgregarProfesor);
        panelP.add(new JLabel(""));

        //Panel Estudiante
        JPanel panelE = new JPanel(new GridLayout(4, 4, 5, 5));
        panelE.setBorder(BorderFactory.createTitledBorder("Datos del Estudiante"));

        panelE.add(new JLabel("Nombre:"));
        campoNombreE = new JTextField();
        panelE.add(campoNombreE);

        panelE.add(new JLabel("Codigo:"));
        campoCodigoE = new JTextField();
        panelE.add(campoCodigoE);

        panelE.add(new JLabel("Direccion:"));
        campoDireccionE = new JTextField();
        panelE.add(campoDireccionE);

        panelE.add(new JLabel("Telefono:"));
        campoTelefonoE = new JTextField();
        panelE.add(campoTelefonoE);

        panelE.add(new JLabel("Dia nac:"));
        campoDiaE = new JTextField();
        panelE.add(campoDiaE);

        panelE.add(new JLabel("Mes nac:"));
        campoMesE = new JTextField();
        panelE.add(campoMesE);

        panelE.add(new JLabel("Anio nac:"));
        campoAnioE = new JTextField();
        panelE.add(campoAnioE);

        panelE.add(new JLabel("Grado:"));
        campoGradoE = new JTextField();
        panelE.add(campoGradoE);

        panelE.add(new JLabel("Promedio:"));
        campoPromedioE = new JTextField();
        panelE.add(campoPromedioE);

        btnAgregarEstudiante = new JButton("Agregar Estudiante");
        panelE.add(btnAgregarEstudiante);
        panelE.add(new JLabel(""));
        panelE.add(new JLabel(""));


        JPanel panelReportes = new JPanel(new GridLayout(1, 2, 8, 8));
        panelReportes.setBorder(BorderFactory.createTitledBorder("Reportes"));
        btnReporteEstudiantes = new JButton("Reporte Estudiantes");
        btnReporteProfesores  = new JButton("Reporte Profesores (salario)");
        panelReportes.add(btnReporteEstudiantes);
        panelReportes.add(btnReporteProfesores);


        areaResultados = new JTextArea(8, 50);
        areaResultados.setEditable(false);
        areaResultados.setFont(new Font("Monospaced", Font.PLAIN, 11));
        areaResultados.setText("Bienvenido al sistema del colegio.");
        JScrollPane scroll = new JScrollPane(areaResultados);
        scroll.setBorder(BorderFactory.createTitledBorder("Resultados"));

        // Ensamble
        JPanel panelNorte = new JPanel(new GridLayout(3, 1, 5, 5));
        panelNorte.add(panelP);
        panelNorte.add(panelE);
        panelNorte.add(panelReportes);

        add(panelNorte, BorderLayout.NORTH);
        add(scroll, BorderLayout.CENTER);
    }

    //Getters campos Profesor
    public String getCampoNombreP()      { return campoNombreP.getText(); }
    public String getCampoDireccionP()   { return campoDireccionP.getText(); }
    public String getCampoCedulaP()      { return campoCedulaP.getText(); }
    public String getCampoAreaP()        { return campоAreaP.getText(); }
    public String getCampoTelefonoP()    { return campoTelefonoP.getText(); }
    public int getCampoDiaP()            { return Integer.parseInt(campoDiaP.getText()); }
    public int getCampoMesP()            { return Integer.parseInt(campoMesP.getText()); }
    public int getCampoAnioP()           { return Integer.parseInt(campoAnioP.getText()); }
    public double getCampoSalarioHoraP() { return Double.parseDouble(campoSalarioHoraP.getText()); }
    public int getCampoHorasP()          { return Integer.parseInt(campoHorasP.getText()); }

    //Getters campos Estudiante
    public String getCampoNombreE()      { return campoNombreE.getText(); }
    public String getCampoDireccionE()   { return campoDireccionE.getText(); }
    public String getCampoTelefonoE()    { return campoTelefonoE.getText(); }
    public int getCampoDiaE()            { return Integer.parseInt(campoDiaE.getText()); }
    public int getCampoMesE()            { return Integer.parseInt(campoMesE.getText()); }
    public int getCampoAnioE()           { return Integer.parseInt(campoAnioE.getText()); }
    public String getCampoCodigoE()      { return campoCodigoE.getText(); }
    public String getCampoGradoE()       { return campoGradoE.getText(); }
    public double getCampoPromedioE()    { return Double.parseDouble(campoPromedioE.getText()); }

    //Getters botones
    public JButton getBtnAgregarProfesor()    { return btnAgregarProfesor; }
    public JButton getBtnAgregarEstudiante()  { return btnAgregarEstudiante; }
    public JButton getBtnReporteEstudiantes() { return btnReporteEstudiantes; }
    public JButton getBtnReporteProfesores()  { return btnReporteProfesores; }

    //MMostrar resultados y errores
    public void mostrarResultado(String texto)  { areaResultados.setText(texto); }
    public void mostrarError(String error) {
        JOptionPane.showMessageDialog(this, error, "Error", JOptionPane.ERROR_MESSAGE);
    }

    public void limpiarCamposProfesor() {
        campoNombreP.setText(""); campoDireccionP.setText("");
        campoCedulaP.setText(""); campоAreaP.setText("");
        campoTelefonoP.setText(""); campoDiaP.setText("");
        campoMesP.setText(""); campoAnioP.setText("");
        campoSalarioHoraP.setText(""); campoHorasP.setText("");
    }

    public void limpiarCamposEstudiante() {
        campoNombreE.setText(""); campoDireccionE.setText("");
        campoTelefonoE.setText(""); campoDiaE.setText("");
        campoMesE.setText(""); campoAnioE.setText("");
        campoCodigoE.setText(""); campoGradoE.setText("");
        campoPromedioE.setText("");
    }
}
