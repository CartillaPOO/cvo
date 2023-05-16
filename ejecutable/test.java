package ejecutable;

import cvo.controlador.EventosLabel;
import cvo.vista.FrameTest;

public class test {
    public static void main(String[] args) {
       FrameTest miTest = new FrameTest("Circulo", 15);
       EventosLabel eventos = new EventosLabel(miTest);
    }
}
