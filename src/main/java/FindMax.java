import java.util.Arrays;

class FindMaximum <T extends Comparable<T>>{

    public T[] arguments;

    @SafeVarargs
    public FindMaximum(T ...arguments) {
        this.arguments = arguments;
    }

    public T findMax() {
        T findMax = findMax(arguments);
        return findMax;
    }

    @SafeVarargs
    static <T extends Comparable<T>> T  findMax(T ...arguments) {

        Arrays.sort(arguments);
        return arguments[arguments.length - 1];
    }

}