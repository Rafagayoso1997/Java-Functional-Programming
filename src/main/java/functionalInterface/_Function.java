package functionalInterface;

import java.util.function.Function;

public class _Function {

    public static void main(String[] args) {
        int increment = incrementByOne(0);
        String apply = incrementByOneFunction.apply(increment);
        System.out.println(increment);
        System.out.println(apply);
    }

    static Function<Integer, String> incrementByOneFunction =
            Integer::toHexString;

    static int incrementByOne(int number){
        return number + 1;
    }
}
