///////////////////////////////////////////////////////////////
// Alessandro Cisco 2147980
// Enrico Biasini 2147948
///////////////////////////////////////////////////////////////
package it.unipd.mtss;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

/**
 * Test di unita per RomanPrinter.
 * Segue i principi A-TRIP e Right-BICEP.
 *
 * @author Alessandro Cisco
 * @author Enrico Biasini
 */
public class RomanPrinterTest {

    // ====== Right - Output non nullo ======

    @Test
    public void print_shouldReturnNonNull_for1() {
        // Arrange
        int input = 1;

        // Act
        String result = RomanPrinter.print(input);

        // Assert
        assertNotNull(result);
    }

    @Test
    public void print_shouldReturnNonNull_for5() {
        // Arrange
        int input = 5;

        // Act
        String result = RomanPrinter.print(input);

        // Assert
        assertNotNull(result);
    }

    @Test
    public void print_shouldReturnNonNull_for1000() {
        // Arrange
        int input = 1000;

        // Act
        String result = RomanPrinter.print(input);

        // Assert
        assertNotNull(result);
    }

    // ====== Right - Verifica output esatto ======

    @Test
    public void print_shouldReturnExactAsciiArt_for1() {
        // Arrange
        int input = 1;
        String expected =
            " _______  \n"
            + "|__   __| \n"
            + "   | |    \n"
            + "   | |    \n"
            + " __| |__  \n"
            + "|_______| ";

        // Act
        String result = RomanPrinter.print(input);

        // Assert
        assertEquals(expected, result);
    }

    @Test
    public void print_shouldReturnExactAsciiArt_for5() {
        // Arrange
        int input = 5;
        String expected =
            "__      __\n"
            + "\\ \\    / /\n"
            + " \\ \\  / / \n"
            + "  \\ \\/ /  \n"
            + "   \\  /   \n"
            + "    \\/    ";

        // Act
        String result = RomanPrinter.print(input);

        // Assert
        assertEquals(expected, result);
    }

    @Test
    public void print_shouldReturnExactAsciiArt_for4() {
        // Arrange
        int input = 4;
        String expected =
            " _______   __      __\n"
            + "|__   __|  \\ \\    / /\n"
            + "   | |      \\ \\  / / \n"
            + "   | |       \\ \\/ /  \n"
            + " __| |__      \\  /   \n"
            + "|_______| " + " " + "    \\/    ";

        // Act
        String result = RomanPrinter.print(input);

        // Assert
        assertEquals(expected, result);
    }

    // ====== Boundary - Struttura 6 righe ======

    @Test
    public void print_shouldReturn6Lines_for1() {
        // Arrange
        int input = 1;

        // Act
        String result = RomanPrinter.print(input);
        String[] lines = result.split("\n");

        // Assert
        assertEquals(6, lines.length);
    }

    @Test
    public void print_shouldReturn6Lines_for10() {
        // Arrange
        int input = 10;

        // Act
        String result = RomanPrinter.print(input);
        String[] lines = result.split("\n");

        // Assert
        assertEquals(6, lines.length);
    }

    @Test
    public void print_shouldReturn6Lines_for999() {
        // Arrange
        int input = 999;

        // Act
        String result = RomanPrinter.print(input);
        String[] lines = result.split("\n");

        // Assert
        assertEquals(6, lines.length);
    }

    // ====== Boundary - Larghezza uniforme righe ======

    @Test
    public void print_shouldHaveUniformLineWidth_for1() {
        // Arrange
        int input = 1;

        // Act
        String result = RomanPrinter.print(input);
        String[] lines = result.split("\n");

        // Assert
        int width = lines[0].length();
        for (String line : lines) {
            assertEquals(width, line.length(),
                "Larghezza non uniforme: " + line);
        }
    }

