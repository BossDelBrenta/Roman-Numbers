///////////////////////////////////////////////////////////////
// Alessandro Cisco 2147980
// Enrico Biasini 2147948
///////////////////////////////////////////////////////////////
package it.unipd.mtss;

/**
 * Classe per la conversione di numeri arabi in numeri romani.
 * Supporta la conversione di numeri interi positivi.
 *
 * @author Alessandro Cisco
 * @author Enrico Biasini
 */
public class IntegerToRoman {

    private static final int[] VALUES = {1};

    private static final String[] SYMBOLS = {"I"};

    /**
     * Converte un numero arabo nella sua rappresentazione romana.
     *
     * @param number il numero intero da convertire
     * @return la stringa contenente il numero romano
     * @throws IllegalArgumentException se il numero e' fuori range
     */
    public static String convert(int number) {
        if (number < 1) {
            throw new IllegalArgumentException(
                "Il numero deve essere maggiore di 0, "
                + "ricevuto: " + number
            );
        }
        if (number > 3) {
            throw new IllegalArgumentException(
                "Il numero deve essere minore o uguale a 3, "
                + "ricevuto: " + number
            );
        }

        StringBuilder roman = new StringBuilder();
        int remaining = number;

        for (int i = 0; i < VALUES.length; i++) {
            while (remaining >= VALUES[i]) {
                roman.append(SYMBOLS[i]);
                remaining -= VALUES[i];
            }
        }

        return roman.toString();
    }
}
