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

    @Test
    public void convert_shouldReturn_XIV_for14() {
        // Arrange
        int input = 14;
        String expected = "XIV";

        // Act
        String result = IntegerToRoman.convert(input);

        // Assert
        assertEquals(expected, result);
    }

    @Test
    public void convert_shouldReturn_XIX_for19() {
        // Arrange
        int input = 19;
        String expected = "XIX";

        // Act
        String result = IntegerToRoman.convert(input);

        // Assert
        assertEquals(expected, result);
    }

    @Test
    public void convert_shouldReturn_XX_for20() {
        // Arrange
        int input = 20;
        String expected = "XX";

        // Act
        String result = IntegerToRoman.convert(input);

        // Assert
        assertEquals(expected, result);
    }

    @Test
    public void convert_shouldReturn_XL_for40() {
        // Arrange
        int input = 40;
        String expected = "XL";

        // Act
        String result = IntegerToRoman.convert(input);

        // Assert
        assertEquals(expected, result);
    }

    @Test
    public void convert_shouldReturn_XLII_for42() {
        // Arrange
        int input = 42;
        String expected = "XLII";

        // Act
        String result = IntegerToRoman.convert(input);

        // Assert
        assertEquals(expected, result);
    }

    @Test
    public void convert_shouldReturn_XLIX_for49() {
        // Arrange
        int input = 49;
        String expected = "XLIX";

        // Act
        String result = IntegerToRoman.convert(input);

        // Assert
        assertEquals(expected, result);
    }

    @Test
    public void convert_shouldReturn_L_for50() {
        // Arrange
        int input = 50;
        String expected = "L";

        // Act
        String result = IntegerToRoman.convert(input);

        // Assert
        assertEquals(expected, result);
    }

    // ====== Boundary - Sottrazione (XC, C) ======

    @Test
    public void convert_shouldReturn_XC_for90() {
        // Arrange
        int input = 90;
        String expected = "XC";

        // Act
        String result = IntegerToRoman.convert(input);

        // Assert
        assertEquals(expected, result);
    }

    @Test
    public void convert_shouldReturn_XCIX_for99() {
        // Arrange
        int input = 99;
        String expected = "XCIX";

        // Act
        String result = IntegerToRoman.convert(input);

        // Assert
        assertEquals(expected, result);
    }

    @Test
    public void convert_shouldReturn_C_for100() {
        // Arrange
        int input = 100;
        String expected = "C";

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

    @Test
    public void convert_first20Numbers() {
        // Arrange
        String[] expected = {
            "I", "II", "III", "IV", "V",
            "VI", "VII", "VIII", "IX", "X",
            "XI", "XII", "XIII", "XIV", "XV",
            "XVI", "XVII", "XVIII", "XIX", "XX"
        };

        // Act & Assert
        for (int i = 0; i < expected.length; i++) {
            assertEquals(expected[i], IntegerToRoman.convert(i + 1));
        }
    }

    @Test
    public void convert_first50Numbers_sampling() {
        // Arrange & Act & Assert
        assertEquals("XXI", IntegerToRoman.convert(21));
        assertEquals("XXIX", IntegerToRoman.convert(29));
        assertEquals("XXX", IntegerToRoman.convert(30));
        assertEquals("XXXV", IntegerToRoman.convert(35));
        assertEquals("XXXIX", IntegerToRoman.convert(39));
        assertEquals("XL", IntegerToRoman.convert(40));
        assertEquals("XLIV", IntegerToRoman.convert(44));
        assertEquals("XLVIII", IntegerToRoman.convert(48));
        assertEquals("XLIX", IntegerToRoman.convert(49));
        assertEquals("L", IntegerToRoman.convert(50));
    }

    @Test
    public void convert_first100Numbers_sampling() {
        // Arrange & Act & Assert
        assertEquals("LI", IntegerToRoman.convert(51));
        assertEquals("LV", IntegerToRoman.convert(55));
        assertEquals("LX", IntegerToRoman.convert(60));
        assertEquals("LXX", IntegerToRoman.convert(70));
        assertEquals("LXXV", IntegerToRoman.convert(75));
        assertEquals("LXXX", IntegerToRoman.convert(80));
        assertEquals("LXXXVIII", IntegerToRoman.convert(88));
        assertEquals("XC", IntegerToRoman.convert(90));
        assertEquals("XCIX", IntegerToRoman.convert(99));
        assertEquals("C", IntegerToRoman.convert(100));
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
