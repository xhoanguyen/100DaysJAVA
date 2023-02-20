public class DnaStrand {

    public static String makeComplement(String dna) {
        String result = "";
        for (String ch : dna.split("")) {
            switch (ch) {
                case "A":
                    result += "T";
                    break;
                case "C":
                    result += "G";
                    break;
                case "T":
                    result += "A";
                    break;
                case "G":
                    result += "C";
                    break;
            }
        }
        return result;
    }

    // Best solution
    public static String makeComplement_best(String dna) {
        char[] chars = dna.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            chars[i] = getComplement(chars[i]);
        }
        return new String(chars);
    }

    private static char getComplement(char c) {
        switch (c) {
            case 'A':
                return 'T';
            case 'T':
                return 'A';
            case 'C':
                return 'G';
            case 'G':
                return 'C';
        }
        return c;
    }

}
