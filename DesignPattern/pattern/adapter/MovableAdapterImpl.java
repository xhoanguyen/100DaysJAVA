package pattern.adapter;

import javax.naming.PartialResultException;

public class MovableAdapterImpl implements MoveableAdapter {

    private Moveable luxuryCars;

    public MovableAdapterImpl(Moveable luxuryCars) {
        this.luxuryCars = luxuryCars;
    }

    /*
     * (non-Javadoc)
     * 
     * @see pattern.adapter.MoveableAdapter#getSpeed()
     */

    @Override
    public double getSpeed() {
        return convertMPHtoKMP(luxuryCars.getSpeed());
    }

    private double convertMPHtoKMP(double mph) {
        return mph * 1.60934;
    }

}
