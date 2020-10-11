package bullscows;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //String[] secretCodeArr = secretCode.split("");
        //String[] guessCode = scanner.nextLine().split("");
        int lengthCode = scanner.nextInt();
        String code = GenerateCode.generateSecreteCode(lengthCode);
        if (code != null) {
            System.out.print("The random secret number is " + code + ".");
        }
    }
}
