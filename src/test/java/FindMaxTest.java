import org.junit.Assert;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.Assert.assertEquals;

public class FindMaxTest {

    @DisplayName("Checking sixth max number")
    @Test
    public void givenSixIntValue_whenSixthIsMax_returnSixth() {
        Integer first = 10;
        Integer second = -3;
        Integer third = 5;
        Integer forth = -5;
        Integer fifth = -15;
        Integer sixth = 100;
        assertEquals(sixth, new FindMaximum<Integer>(first, second, third, forth, fifth, sixth).findMax());
    }

    @DisplayName("Checking fifth max number")
    @Test
    public void givenFiveIntValue_whenSecondIsMax_returnSecond() {
        Integer first = 10;
        Integer second = 33;
        Integer third = 5;
        Integer forth = -5;
        Integer fifth = -15;
        assertEquals(second, new FindMaximum<Integer>(first, second, third, forth, fifth).findMax());
    }

    @DisplayName("Checking three max number")
    @Test
    public void givenThreeIntValue_whenThirdIsMax_returnThird() {
        Integer first = 10;
        Integer second = -3;
        Integer third = 55;
        assertEquals(third, new FindMaximum<Integer>(first, second, third).findMax());
    }

    @DisplayName("Checking fifth max float")
    @Test
    public void givenFiveFloatValue_whenFirstIsMax_returnFirst() {
        Float first = 100.22f;
        Float second = -300f;
        Float third = 50.0f;
        Float forth = 4.54f;
        Float fifth = 5.44f;
        assertEquals(first, new FindMaximum<Float>(first, second, third, forth, fifth).findMax());
    }

    @DisplayName("Checking four max float")
    @Test
    public void givenFourFloatValue_whenSecondIsMax_returnSecond() {
        Float first = 10f;
        Float second = 33f;
        Float third = 5f;
        Float forth = 4.54f;
        assertEquals(second, new FindMaximum<Float>(first, second, third, forth).findMax());
    }

    @DisplayName("Checking third max float")
    @Test
    public void givenThreeFloatValue_whenThirdIsMax_returnThird() {
        Float first = 10f;
        Float second = -3f;
        Float third = 55f;
        assertEquals(third, new FindMaximum<Float>(first, second, third).findMax());
    }

    @DisplayName("Checking fourth  max string")
    @Test
    public void givenFourStringValue_whenFirstIsMax_returnFirst() {
        String first = "II";
        String second = "A2";
        String third = "Ef";
        String forth = "Aaaaz";
        assertEquals(first, new FindMaximum<String>(first, second, third, forth).findMax());
    }

    @DisplayName("Checking second max string")
    @Test
    public void givenTwoStringValue_whenSecondIsMax_returnSecond() {
        String first = "SS";
        String second = "ZZZ";
        assertEquals(second, new FindMaximum<String>(first, second).findMax());
    }

    @DisplayName("Checking third  max string")
    @Test
    public void givenThreeStringValue_whenThirdIsMax_returnThird() {
        String first = "A13";
        String second = "--4";
        String third = "Z234";
        assertEquals(third, new FindMaximum<String>(first, second, third).findMax());
    }
}