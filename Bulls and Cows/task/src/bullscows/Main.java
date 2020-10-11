package bullscows;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please, enter the secret code's length:");
        int lengthCode = scanner.nextInt();
        System.out.println("Okay, let's start a game!");
        String code = GenerateCode.generateSecreteCode(lengthCode);
        Game game = new Game();
        game.game(code);
    }
}
