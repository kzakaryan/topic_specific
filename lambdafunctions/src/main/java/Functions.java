public class Functions {
    private Functions() {
    }

    /**
     * A static factory method that creates an integer function map with basic functions:
     * - abs (absolute value)
     * - sgn (signum function)
     * - increment
     * - decrement
     * - square
     *
     * @return an instance of {@link FunctionMap} that contains all listed functions
     */
    public static FunctionMap<Integer, Integer> intFunctionMap() {
        FunctionMap<Integer, Integer> intFunctionMap = new FunctionMap<>();

        // Add functions to the map using lambda expressions
        intFunctionMap.addFunction("abs", x -> Math.abs(x));  // Absolute value function
        intFunctionMap.addFunction("sgn", x -> (x == 0) ? 0 : (x > 0) ? 1 : -1);  // Signum function
        intFunctionMap.addFunction("increment", x -> x + 1);  // Increment function
        intFunctionMap.addFunction("decrement", x -> x - 1);  // Decrement function
        intFunctionMap.addFunction("square", x -> x * x);  // Square function

        return intFunctionMap;
    }
}
