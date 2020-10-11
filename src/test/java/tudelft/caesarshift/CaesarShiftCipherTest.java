package tudelft.caesarshift;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

public class CaesarShiftCipherTest {


    @ParameterizedTest(name = "Message - {0}, Shift - {1}, Cipher - {2}")
    @CsvSource({"abcdeg, 1, bcdefh", "zefdg abc, -1, ydecf zab", "abc def , 0, abc def "})
    public void validMessageandShift(String message, int shift, String expected){
        CaesarShiftCipher cipherObj = new CaesarShiftCipher();
        String result = cipherObj.CaesarShiftCipher(message, shift);
        Assertions.assertEquals(expected, result);
    }

    @ParameterizedTest(name = "Message - ' ', Shift - {0}, Cipher - invalid")
    @CsvSource({"-1,-26, 1, 26"})
    public void onlySpaceWithoutLetters(int shift){
        CaesarShiftCipher cipherObj = new CaesarShiftCipher();
        String message = " ";
        String result = cipherObj.CaesarShiftCipher(message, shift);
        Assertions.assertEquals("invalid", result);
    }

    @ParameterizedTest(name = "Message - {0}, Shift - {1}, Cipher - {2}")
    @CsvSource({"abcdeg, 27, bcdefh", "zefdg abc, -27, ydecf zab"})
    public void outOfRangeShift(String message, int shift, String expected){
        CaesarShiftCipher cipherObj = new CaesarShiftCipher();
        String result = cipherObj.CaesarShiftCipher(message, shift);
        Assertions.assertEquals(expected, result);
    }

    @Test
    public void nonAlphabetsAndSpace(){
        CaesarShiftCipher cipherObj = new CaesarShiftCipher();
        String message = "abc deg & fhu ";
        String result = cipherObj.CaesarShiftCipher(message, 0);
        Assertions.assertEquals("invalid", result);
    }

}
