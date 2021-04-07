import org.junit.Assert;
import org.junit.Before;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.Assert.assertEquals;

public class FindMaxTest {

    FindMaximum findMaximum;

    @Before
    public void initData() {
        findMaximum = new FindMaximum();
    }

    @DisplayName("Cheking first interger is max")
    @Test
    public void givenThreeInteger_whenFirstIsMax_returnFirst() {
        Integer max = FindMaximum.findMax(200, 25, 105);
        assertEquals((Integer) 200, max);
    }

    @DisplayName("Cheking second interger is max")
    @Test
    public void givenThreeInteger_whenSecondIsMax_returnSecond() {
        Integer max = FindMaximum.findMax(200, 25, 105);
        assertEquals((Integer) 200, max);
    }

    @DisplayName("Cheking third interger is max")
    @Test
    public void givenThreeInteger_whenThirdIsMax_returnThird() {
        Integer max = FindMaximum.findMax(200, 25, 105);
        assertEquals((Integer) 200, max);
    }
}