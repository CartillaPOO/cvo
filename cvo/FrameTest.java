package cvo;

import java.awt.Color;

import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class FrameTest extends JFrame {
    //---Atributos---
    //Posición ventana de la ventana en la pantalla
    private int POSX = 0;
    private int POSY = 290;

    //Dimensiones de la ventana
    private int ANCHO = 440;
    private int ALTO = 300;

    //Labels
    private JLabel lbVentanaPrincipal;
    private JLabel lbMiventana;
    private JLabel lbNewVentanaPrincipal;

    //Paneles
    public PanelTest panelTest;

    public FrameTest(String nombreModelo){
        panelTest = new PanelTest(nombreModelo);
        panelTest.setBounds(0, 0, 440, 300);
        this.add(panelTest);

        //Caracteristicas del dialogo        
        this.setTitle("Test.java");
        this.setSize(ANCHO, ALTO);
        this.setLocation(POSX, POSY);
        this.setResizable(false);
        this.setBackground(new Color(29, 32, 33));
        this.setVisible(true);


    }

    public int getPOSX() {
        return POSX + ANCHO;
    }

    public int getPOSY() {
        return POSY;
    }

    
    
}
