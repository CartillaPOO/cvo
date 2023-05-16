package cvo.controlador;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

import cvo.modelo.Colores;
import cvo.vista.FrameTest;

public class EventosLabel implements MouseListener{

    //---Atributos---
    private FrameTest miFrameTest;
    private String nombreModelo;

    //Referencias

    public EventosLabel(FrameTest principal){
        miFrameTest = principal;
        miFrameTest.panelTest.agregarEscuchadores(this);
        nombreModelo = miFrameTest.panelTest.getNombreModelo();
    }
    @Override
    public void mouseClicked(MouseEvent event) {
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
            System.out.println("new controlador");
        }

        //---Eventos Para VentanaPrincipal---

    }

    public void setWindowPosition(JFrame ventanaPrincipal){
        ventanaPrincipal.setLocation(miFrameTest.getWidthPOSX(), miFrameTest.getScreenPOSY());
    }

    @Override
    public void mouseEntered(MouseEvent event){
        String Evento = event.getSource().toString();

        //Resaltado para la primera linea
        if(Evento.equals("VentanaPrincipal ")){
            miFrameTest.panelTest.lbVentanaPrincipal.setForeground(Colores.RESALTADO);
        }

        if(Evento.equals("miVentana = ")){
            miFrameTest.panelTest.lbMiventana.setForeground(Colores.RESALTADO);
        }

        if(Evento.equals("new VentanaPrincipal();")){
            miFrameTest.panelTest.lbNewVentanaPrincipal.setForeground(Colores.RESALTADO);
        }

        //Resaltado para la segunda linea
        if(Evento.equals(nombreModelo + " ")){
            miFrameTest.panelTest.lbModelo.setForeground(Colores.RESALTADO);
        }

        if(Evento.equals("mi" + nombreModelo + " = ")){
            miFrameTest.panelTest.lbMiModelo.setForeground(Colores.RESALTADO);
        }

        if(Evento.equals("new " + nombreModelo + "();")){
            miFrameTest.panelTest.lbNewModelo.setForeground(Colores.RESALTADO);
        }

        //Resaltado para la tercera linea
        if(Evento.equals("Controlador ")){
            miFrameTest.panelTest.lbControlador.setForeground(Colores.RESALTADO);
        }

        if(Evento.equals("miControlador = ")){
            miFrameTest.panelTest.lbMiControlador.setForeground(Colores.RESALTADO);
        }

        if(Evento.equals("new Controlador(miVentana, miEmpresa);")){
            miFrameTest.panelTest.lbNewControlador.setForeground(Colores.RESALTADO);
        }

        //Eventos Boton

        if(Evento.equals("Diagrama de objetos")){
            System.out.println("Entrando al boton");
            miFrameTest.panelTest.btDiagramaObjetos.setForeground(Colores.RESALTADO);
            
        }

        System.out.println("Evento: " + Evento);
        //TODO: Hacer que se cambie el color del label cuando este encima
    }

    @Override
    public void mouseExited(MouseEvent event) {
        String Evento = event.getSource().toString();
        //TODO: Hacer que vuelva al color original cuando se salga

        // Color original primera linea
        if(Evento.equals("VentanaPrincipal ")){
            miFrameTest.panelTest.lbVentanaPrincipal.setForeground(Colores.ClASE);
            System.out.println("Saliendo de VentanaPrincipal");
        }

        if(Evento.equals("miVentana = ")){
            miFrameTest.panelTest.lbMiventana.setForeground(Colores.OBJETO);
        }

        if(Evento.equals("new VentanaPrincipal();")){
            miFrameTest.panelTest.lbNewVentanaPrincipal.setForeground(Colores.INSTANCIA);
        }

        //Color original segunda linea

        if(Evento.equals(nombreModelo + " ")){
            miFrameTest.panelTest.lbModelo.setForeground(Colores.ClASE);
        }

        if(Evento.equals("mi" + nombreModelo + " = ")){
            miFrameTest.panelTest.lbMiModelo.setForeground(Colores.OBJETO);
        }

        if(Evento.equals("new " + nombreModelo + "();")){
            miFrameTest.panelTest.lbNewModelo.setForeground(Colores.INSTANCIA);
        }

        //Color original tercera linea

        if(Evento.equals("Controlador ")){
            miFrameTest.panelTest.lbControlador.setForeground(Colores.ClASE);
        }

        if(Evento.equals("miControlador = ")){
            miFrameTest.panelTest.lbMiControlador.setForeground(Colores.OBJETO);
        }

        if(Evento.equals("new Controlador(miVentana, miEmpresa);")){
            miFrameTest.panelTest.lbNewControlador.setForeground(Colores.INSTANCIA);
        }

        //Color original boton
        if(Evento.equals("Diagrama de objetos")){
            System.out.println("Entrando al boton");
            miFrameTest.panelTest.btDiagramaObjetos.setForeground(Colores.FUENTE_BOTON);
            
        }
    }

    @Override
    public void mousePressed(MouseEvent event) {
    }

    @Override
    public void mouseReleased(MouseEvent event) {
    }
    
}
