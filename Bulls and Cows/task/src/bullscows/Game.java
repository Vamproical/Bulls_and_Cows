package bullscows;

import java.util.Scanner;

public class Game {
    public void game(String secretCode) {
        Scanner scanner = new Scanner(System.in);
        boolean isWin = false;
        int turn = 1;
        while (!isWin) {
            System.out.println("Turn " + turn + ":");
            ++turn;
            String guessCode = scanner.nextLine();
            if (Grader.checkGuessNumber(secretCode.split(""), guessCode.split(""))) {
                System.out.println("Congratulations! You guessed the secret code.");
                isWin = true;
            }
        }
    }
}
