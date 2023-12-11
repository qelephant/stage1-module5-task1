import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.function.BiFunction;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;
import java.util.stream.Collectors;

public class InterfaceCreator {

    public Function<List<String>, Map<String, Integer>> stringSize() {
        return list -> list.stream().collect(Collectors.toMap(s -> s, String::length));
        
    }

    public BiFunction<List<Integer>, List<Integer>, List<Integer>> concatList() {
        return (list1, list2) -> {
            List<Integer> result = new ArrayList<>(list1);
            result.addAll(list2);
            return result;
        };
    }


    public Predicate<List<String>> isValuesStartWithUpperCase() {
        return list -> list.stream().allMatch(s -> s.matches("[A-Z].*"));
    }


    public Consumer<List<Integer>> addEvenValuesAtTheEnd() {
        return list -> {
            list.addAll(list.stream().filter(i -> i % 2 == 0).toList());
        };
    }
    
}
