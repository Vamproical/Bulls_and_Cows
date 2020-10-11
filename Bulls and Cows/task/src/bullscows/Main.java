package bullscows;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input the length of the secret code:");
        int lengthCode;
        try {
            lengthCode = scanner.nextInt();
        } catch (InputMismatchException e) {
            System.out.println("Error: your input isn't a valid number.");
            return;
        }
        System.out.println("Input the number of possible symbols in the code:");
        int possibleSymbols;
        try {
            possibleSymbols = scanner.nextInt();
        } catch (InputMismatchException e) {
            System.out.println("Error: your input isn't a valid number.");
            return;
        }
        if (possibleSymbols < lengthCode) {
            System.out.println("Error: it's not possible to generate a code with a length of " +
                    lengthCode + " with " + possibleSymbols + " unique symbols.");
            return;
        }
        if (lengthCode <= 0) {
            System.out.println("Error: the length of the secret code must be more than 0");
            return;
        }
        System.out.println("Okay, let's start a game!");
        String code = GenerateCode.generateSecreteCode(lengthCode, possibleSymbols);
        if (code == null) return;
        Game game = new Game();
        game.game(code);
    }
}
