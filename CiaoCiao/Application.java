public class Application {

    public static void main(String[] args) {

        Radio grandmaOldRadio = new Radio();
        System.out.println(grandmaOldRadio.isOn());
        grandmaOldRadio.on();
        System.out.println(grandmaOldRadio.isOn());
        System.out.println(grandmaOldRadio.volume);
        grandmaOldRadio.volumeUp();
        grandmaOldRadio.volumeDown();
    }

}