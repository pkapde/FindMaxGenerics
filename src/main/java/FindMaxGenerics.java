import java.util.Arrays;

public class FindMaxGenerics <E extends Comparable<E>> {
    E[] values;

    @SafeVarargs
    public FindMaxGenerics(E... values) {
        this.values = values;
    }

    public E FindMaxGenericsValue() throws FindMaxGenericsException {
        if (values.length == 0) {
            throw new FindMaxGenericsException("No Elements to Compare");
        } else {
            Arrays.sort(values);
            printMax(values[values.length - 1]);
            return values[values.length - 1];
        }
    }

    /*
     *Method to print Max Value
     * @param is Generic Value
     */
    public void printMax(E value) {
        System.out.println("Max Value = " + value);
    }

}
