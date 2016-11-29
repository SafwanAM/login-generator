package geco;

import java.security.SecureRandom;

/**
 * Classe representant un generateur de mot de passe
 */
public class PasswordGeneration {
    private static final int PASSWORD_LENGTH = 8;
    private static final String CHARS =
            "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz";

    private static SecureRandom secureRandom = new SecureRandom();

    /**
     * Generation d'un mot de passe aleatoire
     * @return Mot de passe aleatoire sous la forme d'un string
     */
    public String getRandomPassword() {
        StringBuilder stringBuilder = new StringBuilder(PASSWORD_LENGTH);
        for (int i = 0; i < PASSWORD_LENGTH; i++) {
            stringBuilder.append(CHARS.charAt(secureRandom.nextInt(CHARS.length())));
        }
        return stringBuilder.toString();
    }
}