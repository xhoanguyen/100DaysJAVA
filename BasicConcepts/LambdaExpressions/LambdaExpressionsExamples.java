import java.util.Arrays;
import java.util.Comparator;


interface I <S, T extends CharSequence> {
    void len( S text );
    void len( T text );
}

@FunctionalInterface
interface FI extends I<String, String> {

}


public class LambdaExpressionsExamples {

    public static void main( String[] args ) {

    String[] words = { " Joker   ","M\n", "\nBatman", " Q", "\t\tFlash\t" };

        class TrimComparator implements Comparator<String> {
            @Override
            public int compare( String s1, String s2 ) {
                return s1.trim().compareTo( s2.trim() );
            }
        }

        Arrays.sort( words, new TrimComparator() );
//        System.out.println(Arrays.toString(words));

//        Arrays.sort( words, new Comparator<String>() {
//            @Override public int compare( String s1, String s2 ) {
//                return s1.trim().compareTo( s2.trim() );
//            } } );


        Comparator<String> c = (String s1, String s2) ->
        { return s1.trim().compareTo( s2.trim() ); };
        Arrays.sort(words, c);

        System.out.println( Arrays.toString( words ) );

//        System.out.println( Arrays.toString( words ) );
    }
}
