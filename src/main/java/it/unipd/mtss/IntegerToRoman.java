///////////////////////////////////////////////////////////////
// Alessandro Cisco 2147980
// Enrico Biasini 2147948
///////////////////////////////////////////////////////////////
package it.unipd.mtss;

/**
 * Classe per la conversione di numeri arabi in numeri romani.
 * Supporta la conversione di numeri interi da 1 a 1000.
 *
 * @author Alessandro Cisco
 * @author Enrico Biasini
 */
public class IntegerToRoman {

    private static final int[] VALUES = {
        1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1
    };

    private static final String[] SYMBOLS = {
        "M", "CM", "D", "CD", "C", "XC",
        "L", "XL", "X", "IX", "V", "IV", "I"
    };

    /**
     * Converte un numero arabo nella sua rappresentazione romana.
     *
     * @param number il numero intero da convertire (1-1000)
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
        if (number > 1000) {
            throw new IllegalArgumentException(
                "Il numero deve essere minore o uguale a 1000, "
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
