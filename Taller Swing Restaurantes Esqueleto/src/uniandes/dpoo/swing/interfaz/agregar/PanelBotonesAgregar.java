package uniandes.dpoo.swing.interfaz.agregar;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JPanel;

@SuppressWarnings("serial")
public class PanelBotonesAgregar extends JPanel implements ActionListener {
    private static final String CREAR = "nuevo";
    private static final String CERRAR = "ver";
    private JButton butNuevo;
    private JButton butCerrar;
    private VentanaAgregarRestaurante ventanaPrincipal;

    public PanelBotonesAgregar(VentanaAgregarRestaurante ventanaPrincipal) {
        this.ventanaPrincipal = ventanaPrincipal;
        setLayout(new FlowLayout());

        butNuevo = new JButton("Crear Restaurante");
        butNuevo.setActionCommand(CREAR);
        butNuevo.addActionListener(this);
        add(butNuevo);

        butCerrar = new JButton("Cerrar");
        butCerrar.setActionCommand(CERRAR);
        butCerrar.addActionListener(this);
        add(butCerrar);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String comando = e.getActionCommand();
        if (comando.equals(CREAR)) {
            ventanaPrincipal.agregarRestaurante();
        } else if (comando.equals(CERRAR)) {
            ventanaPrincipal.cerrarVentana();
        }
    }
}

