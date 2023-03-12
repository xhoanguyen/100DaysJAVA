import java.util.stream.IntStream;
 
public class FizzBuzz 
{
  public static void main(String[] args) 
  {
    fizzBuzzBeforeJava8(14);
    // fizzBuzzInJava8(100);
  }
 
  private static void fizzBuzzBeforeJava8(int num) 
  {
    for (int i = 1; i <= num; i++) 
    {
      if (contains(i, 5))
        System.out.println("buzz");
      else if (contains(i, 3))
        System.out.println("fizz");
      else if (((i % 5) == 0) && ((i % 3) == 0)) // Is it a multiple of 5 & 7?
        System.out.println("fizzbuzz");
      else if ((i % 5) == 0) // Is it a multiple of 5?
        System.out.println("buzz");
      else if ((i % 3) == 0) // Is it a multiple of 7?
        System.out.println("fizz");
      else
        System.out.println(i); // Not a multiple of 5 or 7
    }
  }
 
  private static void fizzBuzzInJava8(int num) {
    IntStream.rangeClosed(1, 100)
        .mapToObj(i -> i % 5 == 0 ? (i % 3 == 0 ? "FizzBuzz" : "Fizz") : (i % 7 == 0 ? "Buzz" : i))
        .forEach(System.out::println);
  }

  private static boolean contains(int num, int x) {
    int currentNumber = num;
    while (currentNumber > 0 ) {
        if (currentNumber % 10 == x){
            return true;
        }
        currentNumber = currentNumber / 10;
    }
    return false;
}
}