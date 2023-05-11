package cvo.vista;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.event.MouseListener;

import javax.swing.JPanel;
import javax.swing.JSeparator;
import javax.swing.JPopupMenu.Separator;

import cvo.modelo.Texto;

public class PanelTest extends JPanel{
    //---Atributos---


    //Labels
    //TODO: añadir labels para los numeros que acompañan las lineas
    public Texto lbVentanaPrincipal;
    public Texto lbMiventana;
    public Texto lbNewVentanaPrincipal;

    public Texto lbModelo;
    public Texto lbMiModelo;
    public Texto lbNewModelo;

    public Texto lbControlador;
    public Texto lbMiControlador;
    public Texto lbNewControlador;

    //Colores
    private Color colorClase = new Color(229, 56, 38);
    private Color colorObjeto = new Color(235, 219, 178);
    private Color colorInstancia = new Color(250, 186, 43);
    private Color colorFondo = new Color(29, 32, 33);

    //Nombre del modelo
    private String nombreModelo;

    public PanelTest(String nombreModelo){

        this.nombreModelo = nombreModelo;
        //Caracteriticas de la ventana
        this.setLayout(null);

        //Labels para la primera linea
        lbVentanaPrincipal = new Texto("VentanaPrincipal ");
        lbVentanaPrincipal.setToolTipText("Ir al codigo");
        lbVentanaPrincipal.setBounds(10, 100, getAnchoTexto(lbVentanaPrincipal), getAltoTexto(lbVentanaPrincipal));
        lbVentanaPrincipal.setForeground(colorClase);
        this.add(lbVentanaPrincipal);


        lbMiventana = new Texto("miVentana = ");
        lbMiventana.setToolTipText("Ver objeto en RAM");
        lbMiventana.setBounds(getPosX(lbVentanaPrincipal), 100, getAnchoTexto(lbMiventana), getAltoTexto(lbMiventana));
        lbMiventana.setForeground(colorObjeto);
        this.add(lbMiventana);
        System.out.println("getPosX: " + lbVentanaPrincipal.getX());

        lbNewVentanaPrincipal = new Texto("new VentanaPrincipal();");
        lbNewVentanaPrincipal.setToolTipText("Vista");
        lbNewVentanaPrincipal.setBounds(getPosX(lbMiventana), 100, getAnchoTexto(lbNewVentanaPrincipal), getAltoTexto(lbNewVentanaPrincipal));
        lbNewVentanaPrincipal.setForeground(colorInstancia);
        this.add(lbNewVentanaPrincipal);

        //Labels para la segunda linea
        lbModelo = new Texto(nombreModelo + " ");
        lbModelo.setToolTipText("Ir al codigo");
        lbModelo.setBounds(10,getPosY(lbNewVentanaPrincipal), getAnchoTexto(lbModelo), getAltoTexto(lbModelo));
        lbModelo.setForeground(colorClase);
        this.add(lbModelo);

        lbMiModelo = new Texto("mi" + nombreModelo + " = ");
        lbMiModelo.setToolTipText("Ver objeto en RAM");
        lbMiModelo.setBounds(getPosX(lbModelo), getPosY(lbNewVentanaPrincipal), getAnchoTexto(lbMiModelo), getAltoTexto(lbMiModelo));
        lbMiModelo.setForeground(colorObjeto);
        this.add(lbMiModelo);

        lbNewModelo = new Texto("new " + nombreModelo + "();");
        lbNewModelo.setToolTipText("Vista");
        lbNewModelo.setBounds(getPosX(lbMiModelo), getPosY(lbNewVentanaPrincipal), getAnchoTexto(lbNewModelo), getAltoTexto(lbNewModelo));
        lbNewModelo.setForeground(colorInstancia);
        this.add(lbNewModelo);

        //Labels para la tercera linea
        lbControlador = new Texto("Controlador ");
        lbControlador.setToolTipText("Ir al codigo");
        lbControlador.setBounds(10, getPosY(lbNewModelo), getAnchoTexto(lbControlador), getAltoTexto(lbControlador));
        lbControlador.setForeground(colorClase);
        this.add(lbControlador);

        lbMiControlador = new Texto("miControlador = ");
        lbMiControlador.setToolTipText("Ver objeto en RAM");
        lbMiControlador.setBounds(getPosX(lbControlador), getPosY(lbNewModelo), getAnchoTexto(lbMiControlador), getAltoTexto(lbMiControlador));
        lbMiControlador.setForeground(colorObjeto);
        this.add(lbMiControlador);

        lbNewControlador = new Texto("new Controlador(miVentana, miEmpresa);");
        lbNewControlador.setToolTipText("Vista");
        lbNewControlador.setBounds(getPosX(lbMiControlador), getPosY(lbNewModelo), getAnchoTexto(lbNewControlador), getAltoTexto(lbNewControlador));
        lbNewControlador.setForeground(colorInstancia);
        this.add(lbNewControlador);
        
        //Caracteristicas del panel
        this.setBackground(colorFondo);

    }

    public String getNombreModelo() {
        return nombreModelo;
    }

    private int getAnchoTexto(Texto label){
        Dimension labelSize = label.getPreferredSize();
        return labelSize.width;


    }

    private int getAltoTexto(Texto label){
        Dimension labelSize = label.getPreferredSize();
        return labelSize.height;
    }

    private int getPosX(Texto label){
        int posicionInicial = getAnchoTexto(label) + label.getX();
        return posicionInicial;
    }
    private int getPosY(Texto label){
        int h = 3;
        int posicionInicial = getAltoTexto(label) + label.getY() + h;
        return posicionInicial;
    }

    public void agregarEscuchadores(MouseListener escuchador)
    {
        //Escuchadores para la primera linea
        lbVentanaPrincipal.addMouseListener(escuchador);
        lbMiventana.addMouseListener(escuchador);
        lbNewVentanaPrincipal.addMouseListener(escuchador);
        
        //Escuchadores para la segunda linea
        lbModelo.addMouseListener(escuchador);
        lbMiModelo.addMouseListener(escuchador);
        lbNewModelo.addMouseListener(escuchador);

        //Escuchadores para la tercera linea
        lbControlador.addMouseListener(escuchador);
        lbMiControlador.addMouseListener(escuchador);
        lbNewControlador.addMouseListener(escuchador);
    }

}
