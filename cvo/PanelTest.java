package cvo;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.event.MouseListener;

import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JSeparator;
import javax.swing.JPopupMenu.Separator;

public class PanelTest extends JPanel{
    //---Atributos---

    //Labels
    public JLabel lbVentanaPrincipal;
    public JLabel lbMiventana;
    public JLabel lbNewVentanaPrincipal;

    public JLabel lbModelo;
    public JLabel lbMiModelo;
    public JLabel lbNewModelo;

    public JLabel lbControlador;
    public JLabel lbMiControlador;
    public JLabel lbNewControlador;

    //Colores
    private Color colorClase = new Color(229, 56, 38);
    private Color colorObjeto = new Color(235, 219, 178);
    private Color colorInstancia = new Color(250, 186, 43);
    private Color colorFondo = new Color(29, 32, 33);

    //Nombre del modelo
    String nombreModelo;

    public PanelTest(String nomreModelo){

        this.nombreModelo = nomreModelo;
        //Caracteriticas de la ventana
        this.setLayout(null);

        //Labels para la primera linea
        lbVentanaPrincipal = new JLabel("VentanaPrincipal ");
        lbVentanaPrincipal.setToolTipText("Ir al codigo");
        lbVentanaPrincipal.setBounds(10, 100, getAnchoTexto(lbVentanaPrincipal), getAltoTexto(lbVentanaPrincipal));
        lbVentanaPrincipal.setForeground(colorClase);
        this.add(lbVentanaPrincipal);


        lbMiventana = new JLabel("miVentana =");
        lbMiventana.setToolTipText("Ver objeto en RAM");
        lbMiventana.setBounds(getPosX(lbVentanaPrincipal), 100, getAnchoTexto(lbMiventana), getAltoTexto(lbMiventana));
        lbMiventana.setForeground(colorObjeto);
        this.add(lbMiventana);
        System.out.println("getPosX: " + lbVentanaPrincipal.getX());

        lbNewVentanaPrincipal = new JLabel(" new VentanaPrincipal();");
        lbNewVentanaPrincipal.setToolTipText("Vista");
        lbNewVentanaPrincipal.setBounds(getPosX(lbMiventana), 100, getAnchoTexto(lbNewVentanaPrincipal), getAltoTexto(lbNewVentanaPrincipal));
        lbNewVentanaPrincipal.setForeground(colorInstancia);
        this.add(lbNewVentanaPrincipal);

        //Labels para la segunda linea
        lbModelo = new JLabel(nombreModelo + " ");
        lbModelo.setToolTipText("Ir al codigo");
        lbModelo.setBounds(10,getPosY(lbNewVentanaPrincipal), getAnchoTexto(lbModelo), getAltoTexto(lbModelo));
        lbModelo.setForeground(colorClase);
        this.add(lbModelo);

        lbMiModelo = new JLabel(nombreModelo + " = ");
        lbMiModelo.setToolTipText("Ver objeto en RAM");
        lbMiModelo.setBounds(getPosX(lbModelo), getPosY(lbNewVentanaPrincipal), getAnchoTexto(lbMiModelo), getAltoTexto(lbMiModelo));
        lbMiModelo.setForeground(colorObjeto);
        this.add(lbMiModelo);

        lbNewModelo = new JLabel("new" + nombreModelo + "();");
        lbNewModelo.setToolTipText("Vista");
        lbNewModelo.setBounds(getPosX(lbMiModelo), getPosY(lbNewVentanaPrincipal), getAnchoTexto(lbNewModelo), getAltoTexto(lbNewModelo));
        lbNewModelo.setForeground(colorInstancia);
        this.add(lbNewModelo);

        //Labels para la tercera linea
        lbControlador = new JLabel("Controlador ");
        lbControlador.setToolTipText("Ir al codigo");
        lbControlador.setBounds(10, getPosY(lbNewModelo), getAnchoTexto(lbControlador), getAltoTexto(lbControlador));
        lbControlador.setForeground(colorClase);
        this.add(lbControlador);

        lbMiControlador = new JLabel("miControlador = ");
        lbMiControlador.setToolTipText("Ver objeto en RAM");
        lbMiControlador.setBounds(getPosX(lbControlador), getPosY(lbNewModelo), getAnchoTexto(lbMiControlador), getAltoTexto(lbMiControlador));
        lbMiControlador.setForeground(colorObjeto);
        this.add(lbMiControlador);

        lbNewControlador = new JLabel("new Controlador(miVentana, miEmpresa);");
        lbNewControlador.setToolTipText("Vista");
        lbNewControlador.setBounds(getPosX(lbMiControlador), getPosY(lbNewModelo), getAnchoTexto(lbNewControlador), getAltoTexto(lbNewControlador));
        lbNewControlador.setForeground(colorInstancia);
        this.add(lbNewControlador);
        
        //Caracteristicas del panel
        this.setBackground(colorFondo);

    }

    private int getAnchoTexto(JLabel label){
        Dimension labelSize = label.getPreferredSize();
        return labelSize.width;


    }

    private int getAltoTexto(JLabel label){
        Dimension labelSize = label.getPreferredSize();
        return labelSize.height;
    }

    private int getPosX(JLabel label){
        int posicionInicial = getAnchoTexto(label) + label.getX();
        return posicionInicial;
    }
    private int getPosY(JLabel label){
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
