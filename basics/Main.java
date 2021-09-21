import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Timer;
import java.util.TimerTask;

public class Main {

    public static void main(String[] args) {

        int dogCount = 1;
        System.out.println("I own " + dogCount + " " + pluralize("dog", dogCount) + ".");

        int catCount = 2;
        System.out.println("I own " + catCount + " " + pluralize("cat", catCount) + ".");

        int turtleCount = 0;
        System.out.println("I own " + turtleCount + " " + pluralize("turtle", turtleCount) + ".");

        flipNHeads(2);
        Timer timer = new Timer();
        timer.schedule(new clock(), 0, 1000);
    }

    public static String pluralize(String word, int count) {
        if (count == 0 || count > 1 ) {
            return word + "s";
        } else {
            return word;
        }
    }

    public static void flipNHeads(int n) {
        int headsInARow = 0;
        int totalFlips =0;
        while (headsInARow < n) {
            double coin = Math.random();
            if (coin > 0.5) {
                System.out.println("heads");
                headsInARow++;
            } else {
                System.out.println("tails");
                headsInARow = 0;
            }
            totalFlips++;
        }
        if (n > 1) {
            System.out.println("It took " + totalFlips + " flips to flip " + n + " heads in a row");
        } else if (totalFlips > 1) {
            System.out.println("It took " + totalFlips + " flips to flip " + n + " head in a row");
        } else {
            System.out.println("It took " + totalFlips + " flip to flip " + n + " head in a row");
        }
    }

//    public static void clock() {
//        LocalDateTime now = LocalDateTime.now();
//        String time = now.format(DateTimeFormatter.ofPattern("HH:mm:ss"));
//        System.out.println(time);
//    }

    static class clock extends TimerTask {
        public void run() {
            LocalDateTime now = LocalDateTime.now();
            String time = now.format(DateTimeFormatter.ofPattern("HH:mm:ss"));
            System.out.println(time);
        }
    }
}