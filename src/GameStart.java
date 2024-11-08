import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class GameStart {
    // Make list of Janken
    private static String[] hands = {"rock", "scissors", "paper"};

    static JLabel contentsLabel;
    static JLabel headerLabel;
    static JPanel contentsPanel;
    static JFrame frame;
    static JPanel footerPanel;

    static boolean gameStart() {

        // Make frame
        frame = FrameMaker.getFrame("Janken Game", 640, 480, false);

        JPanel headerPanel = PanelMaker.makePanel(Color.BLUE, 640, 50);
        // Generate text in header
        headerLabel = TextMaker.makeText("Let's play Janken!!", 24, Color.WHITE);
        headerPanel.add(headerLabel);
        // Add header panel to window
        frame.add(headerPanel, BorderLayout.NORTH);

        // Contents Panel
        contentsPanel = PanelMaker.makePanel(Color.WHITE);
        // Set layout manager
        contentsPanel.setLayout(new BorderLayout());
        // Make text
        contentsLabel = TextMaker.makeText("Rock scissors papers, 3.. 2.. 1...", 34, Color.BLACK);
        // Set text to contentsPanel
        contentsPanel.add(contentsLabel);
        // Set contentsPanel to window
        frame.add(contentsPanel, BorderLayout.CENTER);


        // Footer Panel
        footerPanel = PanelMaker.makePanel(Color.WHITE, 640, 110);
        // Set GridLayout to footerPanel
        footerPanel.setLayout(new GridLayout());

        // Make Janeken button
        for (String hand: hands) {
            // Make hand image icons button
            ImageIcon icon = GetImageIcon.getImageIcon(hand, 100);
            JButton button = new JButton(icon);

            button.setActionCommand(hand);
            button.addActionListener(new ButtonActionListener());
            footerPanel.add(button);
        }
        frame.add(footerPanel, BorderLayout.SOUTH);

        // appear window
        frame.setVisible(true);

        return true;
    }
    // After push the button
    static class ButtonActionListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            // Get computer's hand randomly
            int computerHandNum = ComputerHand.getComputerHand();
            // Get computer hand by num
            String computerHand = hands[computerHandNum];
            // Set computer hand to panel
            contentsLabel.setText(computerHand);

            // Get player's hand num
            int playerHandNum = 0;
            for (int i = 0; i < hands.length; i++) {
                if (hands[i] == e.getActionCommand()) {
                    playerHandNum = i;
                    break;
                }
            }
            // Get game result
            String gameResultText = GameJudge.getResultText(playerHandNum, computerHandNum);
            ImageIcon computerHandIcon = GetImageIcon.getImageIcon("computer_" + hands[computerHandNum], 400);
            ImageIcon playerHandIcon = GetImageIcon.getImageIcon(e.getActionCommand(), 80);

            // Clear existing content
            contentsPanel.removeAll();
            frame.remove(footerPanel);

            JLabel imageLabel = new JLabel(computerHandIcon);
            contentsPanel.add(imageLabel, BorderLayout.CENTER);

            JLabel playerLabel = new JLabel(playerHandIcon);
            JPanel userIconPanel = PanelMaker.makePanel(Color.WHITE, 640, 80);
            userIconPanel.add(playerLabel);

            JButton nextGameButton = new JButton("Next Game..!");
            nextGameButton.setFont(new Font("TimesNewRoman", Font.PLAIN, 24));
            nextGameButton.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    frame.dispose();
                    App.restartGame();
                }
            });
            userIconPanel.add(nextGameButton, BorderLayout.EAST);
            frame.add(userIconPanel, BorderLayout.SOUTH);

            headerLabel.setText(gameResultText);
        }
    }
}
