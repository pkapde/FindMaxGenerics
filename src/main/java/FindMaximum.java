import java.util.Arrays;

public class FindMaximum {

    public static Integer findMaxInt(Integer first, Integer second, Integer third) {

        if(first.compareTo(second) > 0 && first.compareTo(third) > 0)
            return first;
        if(second.compareTo(first) > 0 && second.compareTo(third) > 0)
            return second;
        else
            return third;
    }

    public static Float findMaxFloat(Float first, Float second, Float third) {

        if(first.compareTo(second) > 0 && first.compareTo(third) > 0)
            return first;
        if(second.compareTo(first) > 0 && second.compareTo(third) > 0)
            return second;
        else
            return third;
    }

}
