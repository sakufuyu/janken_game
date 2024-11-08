
import java.util.Random;

public class ComputerHand {

    static int getComputerHand() {

        Random random = new Random();
        int hand = random.nextInt(3);

        return hand;
    }
}
