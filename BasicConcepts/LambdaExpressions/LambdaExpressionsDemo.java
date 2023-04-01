@FunctionalInterface // SAM = Single Abstract Method
interface Superpower{
    void fight(); // abstract public
    static void staticPower()
    {
        System.out.println("staticPower");
    }
    default void defaultPower()
    {
        System.out.println("defaultPower");
    }
}


//class TwoFace implements Superpower {
//    @Override
//    public void fight() {
//        System.out.println("TwoFace fights...");
//    }
//}


public class LambdaExpressionsDemo {

    public static void main(String[] args) {

        Superpower sp = () -> { System.out.println("TwoFace fights... "); };

        sp.fight();
    }
}
