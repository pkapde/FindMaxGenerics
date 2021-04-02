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

    @Test
    public void givenForthIntegerNumberAsLarge_ShouldReturn_ForthNumberAsMax() throws FindMaxGenericsException {
        Integer max = new FindMaxGenerics<>(100, 500, 1000, 5000).FindMaxGenericsValue();
        Assert.assertEquals((Integer) 5000, max);
    }
}