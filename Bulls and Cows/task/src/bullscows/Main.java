package bullscows;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String  secretCode = "9305";
        String[] secretCodeArr = secretCode.split("");
        String[] guessCode = scanner.nextLine().split("");
        int bull = 0, cow = 0;
        for (int i = 0; i < 4; i++) {
            if (secretCodeArr[i].matches(guessCode[i])) {
                bull++;
            } else if (secretCode.contains(guessCode[i])) {
                cow++;
            }
        }
        if (bull == 4) {
            System.out.println("Grade: " + bull + " bull(s). The secret code is " + secretCode);
        }
        else if (bull != 0 && cow != 0) {
            System.out.println("Grade: " + bull + " bull(s) and " + cow + " cow(s). The secret code is " + secretCode);
        } else if (bull != 0) {
            System.out.println("Grade: " + bull + " bull(s). The secret code is " + secretCode);
        } else if (cow != 0) {
            System.out.println("Grade: " + cow + " cow(s). The secret code is " + secretCode);
        } else {
            System.out.println("Grade: None. The secret code is " + secretCode);
        }
    }
}
