import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class HighLow {

    public static String highAndLow(String numbers) {

        String[] arr = numbers.split(" ");
        List<Integer> numbersList = new ArrayList<>();
        for (String ch : arr) {
            numbersList.add(Integer.parseInt(ch));
        }
        Collections.sort(numbersList);
        return numbersList.get(numbersList.size() - 1) + " " + numbersList.get(0);
    }

}
