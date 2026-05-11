///////////////////////////////////////////////////////////////
// Alessandro Cisco 2147980
// Enrico Biasini 2147948
///////////////////////////////////////////////////////////////
package it.unipd.mtss;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.Test;

public class IntegerToRomanTest {

    // ====== Right - Risultati corretti per singoli valori ======

    @Test
    public void convert_shouldReturn_I_for1() {
        // Arrange
        int input = 1;
        String expected = "I";

        // Act
        String result = IntegerToRoman.convert(input);

        // Assert
        assertEquals(expected, result);
    }

    @Test
    public void convert_shouldReturn_II_for2() {
        // Arrange
        int input = 2;
        String expected = "II";

        // Act
        String result = IntegerToRoman.convert(input);

        // Assert
        assertEquals(expected, result);
    }

    @Test
    public void convert_shouldReturn_III_for3() {
        // Arrange
        int input = 3;
        String expected = "III";

        // Act
        String result = IntegerToRoman.convert(input);

        // Assert
        assertEquals(expected, result);
    }

    @Test
    public void convert_shouldReturn_IV_for4() {
        // Arrange
        int input = 4;
        String expected = "IV";

        // Act
        String result = IntegerToRoman.convert(input);

        // Assert
        assertEquals(expected, result);
    }

    @Test
    public void convert_shouldReturn_V_for5() {
        // Arrange
        int input = 5;
        String expected = "V";

        // Act
        String result = IntegerToRoman.convert(input);

        // Assert
        assertEquals(expected, result);
    }

    @Test
    public void convert_shouldReturn_VI_for6() {
        // Arrange
        int input = 6;
        String expected = "VI";

        // Act
        String result = IntegerToRoman.convert(input);

        // Assert
        assertEquals(expected, result);
    }

    @Test
    public void convert_shouldReturn_VII_for7() {
        // Arrange
        int input = 7;
        String expected = "VII";

        // Act
        String result = IntegerToRoman.convert(input);

        // Assert
        assertEquals(expected, result);
    }

    @Test
    public void convert_shouldReturn_VIII_for8() {
        // Arrange
        int input = 8;
        String expected = "VIII";

        // Act
        String result = IntegerToRoman.convert(input);

        // Assert
        assertEquals(expected, result);
    }

    @Test
    public void convert_shouldReturn_IX_for9() {
        // Arrange
        int input = 9;
        String expected = "IX";

        // Act
        String result = IntegerToRoman.convert(input);

        // Assert
        assertEquals(expected, result);
    }

    @Test
    public void convert_shouldReturn_X_for10() {
        // Arrange
        int input = 10;
        String expected = "X";

        // Act
        String result = IntegerToRoman.convert(input);

        // Assert
        assertEquals(expected, result);
    }

    // ====== Incrementale - Primi N numeri ======

    @Test
    public void convert_first3Numbers() {
        // Arrange
        String[] expected = {"I", "II", "III"};

        // Act & Assert
        for (int i = 0; i < expected.length; i++) {
            assertEquals(expected[i], IntegerToRoman.convert(i + 1));
        }
    }

    @Test
    public void convert_first6Numbers() {
        // Arrange
        String[] expected = {"I", "II", "III", "IV", "V", "VI"};

        // Act & Assert
        for (int i = 0; i < expected.length; i++) {
            assertEquals(expected[i], IntegerToRoman.convert(i + 1));
        }
    }

    @Test
    public void convert_first10Numbers() {
        // Arrange
        String[] expected = {
            "I", "II", "III", "IV", "V",
            "VI", "VII", "VIII", "IX", "X"
        };

        // Act & Assert
        for (int i = 0; i < expected.length; i++) {
            assertEquals(expected[i], IntegerToRoman.convert(i + 1));
        }
    }

    // ====== Error conditions ======

    @Test
    public void convert_shouldThrow_forZero() {
        // Arrange
        int input = 0;

        // Act & Assert
        assertThrows(
            IllegalArgumentException.class,
            () -> IntegerToRoman.convert(input)
        );
    }

    @Test
    public void convert_shouldThrow_forNegativeNumber() {
        // Arrange
        int input = -1;

        // Act & Assert
        assertThrows(
            IllegalArgumentException.class,
            () -> IntegerToRoman.convert(input)
        );
    }
}
