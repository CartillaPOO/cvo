package cvo;

import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JButton;
import javax.swing.JLabel;

public class EventosLabel implements MouseListener{

    private FrameTest miDialogoTest;

    public EventosLabel(FrameTest principal){
        miDialogoTest = principal;
        miDialogoTest.panelTest.agregarEscuchadores(this);
    }
    @Override
    public void mouseClicked(MouseEvent event) {
        //Eventos primera linea
        if(event.getSource() == miDialogoTest.panelTest.lbVentanaPrincipal){
            System.out.println("VentanaPrincipal");
        }

        if(event.getSource() == miDialogoTest.panelTest.lbMiventana){
            System.out.println("miVentana");
        }

        if(event.getSource() == miDialogoTest.panelTest.lbNewVentanaPrincipal){
            System.out.println("new VentanaPrincipal");
        }

        //Eventos segunda linea
        if(event.getSource() == miDialogoTest.panelTest.lbModelo){
            System.out.println("Modelo");
        }

        if(event.getSource() == miDialogoTest.panelTest.lbMiModelo){
            System.out.println("miModelo");
        }

        if(event.getSource() == miDialogoTest.panelTest.lbNewModelo){
            System.out.println("new Modelo();");
        }

        //Eventos tercera linea
        if(event.getSource() == miDialogoTest.panelTest.lbControlador){
            System.out.println("Controlador");
        }

        if(event.getSource() == miDialogoTest.panelTest.lbMiControlador){
            System.out.println("miControlador");
        }

        if(event.getSource() == miDialogoTest.panelTest.lbNewControlador){
            System.out.println("new Controlador();");
        }

    }

    @Override
    public void mouseEntered(MouseEvent event) {
    }

    @Override
    public void mouseExited(MouseEvent event) {
    }

    @Override
    public void mousePressed(MouseEvent event) {
    }

    @Override
    public void mouseReleased(MouseEvent event) {
    }
    
}
