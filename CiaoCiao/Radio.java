public class Radio {

    private boolean isOn;
    public int volume;

    public void volumeUp() {
        this.volume = this.volume > 100 ? this.volume = 100 : this.volume++;
    }

    public void volumeDown() {
        this.volume = this.volume < 0 ? this.volume = 0 : this.volume--;
    }

    public void on() {
        setOn(true);
        // System.out.println("Radio ist an.");
    }

    public void off() {
        setOn(false);
        // System.out.println("Radio ist aus.");
    }

    @Override
    public String toString() {
        return "Radio [volume=" + this.volume + ", is " + (isOn() ? "on" : "off") + "]";
    }

    public boolean isOn() {
        return isOn;
    }

    public Radio() {
        this.isOn = false;
        this.volume = 0;
    }

    public Radio(boolean isOn, int volume) {
        this.isOn = isOn;
        this.volume = volume;
    }

    public void setOn(boolean isOn) {
        this.isOn = isOn;
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

}
