public class MultiplesOf3Or5 {

    public int solution(int i) {

        int result = 0;
        if (i < 0)
            return result;
        int start = 1;
        while (start < i) {
            if (start % 3 == 0 && start % 5 == 0) {
                result += start;
                start++;
                continue;
            }
            if (start % 3 == 0)
                result += start;
            if (start % 5 == 0)
                result += start;
            start++;
        }
        return result;
    }

    public int solution_best(int number) {
        int sum = 0;

        for (int i = 0; i < number; i++) {
            if (i % 3 == 0 || i % 5 == 0) {
                sum += i;
            }
        }
        return sum;
    }

}
