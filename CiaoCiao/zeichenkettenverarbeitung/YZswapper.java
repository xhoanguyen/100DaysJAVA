package zeichenkettenverarbeitung;

public class YZswapper {

    public static void printSwappedXZ(String string) {

        if (string.isEmpty() || string == null) {
            return;
        }
        String result = "";

        for (int i = 0; i < string.length(); i++) {

            if (string.charAt(i) == 'y') {
                result += 'z';

            } else if (string.charAt(i) == 'Y') {
                result += 'Z';

            } else if (string.charAt(i) == 'Z') {
                result += 'Y';

            } else if (string.charAt(i) == 'z') {
                result += 'y';

            } else {

                result += string.charAt(i);

            }

        }

        System.out.println(result);
    }

    public static void printSwappedXZWithSwitch(String string) {

        if (string.isEmpty() || string == null) {
            return;
        }
        String result = "";

        for (int i = 0; i < string.length(); i++) {

            switch (string.charAt(i)) {
                case 'y':
                    result += 'z';
                    break;
                case 'Y':
                    result += 'Z';
                    break;
                case 'z':
                    result += 'y';
                    break;
                case 'Z':
                    result += 'Y';
                    break;
                default:
                    result += string.charAt(i);
            }

        }

        System.out.println(result);
    }

}
