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
