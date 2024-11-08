
import java.awt.Color;
import java.awt.Dimension;

import javax.swing.JPanel;

public class PanelMaker {

    static JPanel makePanel(Color color, int width, int height) {
        JPanel panel = new JPanel();
        // Set panel color
        panel.setBackground(color);
        // Set panel size
        panel.setPreferredSize(new Dimension(width, height));

        return panel;
    }

    static JPanel makePanel(Color color) {
        JPanel panel = new JPanel();
        panel.setBackground(color);

        return panel;
    }
}
