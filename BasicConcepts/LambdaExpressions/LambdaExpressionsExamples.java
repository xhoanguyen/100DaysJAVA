interface Buyable  {
    double price();
}

abstract class Event {

}


class Bike implements Buyable{
    @Override
    public double price() {
        return 199;
    }
}


class PriceUtils {
    static double calculateSum( Buyable first, Buyable... more ) {
        double result = first.price();
        for ( Buyable buyable : more ) {
            result += buyable.price();
        }
        return result;
    }
}


class MuseumVisit extends Event implements Buyable {
    int price;
    MuseumVisit( int price ) { this.price = price; }
    @Override public double price() {
        return price;
    }
}


public class LambdaExpressionsExamples1 {

    public static void main(String[] args) {
        Buyable hercules = new Bike();
        MuseumVisit binarium = new MuseumVisit( 8 );

        System.out.println( hercules.price() );  // 199.0
        System.out.println( binarium.price() );  // 8.0

        Buyable winora = new Bike();
        Buyable mimomenta = new MuseumVisit( 12 );

        double sum = PriceUtils.calculateSum(hercules, binarium, winora, mimomenta);
        System.out.println( sum );     // 418.0
    }
}



