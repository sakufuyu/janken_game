
import javax.swing.JFrame;

public class FrameMaker {

    static JFrame getFrame(String title, int width, int height, boolean isResizeable) {
        JFrame frame = new JFrame(title);
        // set window size
        frame.setSize(width, height);
        // set window location to center
        frame.setLocationRelativeTo(null);
        // set exit button from the game
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        // let user not to change window size
        frame.setResizable(isResizeable);

        return frame;
    }
}
