package bullscows;

public class GenerateCode {
    public static String generateSecreteCode(int lengthCode) {
        if (lengthCode > 10) {
            System.out.println("Error: can't generate a secret number with a length of " +
                    lengthCode + " because there aren't enough unique digits.");
            return null;
        }
        StringBuilder result = new StringBuilder();
        while(result.length() != lengthCode) {
            long pseudoRandomNumber = System.nanoTime();
            String tempNumber = String.valueOf(Long.parseLong(new StringBuilder(String.valueOf(pseudoRandomNumber))
                    .reverse()
                    .toString()));
            for (int i = 0; i < tempNumber.length(); i++) {

                if (!result.toString().contains(String.valueOf(tempNumber.charAt(i)))) {
                    result.append(tempNumber.charAt(i));
                }
                if (result.length() == lengthCode) {
                    break;
                }
            }
        }
        return result.toString();
    }
}
