import org.junit.Assert;
import org.junit.jupiter.api.Test;

public class FindMaxGenericsTest {

    @Test
    public void givenFirstIntegerNumberAsLarge_ShouldReturn_FirstNumberAsMax() throws FindMaxGenericsException {
        Integer max = new FindMaxGenerics<>(200, 150, 100).FindMaxGenericsValue();
        Assert.assertEquals((Integer) 200, max);
    }

    @Test
    public void givenSecondIntegerNumberAsLarge_ShouldReturn_SecondNumberAsMax() throws FindMaxGenericsException {
        Integer max = new FindMaxGenerics<>(100, 150, 50).FindMaxGenericsValue();
        Assert.assertEquals((Integer) 150, max);
    }

    @Test
    public void givenThirdIntegerNumberAsLarge_ShouldReturn_ThirdNumberAsMax() throws FindMaxGenericsException {
        Integer max = new FindMaxGenerics<>(100, 500, 1000).FindMaxGenericsValue();
        Assert.assertEquals((Integer) 1000, max);
    }
    // Float Values
    @Test
    public void givenFirstFloatNumberAsLarge_ShouldReturn_FirstNumberAsMax() throws FindMaxGenericsException {
        Float max = new FindMaxGenerics<>(200f,100f,150f).FindMaxGenericsValue();
        Assert.assertEquals((Float) 200f, max);
    }

    @Test
    void givenSecondFloatNumberAsLarge_ShouldReturn_SecondNumberMax() throws FindMaxGenericsException{
        Float max = new FindMaxGenerics<>(100f,200f,50f).FindMaxGenericsValue();
        Assert.assertEquals((Float) 200f, max);
    }

    @Test
    void givenThirdFloatNumberAsLarge_ShouldReturn_ThirdNumberMax() throws FindMaxGenericsException{
        Float max = new FindMaxGenerics<>(100f,20f,250f).FindMaxGenericsValue();
        Assert.assertEquals((Float) 250f, max);
    }

    //string values
    @Test
    void givenFirstStringAsLarge_ShouldReturn_FirstStringMax() throws FindMaxGenericsException{
        String max = new FindMaxGenerics<>("abcd","ab","abc").FindMaxGenericsValue();
        Assert.assertEquals("abcd", max);
    }

    @Test
    void givenSecondStringAsLarge_ShouldReturn_SecondStringMax() throws FindMaxGenericsException{
        String max = new FindMaxGenerics<>("ab","abcd","abc").FindMaxGenericsValue();
        Assert.assertEquals("abcd", max);
    }

    @Test
    void givenThirdStringAsLarge_ShouldReturn_ThirdStringMax() throws FindMaxGenericsException{
        String max = new FindMaxGenerics<>("ab","abc","abcd").FindMaxGenericsValue();
        Assert.assertEquals("abcd", max);
    }
}