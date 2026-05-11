///////////////////////////////////////////////////////////////
// Alessandro Cisco 2147980
// Enrico Biasini 2147948
///////////////////////////////////////////////////////////////
package it.unipd.mtss;

/**
 * Classe per la stampa di numeri romani in formato ASCII art.
 * Ogni lettera romana viene rappresentata con caratteri ASCII
 * su 6 righe con larghezza fissa di 10 caratteri.
 *
 * @author Alessandro Cisco
 * @author Enrico Biasini
 */
public class RomanPrinter {

    private static final int ROWS = 6;

    // ASCII art per ogni lettera romana (6 righe, larghezza fissa)
    private static final String[][] ASCII_ART = {
            // I (larghezza 10)
            {
                    " _______  ",
                    "|__   __| ",
                    "   | |    ",
                    "   | |    ",
                    " __| |__  ",
                    "|_______| "
            },
            // V (larghezza 10)
            {
                    "__      __",
                    "\\ \\    / /",
                    " \\ \\  / / ",
                    "  \\ \\/ /  ",
                    "   \\  /   ",
                    "    \\/    "
            },
            // X (larghezza 10)
            {
                    " __    __ ",
                    " \\ \\  / / ",
                    "  \\ \\/ /  ",
                    "   >  <   ",
                    "  / /\\ \\  ",
                    " /_/  \\_\\ "
            },
            // L (larghezza 10)
            {
                    " _        ",
                    "| |       ",
                    "| |       ",
                    "| |       ",
                    "| |____   ",
                    "|______|  "
            },
            // C (larghezza 10)
            {
                    "  _____   ",
                    " / ____|  ",
                    "| |       ",
                    "| |       ",
                    "| |____   ",
                    " \\_____|  "
            },
            // D (larghezza 10)
            {
                    "  _____   ",
                    " |  __ \\  ",
                    " | |  | | ",
                    " | |  | | ",
                    " | |__| | ",
                    " |_____/  "
            },
            // M (larghezza 10)
            {
                    " __    __ ",
                    "|  \\  /  |",
                    "|  |\\/|  |",
                    "|  |  |  |",
                    "|  |  |  |",
                    "|__|  |__|"
            }
    };

    /**
     * Stampa il numero in formato ASCII art.
     *
     * @param num il numero intero da stampare (1-1000)
     * @return la rappresentazione ASCII art del numero romano
     * @throws IllegalArgumentException se il numero e' fuori range
     */
    public static String print(int num) {
        return printAsciiArt(IntegerToRoman.convert(num));
    }

    /**
     * Genera la rappresentazione ASCII art di un numero romano.
     *
     * @param romanNumber la stringa del numero romano
     * @return la rappresentazione ASCII art
     * @throws IllegalArgumentException se la stringa e' nulla o vuota
     */
    private static String printAsciiArt(String romanNumber) {
        StringBuilder result = new StringBuilder();

        for (int row = 0; row < ROWS; row++) {
            StringBuilder line = new StringBuilder();
            for (int j = 0; j < romanNumber.length(); j++) {
                int index = getIndex(romanNumber.charAt(j));
                if (j > 0) {
                    line.append(" ");
                }
                line.append(ASCII_ART[index][row]);
            }
            result.append(line.toString());
            if (row < ROWS - 1) {
                result.append("\n");
            }
        }

        return result.toString();
    }

    /**
     * Restituisce l'indice nell'array ASCII_ART per il carattere romano.
     *
     * @param c il carattere romano (I, V, X, L, C, D, M)
     * @return l'indice corrispondente nell'array ASCII_ART
     * @throws IllegalArgumentException se il carattere non e' valido
     */
    private static int getIndex(char c) {
        switch (c) {
            case 'I': return 0;
            case 'V': return 1;
            case 'X': return 2;
            case 'L': return 3;
            case 'C': return 4;
            case 'D': return 5;
            case 'M': return 6;
            default:
                throw new IllegalArgumentException(
                        "Carattere non valido: " + c
                );
        }
    }
}
