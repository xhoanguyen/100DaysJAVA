public class ReverseStringLengthFive {

    public static void main(String[] args) {
        String[] words = {"hello", "world", "this", "is", "a", "test"};
        for (String word : words) {
            if (word.length() == 5) {
                System.out.println(new StringBuilder(word).reverse());
            }
        }
  }
    
}
