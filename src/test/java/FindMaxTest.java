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
        Integer max1 = FindMaximum.findMaxValue(200, 25, 105);
        assertEquals((Integer) 200, max);
        assertEquals((Integer) 200, max1);
    }

    @DisplayName("Cheking second interger is max")
    @Test
    public void givenThreeInteger_whenSecondIsMax_returnSecond() {
        Integer max = FindMaximum.findMaxInt(200, 250, 105);
        Integer max1 = FindMaximum.findMaxValue(200, 250, 105);
        assertEquals((Integer) 200, max);
        assertEquals((Integer) 250, max1);
    }

    @DisplayName("Cheking third interger is max")
    @Test
    public void givenThreeInteger_whenThirdIsMax_returnThird() {
        Integer max = FindMaximum.findMaxInt(200, 25, 250);
        Integer max1 = FindMaximum.findMaxValue(200, 20, 250);
        assertEquals((Integer) 250, max);
        assertEquals((Integer) 250, max1);
    }

    //Checking float
    @DisplayName("Cheking first float is max")
    @Test
    public void givenThreefloat_whenFirstIsMax_returnFirst() {
        Float max = FindMaximum.findMaxFloat(200f, 25f, 105f);
        Integer max1 = FindMaximum.findMaxValue(200, 20, 250);
        assertEquals((Float) 200f, max);
        assertEquals((Float) 250f, max1);
    }

    @DisplayName("Cheking second float is max")
    @Test
    public void givenSecondfloat_whenSecondIsMax_returnSecond() {
        Float max = FindMaximum.findMaxFloat(200f, 250f, 105f);
        Integer max1 = FindMaximum.findMaxValue(200, 20, 250);
        assertEquals((Float) 250f, max);
        assertEquals((Float) 250f, max1);
    }

    @DisplayName("Cheking third float is max")
    @Test
    public void givenThirdfloat_whenThirdIsMax_returnThird() {
        Float max = FindMaximum.findMaxFloat(200f, 250f, 105f);
        Float max1 = FindMaximum.findMaxValue(200f, 20f, 250f);
        assertEquals((Float) 250f, max);
        assertEquals((Float) 250f, max1);
    }

    @DisplayName("Cheking first string is max")
    @Test
    public void givenThreestring_whenFirstIsMax_returnFirst() {
        String max = FindMaximum.findMaxString("aaa","aa","a");
        String max1 = FindMaximum.findMaxValue("aaa", "a", "aa");
        assertEquals((String) "aaa", max);
        assertEquals((String) "aaa", max1);
    }

    @DisplayName("Cheking second string is max")
    @Test
    public void givenThreestring_whenSecondIsMax_returnSecond() {
        String max = FindMaximum.findMaxString("aa","aaa","a");
        String max1 = FindMaximum.findMaxValue("a", "aaa", "aa");
        assertEquals((String) "aaa", max);
        assertEquals((String) "aaa", max1);
    }

    @DisplayName("Cheking second string is max")
    @Test
    public void givenThreestring_whenThirdIsMax_returnThird() {
        String max = FindMaximum.findMaxString("aa","a","aaa");
        String max1 = FindMaximum.findMaxValue("a", "aa", "aaa");
        assertEquals((String) "aaa", max);
        assertEquals((String) "aaa", max1);
    }
}