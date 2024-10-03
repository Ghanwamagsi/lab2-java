import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class CricketInningsSimulator {
    public static void main(String[] args) {
        simulateInnings();
    }

    public static void simulateInnings() {
        List<String> waysOfGettingOut = new ArrayList<>();
        waysOfGettingOut.add("not out");
        waysOfGettingOut.add("run out");

        int runsScored = 0;
        int ballsFaced = 0;

        System.out.println("Let's start the innings!");

        Random random = new Random();

        while (true) {
            String deliveryOutcome = waysOfGettingOut.get(random.nextInt(waysOfGettingOut.size()));

            if (!deliveryOutcome.equals("not out")) {
                System.out.println("Oh no! The batsman got " + deliveryOutcome + " and is out!");
                break;
            }

            int runsOnDelivery = random.nextInt(7); // Random runs between 0 and 6
            runsScored += runsOnDelivery;
            ballsFaced++;

            System.out.println("The batsman scores " + runsOnDelivery + " runs off " + ballsFaced + " balls.");
        }

        System.out.println("The innings is over! The batsman scored " + runsScored + " runs off " + ballsFaced + " balls.");
    }
}
