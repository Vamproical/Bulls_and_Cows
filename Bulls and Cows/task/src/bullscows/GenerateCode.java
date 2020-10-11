package bullscows;

public class GenerateCode {
    public static String generateSecreteCode(int lengthCode) {
        if (lengthCode > 10) {
            System.out.println("Error: can't generate a secret number with a length of " +
                    lengthCode + " because there aren't enough unique digits.");
            return null;
        }
        StringBuilder secret = new StringBuilder(String.valueOf((int) (Math.random() * 10)));

        while (secret.length() != lengthCode) {
            int random = (int) (Math.random() * 10);
            if (!secret.toString().contains(String.valueOf(random))) {
                secret.append(random);
            }
        }
        return secret.toString();
    }
}
