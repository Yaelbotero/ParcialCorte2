/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package main;

import controlador.ColegioControlador;
import modelo.Colegio;
import vista.ColegioVista;

public class SegundoParcial {

    public static void main(String[] args) {
        javax.swing.SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                Colegio colegio            = new Colegio("Colegio POO");
                ColegioVista vista         = new ColegioVista();
                ColegioControlador ctrl    = new ColegioControlador(colegio, vista);
                vista.setVisible(true);
            }
        });
    }
}
