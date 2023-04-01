import java.util.Arrays;

interface Buyable {

    double price();
}

class Event {


}
public class Flight  extends Event implements Buyable, Comparable<Flight>{
    final double ticketPrice;

    Flight( int ticketPrice ) { this.ticketPrice = ticketPrice; }

    @Override public double price() {
        return ticketPrice;
    }
    @Override public int compareTo( Flight other ) {
        return Double.compare( ticketPrice, other.ticketPrice );
    }

    public static void main(String[] args) {
//        Flight londonToDurban = new Flight( 1200 );
//        System.out.println( londonToDurban instanceof Flight );
//        System.out.println( londonToDurban instanceof Event );
//        System.out.println( londonToDurban instanceof Object );
//        System.out.println( londonToDurban instanceof Buyable );
//        System.out.println( londonToDurban instanceof Comparable );

//        Flight londonToDurban     = new Flight( 1200 );
//        Flight dortmundToBrussels = new Flight( 200 );
//        System.out.println( londonToDurban.compareTo( londonToDurban ) );
//        System.out.println( londonToDurban.compareTo( dortmundToBrussels ) );
//        System.out.println( dortmundToBrussels.compareTo( londonToDurban ) );
//        System.out.println( dortmundToBrussels.compareTo( dortmundToBrussels ) );

        Flight londonToDurban = new Flight( 1200 );
        Flight dortmundToBrussels = new Flight( 200 );
        Flight berlinToNairobi = new Flight( 1500 );
        Flight duesseldorfToWindhoek = new Flight( 1400 );
        Flight[] flights = {
            londonToDurban, dortmundToBrussels, berlinToNairobi, duesseldorfToWindhoek
        };
        Arrays.sort( flights );
        for ( Flight flight : flights )
            System.out.print( (int) flight.price() + " ");
    }
}
