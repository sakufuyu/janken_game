
import java.awt.Color;
import java.awt.Font;

import javax.swing.JLabel;

public class TextMaker {

    static JLabel makeText(String str, int size, Color color) {
        JLabel label = new JLabel(str);
        // Set text color
        label.setForeground(color);
        // Set text font
        label.setFont(new Font("Timesnewroman", Font.PLAIN, size));
        // Set text horizontal location
        label.setHorizontalAlignment(JLabel.CENTER);
        // Set text vertical location
        label.setVerticalAlignment(JLabel.CENTER);

        return label;
    }
}
