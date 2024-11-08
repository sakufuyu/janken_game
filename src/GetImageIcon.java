import java.awt.Image;

import javax.swing.ImageIcon;

public class GetImageIcon {

    static ImageIcon getImageIcon(String imageText, int imageWidth) {

        ImageIcon originalIcon = new ImageIcon("./src/images/" + imageText + ".jpeg");
        Image image = originalIcon.getImage();

        int newWidth = imageWidth;
        int originWidth = image.getWidth(null);
        int originHeight = image.getHeight(null);
        int newHeight = (originHeight * newWidth) / originWidth;

        Image newImage = image.getScaledInstance(newWidth, newHeight, java.awt.Image.SCALE_SMOOTH);
        ImageIcon icon = new ImageIcon(newImage);

        return icon;
    }
}
