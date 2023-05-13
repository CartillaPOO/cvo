package cvo.vista;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
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

    //Características del texto
    public Color colorClase = new Color(229, 56, 38);
    private Color colorObjeto = new Color(235, 219, 178);
    private Color colorInstancia = new Color(250, 186, 43);
    private Color colorFondo = new Color(29, 32, 33);


    //Nombre del modelo
    private String nombreModelo;

    public PanelTest(String nombreModelo, int tamañoFuente){

        this.nombreModelo = nombreModelo;
        //Caracteriticas de la ventana
        this.setLayout(null);

        //Labels para la primera linea
        lbVentanaPrincipal = new Texto("VentanaPrincipal ");
        lbVentanaPrincipal.setToolTipText("Ir al codigo");
        lbVentanaPrincipal.setFont(new Font("Droid Sans Mono", Font.BOLD, tamañoFuente));
        lbVentanaPrincipal.setBounds(10, 100, getAnchoTexto(lbVentanaPrincipal), getAltoTexto(lbVentanaPrincipal));
        lbVentanaPrincipal.setForeground(colorClase);
        this.add(lbVentanaPrincipal);


        lbMiventana = new Texto("miVentana = ");
        lbMiventana.setToolTipText("Ver objeto en RAM");
        lbMiventana.setFont(new Font("Droid Sans Mono", Font.BOLD, tamañoFuente));
        lbMiventana.setBounds(getPosX(lbVentanaPrincipal), 100, getAnchoTexto(lbMiventana), getAltoTexto(lbMiventana));
        lbMiventana.setForeground(colorObjeto);
        this.add(lbMiventana);
        System.out.println("getPosX: " + lbVentanaPrincipal.getX());

        lbNewVentanaPrincipal = new Texto("new VentanaPrincipal();");
        lbNewVentanaPrincipal.setToolTipText("Vista");
        lbNewVentanaPrincipal.setFont(new Font("Droid Sans Mono", Font.BOLD, tamañoFuente));
        lbNewVentanaPrincipal.setBounds(getPosX(lbMiventana), 100, getAnchoTexto(lbNewVentanaPrincipal), getAltoTexto(lbNewVentanaPrincipal));
        lbNewVentanaPrincipal.setForeground(colorInstancia);
        this.add(lbNewVentanaPrincipal);

        //Labels para la segunda linea
        lbModelo = new Texto(nombreModelo + " ");
        lbModelo.setToolTipText("Ir al codigo");
        lbModelo.setFont(new Font("Droid Sans Mono", Font.BOLD, tamañoFuente));
        lbModelo.setBounds(10,getPosY(lbNewVentanaPrincipal), getAnchoTexto(lbModelo), getAltoTexto(lbModelo));
        lbModelo.setForeground(colorClase);
        this.add(lbModelo);

        lbMiModelo = new Texto("mi" + nombreModelo + " = ");
        lbMiModelo.setToolTipText("Ver objeto en RAM");
        lbMiModelo.setFont(new Font("Droid Sans Mono", Font.BOLD, tamañoFuente));
        lbMiModelo.setBounds(getPosX(lbModelo), getPosY(lbNewVentanaPrincipal), getAnchoTexto(lbMiModelo), getAltoTexto(lbMiModelo));
        lbMiModelo.setForeground(colorObjeto);
        this.add(lbMiModelo);

        lbNewModelo = new Texto("new " + nombreModelo + "();");
        lbNewModelo.setToolTipText("Vista");
        lbNewModelo.setFont(new Font("Droid Sans Mono", Font.BOLD, tamañoFuente));
        lbNewModelo.setBounds(getPosX(lbMiModelo), getPosY(lbNewVentanaPrincipal), getAnchoTexto(lbNewModelo), getAltoTexto(lbNewModelo));
        lbNewModelo.setForeground(colorInstancia);
        this.add(lbNewModelo);

        //Labels para la tercera linea
        lbControlador = new Texto("Controlador ");
        lbControlador.setToolTipText("Ir al codigo");
        lbControlador.setFont(new Font("Droid Sans Mono", Font.BOLD, tamañoFuente));
        lbControlador.setBounds(10, getPosY(lbNewModelo), getAnchoTexto(lbControlador), getAltoTexto(lbControlador));
        lbControlador.setForeground(colorClase);
        this.add(lbControlador);

        lbMiControlador = new Texto("miControlador = ");
        lbMiControlador.setToolTipText("Ver objeto en RAM");
        lbMiControlador.setFont(new Font("Droid Sans Mono", Font.BOLD, tamañoFuente));
        lbMiControlador.setBounds(getPosX(lbControlador), getPosY(lbNewModelo), getAnchoTexto(lbMiControlador), getAltoTexto(lbMiControlador));
        lbMiControlador.setForeground(colorObjeto);
        this.add(lbMiControlador);

        lbNewControlador = new Texto("new Controlador(miVentana, miEmpresa);");
        lbNewControlador.setToolTipText("Vista");
        lbNewControlador.setFont(new Font("Droid Sans Mono", Font.BOLD, tamañoFuente));
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
        //TODO: Cambiar nombre a variable h
        int h = 3;
        int posicionInicial = getAltoTexto(label) + label.getY() + h;
        return posicionInicial;
    }

    //Ancho total del panel


    public int getAnchoTotalPanel(){
        int anchoTotal = getAnchoTexto(lbNewControlador) + lbNewControlador.getX() + 10;
        return anchoTotal;
    }

    public int getAltoTotalPanel(){
        int altoTotal = getAltoTexto(lbNewControlador) + lbNewControlador.getY() + 100;

        return altoTotal;
    }

    public Color getColorClase() {
        return colorClase;
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
