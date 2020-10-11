package bullscows;

import java.util.Arrays;

public class Grader {
    public static boolean checkGuessNumber(String[] preparedCode, String[] guessCode) {
        String code = Arrays.toString(preparedCode);
        int bull = 0, cow = 0;
        for (int i = 0; i < preparedCode.length; i++) {
            if (preparedCode[i].matches(guessCode[i])) {
                bull++;
            } else if (code.contains(guessCode[i])) {
                cow++;
            }
        }
        if (bull == preparedCode.length) {
            System.out.println("Grade: " + bull + " bulls");
            return true;
        } else if (bull != 0 && cow != 0) {
            System.out.println("Grade: " + bull + " bull(s) and " + cow + " cow(s).");
        } else if (bull != 0) {
            System.out.println("Grade: " + bull + " bull(s).");
        } else if (cow != 0) {
            System.out.println("Grade: " + cow + " cow(s).");
        } else {
            System.out.println("Grade: None.");
        }
        return false;
    }
}
