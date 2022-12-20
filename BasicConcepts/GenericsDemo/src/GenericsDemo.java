import java.util.ArrayList;
import java.util.List;

public class GenericsDemo {

    public static void main(String[] args){

        Printer<String> printer = new Printer<>("Hello World");
        printer.print();

        Printer<Double> doublePrinter = new Printer<>(23.4);
        doublePrinter.print();

        Dog newDog =  new Dog("Samojede", 1, "Cute Dog");
        newDog.makeNoice();

        List<Dog> dogList = new ArrayList<>();
        dogList.add(new Dog("Golden Retriever", 1, "Cure Dog"));
        printList(dogList);


    }

    private static void printList(List<? extends  Animal> myList){
        System.out.println("sddsds");
    }
}
