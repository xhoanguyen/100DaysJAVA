package util;
import com.deepl.api.*;
 class DeepL {
     public static void main(String[] args) throws Exception {

         DeepL test = new DeepL();

     }
    Translator translator;

     public DeepL() throws Exception {
        String authKey = "87fdea1b-8db6-83c9-d25f-0f7bbefdefbe:fx";  // Replace with your key
        translator = new Translator(authKey);
        TextResult result =
                translator.translateText("Hello, world!", null, "de");
        System.out.println(result.getText()); // "Bonjour, le monde !"
    }
}