    @Test
    public void print_shouldHaveUniformLineWidth_for4() {
        // Arrange
        int input = 4;

        // Act
        String result = RomanPrinter.print(input);
        String[] lines = result.split("\n");

        // Assert
        int width = lines[0].length();
        for (String line : lines) {
            assertEquals(width, line.length(),
                "Larghezza non uniforme: " + line);
        }
    }

    @Test
    public void print_shouldHaveUniformLineWidth_for888() {
        // Arrange
        int input = 888;

        // Act
        String result = RomanPrinter.print(input);
        String[] lines = result.split("\n");

        // Assert
        int width = lines[0].length();
        for (String line : lines) {
            assertEquals(width, line.length(),
                "Larghezza non uniforme: " + line);
        }
    }

    // ====== Contiene i caratteri ASCII corretti ======

    @Test
    public void print_shouldContainIPattern_for1() {
        // Arrange
        int input = 1;

        // Act
        String result = RomanPrinter.print(input);

        // Assert
        assertTrue(result.contains("_______"));
    }

    @Test
    public void print_shouldContainVPattern_for5() {
        // Arrange
        int input = 5;

        // Act
        String result = RomanPrinter.print(input);

        // Assert
        assertTrue(result.contains("\\/"));
    }

    @Test
    public void print_shouldContainXPattern_for10() {
        // Arrange
        int input = 10;

        // Act
        String result = RomanPrinter.print(input);

        // Assert
        assertTrue(result.contains(">  <"));
    }

    @Test
    public void print_shouldContainLPattern_for50() {
        // Arrange
        int input = 50;

        // Act
        String result = RomanPrinter.print(input);

        // Assert
        assertTrue(result.contains("|______|"));
    }

    @Test
    public void print_shouldContainCPattern_for100() {
        // Arrange
        int input = 100;

        // Act
        String result = RomanPrinter.print(input);

        // Assert
        assertTrue(result.contains("/ ____|"));
    }

    @Test
    public void print_shouldContainDPattern_for500() {
        // Arrange
        int input = 500;

        // Act
        String result = RomanPrinter.print(input);

        // Assert
        assertTrue(result.contains("|_____/"));
    }

    @Test
    public void print_shouldContainMPattern_for1000() {
        // Arrange
        int input = 1000;

        // Act
        String result = RomanPrinter.print(input);

        // Assert
        assertTrue(result.contains("|__|  |__|"));
    }

    // ====== Performance - Tutti i 1000 numeri ======

    @Test
    public void print_allNumbersFrom1To1000_shouldReturn6Lines() {
        // Act & Assert
        for (int i = 1; i <= 1000; i++) {
            String result = RomanPrinter.print(i);
            assertNotNull(result, "Risultato nullo per " + i);
            String[] lines = result.split("\n");
            assertEquals(6, lines.length,
                "Numero di righe errato per " + i);
        }
    }

    @Test
    public void print_allNumbersFrom1To1000_uniformWidth() {
        // Act & Assert
        for (int i = 1; i <= 1000; i++) {
            String result = RomanPrinter.print(i);
            String[] lines = result.split("\n");
            int width = lines[0].length();
            for (String line : lines) {
                assertEquals(width, line.length(),
                    "Larghezza non uniforme per numero "
                    + i + ": " + line);
            }
        }
    }

    // ====== Error conditions ======

    @Test
    public void print_shouldThrow_forZero() {
        // Arrange
        int input = 0;

        // Act & Assert
        assertThrows(
            IllegalArgumentException.class,
            () -> RomanPrinter.print(input)
        );
    }

    @Test
    public void print_shouldThrow_forNegative() {
        // Arrange
        int input = -5;

        // Act & Assert
        assertThrows(
            IllegalArgumentException.class,
            () -> RomanPrinter.print(input)
        );
    }

    @Test
    public void print_shouldThrow_forGreaterThan1000() {
        // Arrange
        int input = 1001;

        // Act & Assert
        assertThrows(
            IllegalArgumentException.class,
            () -> RomanPrinter.print(input)
        );
    }
}
