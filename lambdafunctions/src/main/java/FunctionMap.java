import java.util.HashMap;
import java.util.Map;
import java.util.function.Function;

public class FunctionMap<T, R> {
    private Map<String, Function<T, R>> functionMap;

    FunctionMap() {
        functionMap = new HashMap<>();
    }

    public void addFunction(String name, Function<T, R> function) {
        functionMap.put(name, function);
    }

    public Function<T, R> getFunction(String name) {
        if (functionMap.containsKey(name)) {
            return functionMap.get(name);
        } else {
            throw new InvalidFunctionNameException(name);
        }
    }
}