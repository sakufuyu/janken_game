public class GameJudge {

    static String getResultText(int playerHand, int computerHand) {

        String resultText = "";
        int result = (playerHand - computerHand + 3) % 3;

        if (result == 0) {
            resultText = "Draw...";
        } else if (result == 1) {
            resultText = "You lose...";
        } else {
            resultText = "You Win !!!";
        }

        return resultText;
    }
}
