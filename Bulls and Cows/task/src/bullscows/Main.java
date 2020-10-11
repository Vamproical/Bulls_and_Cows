package bullscows;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input the length of the secret code:");
        int lengthCode = scanner.nextInt();
        System.out.println("Input the number of possible symbols in the code:");
        int possibleSymbols = scanner.nextInt();
        System.out.println("Okay, let's start a game!");
        String code = GenerateCode.generateSecreteCode(lengthCode, possibleSymbols);
        Game game = new Game();
        game.game(code);
    }
}
