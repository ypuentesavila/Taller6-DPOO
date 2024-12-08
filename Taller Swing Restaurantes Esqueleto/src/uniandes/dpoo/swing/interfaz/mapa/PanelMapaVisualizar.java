package uniandes.dpoo.swing.interfaz.mapa;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.util.List;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.LineBorder;
import uniandes.dpoo.swing.mundo.Restaurante;

@SuppressWarnings("serial")
public class PanelMapaVisualizar extends JPanel {
    private JLabel labMapa;
    private List<Restaurante> restaurantes;

    public PanelMapaVisualizar() {
        setLayout(new BorderLayout());
        this.labMapa = new JLabel(new ImageIcon("./imagenes/mapa.png"));
        labMapa.setBorder(new LineBorder(Color.DARK_GRAY));
        add(labMapa, BorderLayout.CENTER);
    }

    @Override
    public void paint(Graphics g) {
        super.paint(g);
        Graphics2D g2d = (Graphics2D) g;

        if (restaurantes != null) {
            for (Restaurante restaurante : restaurantes) {
                int x = restaurante.getX();
                int y = restaurante.getY();
                g2d.setColor(Color.RED);
                g2d.fillOval(x - 3, y - 3, 7, 7);

                g2d.setColor(Color.BLACK);
                g2d.drawString(restaurante.getNombre(), x + 5, y);
            }
        }
    }

    public void actualizarMapa(List<Restaurante> nuevosRestaurantes) {
        this.restaurantes = nuevosRestaurantes;
        repaint();
    }
}

