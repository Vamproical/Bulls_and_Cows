package bullscows;

import java.util.Random;

public class GenerateCode {
    private static final char[] dictionary = new char[]{'0', '1', '2', '3', '4', '5', '6', '7', '8', '9',
            'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't',
            'u', 'v', 'w', 'x', 'y', 'z'};
    public static String generateSecreteCode(int lengthCode, int possibleSymbols) {
        Random random = new Random();
        if (lengthCode > 36) {
            System.out.println("Error: can't generate a secret number with a length of " +
                    lengthCode + " because there aren't enough unique digits.");
            return null;
        }
        StringBuilder secret = new StringBuilder();

        while (secret.length() != lengthCode) {
            int randomInd = (random.nextInt(possibleSymbols));
            if (!secret.toString().contains(String.valueOf(dictionary[randomInd]))) {
                secret.append(dictionary[randomInd]);
            }
        }
        System.out.print("The secret is prepared: ");
        for (int i = 0; i < lengthCode; i++) {
            System.out.print("*");
        }
        if (possibleSymbols <= 10) {
            System.out.println(" (" + dictionary[0] + "-" + dictionary[possibleSymbols - 1] + ").");
        } else {
            System.out.println(" (0-9, a" + "-" + dictionary[possibleSymbols - 1] + ").");
        }
        return secret.toString();
    }
}
