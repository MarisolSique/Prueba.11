package proyecto;

import java.awt.Dimension;

import javax.swing.JFrame;

public class Formulario extends JFrame {
    public Formulario() {
        try {
            jbInit();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private void jbInit() throws Exception {
        this.getContentPane().setLayout( null );
        this.setSize( new Dimension(400, 300) );
    }
}
