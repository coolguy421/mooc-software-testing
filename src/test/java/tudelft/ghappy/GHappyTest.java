package tudelft.ghappy;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

public class GHappyTest {

    @ParameterizedTest(name = "String - {0}")
    @CsvSource({"abcggdh", "AggBCDEggF, yuppingg"})
    public void validInputs(String input){
        GHappy gHappyObj = new GHappy();

        boolean result = gHappyObj.gHappy(input);
        Assertions.assertTrue(result);
    }

    @ParameterizedTest(name = "String - {0}")
    @CsvSource({"gabcggEh", "abcdeggfhg"})
    public void gAtStartandEndPositions(String input){
        GHappy gHappyObj = new GHappy();

        boolean result = gHappyObj.gHappy(input);
        Assertions.assertFalse(result);
    }

}
