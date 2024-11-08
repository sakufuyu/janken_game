import javax.swing.SwingUtilities;

public class App {
    public static void main(String[] args) throws Exception {
        GameStart.gameStart();
    }

    public static void restartGame() {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                GameStart.gameStart();
            }
        });
    }
}
