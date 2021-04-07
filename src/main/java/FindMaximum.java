import javafx.scene.input.KeyCode;

import java.util.Arrays;

import static javafx.scene.input.KeyCode.*;


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

    public static String findMaxString(String first, String second, String third) {

            if (first.compareTo(second) > 0 && first.compareTo(third) > 0)
                return first;
            if (second.compareTo(first) > 0 && second.compareTo(third) > 0)
                return second;
            else
                return third;
    }

    //generic method to print max value
    public static <E extends Comparable> E findMaxValue(E firstValue, E secondValue, E thirdValue){
        E max = firstValue;
        if (secondValue.compareTo(max) > 0) {
            max = secondValue;
        }
        if (thirdValue.compareTo(max) > 0) {
            max = thirdValue;
        }
        printMax(max);
        return max;
    }
    public static <E> void printMax(E max){
        System.out.println("Max Value = "+max);
    }

}