package bullscows;

import java.util.Arrays;

public class Grader {
    void checkGuessNumber(String[] preparedCode, String[] guessCode) {
        String code = Arrays.toString(preparedCode);
        int bull = 0, cow = 0;
        for (int i = 0; i < 4; i++) {
            if (preparedCode[i].matches(guessCode[i])) {
                bull++;
            } else if (code.contains(guessCode[i])) {
                cow++;
            }
        }
        if (bull == 4) {
            System.out.println("Grade: " + bull + " bull(s). The secret code is " + code);
        }
        else if (bull != 0 && cow != 0) {
            System.out.println("Grade: " + bull + " bull(s) and " + cow + " cow(s). The secret code is " + code);
        } else if (bull != 0) {
            System.out.println("Grade: " + bull + " bull(s). The secret code is " + code);
        } else if (cow != 0) {
            System.out.println("Grade: " + cow + " cow(s). The secret code is " + code);
        } else {
            System.out.println("Grade: None. The secret code is " + code);
        }
    }
}
