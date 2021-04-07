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
        Integer max = FindMaximum.findMaxInt(200, 25, 105);
        assertEquals((Integer) 200, max);
    }

    @DisplayName("Cheking second interger is max")
    @Test
    public void givenThreeInteger_whenSecondIsMax_returnSecond() {
        Integer max = FindMaximum.findMaxInt(200, 25, 105);
        assertEquals((Integer) 200, max);
    }

    @DisplayName("Cheking third interger is max")
    @Test
    public void givenThreeInteger_whenThirdIsMax_returnThird() {
        Integer max = FindMaximum.findMaxInt(200, 25, 105);
        assertEquals((Integer) 200, max);
    }

    @DisplayName("Cheking first float is max")
    @Test
    public void givenThreefloat_whenFirstIsMax_returnFirst() {
        Float max = FindMaximum.findMaxFloat(200f, 25f, 105f);
        assertEquals((Float) 200f, max);
    }

    @DisplayName("Cheking second float is max")
    @Test
    public void givenSecondfloat_whenSecondIsMax_returnSecond() {
        Float max = FindMaximum.findMaxFloat(200f, 250f, 105f);
        assertEquals((Float) 250f, max);
    }

    @DisplayName("Cheking third float is max")
    @Test
    public void givenThirdfloat_whenThirdIsMax_returnThird() {
        Float max = FindMaximum.findMaxFloat(200f, 250f, 105f);
        assertEquals((Float) 250f, max);
    }

}