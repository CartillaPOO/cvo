package cvo.controlador;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JButton;
import javax.swing.JLabel;

import cvo.vista.FrameTest;

public class EventosLabel implements MouseListener{

    //Atributos
    private FrameTest miDialogoTest;

    public EventosLabel(FrameTest principal){
        miDialogoTest = principal;
        miDialogoTest.panelTest.agregarEscuchadores(this);
    }
    @Override
    public void mouseClicked(MouseEvent event) {
        String nombreModelo = miDialogoTest.panelTest.getNombreModelo();
        String Evento = event.getSource().toString();
        //Eventos primera linea
        if(Evento.equals("VentanaPrincipal ")){
            System.out.println("VentanaPrincipal");
        }

        if(Evento.equals("miVentana = ")){
            System.out.println("miVentana");
        }

        if(Evento.equals("new VentanaPrincipal();")){
            //Aqui se colocan las instancias del sistema MVC
            
            System.out.println("new VentanaPrincipal();");
        }

        //Eventos segunda linea
        if(Evento.equals(nombreModelo + " ")){
            System.out.println("Modelo");
        }

        if(Evento.equals("mi" + nombreModelo + " = ")){
            System.out.println("miModelo");
        }

        if(Evento.equals("new " + nombreModelo + "();")){
            System.out.println("new Modelo();");
        }


        //Eventos tercera linea
        if(Evento.equals("Controlador ")){
            System.out.println("Controlador");
        }

        if(Evento.equals("miControlador = ")){
            System.out.println("miControlador");
        }

        if(Evento.equals("new Controlador(miVentana, miEmpresa);")){
            System.out.println("new Controlador();");
        }

        //---Eventos Para VentanaPrincipal---

    }

    @Override
    public void mouseEntered(MouseEvent event) {
        //TODO: Hacer que se cambie el color del label cuando este encima
    }

    @Override
    public void mouseExited(MouseEvent event) {
        //TODO: Hacer que vuelva al color original
    }

    @Override
    public void mousePressed(MouseEvent event) {
    }

    @Override
    public void mouseReleased(MouseEvent event) {
    }
    
}
