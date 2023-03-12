import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class WhichAreIn {

    public static Object[] inArray(String[] a, String[] b) {
        List<String> result = new ArrayList<>();
        for (String elema : a) {
            for (String elemb : b) {
                if (elemb.contains(elema) && !result.contains(elema)) {
                    result.add(elema);
                }
            }
        }
        if (result.isEmpty())
            return (Object[]) result.toArray();
        result.sort(null);
        return result.toArray();
    }

    public static String[] inArray_best(String[] array1, String[] array2) {
        return Arrays.stream(array1)
                .filter(str -> Arrays.stream(array2).anyMatch(s -> s.contains(str)))
                .distinct()
                .sorted()
                .toArray(String[]::new);
    }
}
