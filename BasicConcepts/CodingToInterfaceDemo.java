
interface IAnimal {
    public void makeNoise();
}

class Cat implements IAnimal {

    IAnimal iAnimal;

    Cat() {
    }

    Cat(IAnimal iAnimal) {
        this.iAnimal = iAnimal;
    }

    @Override
    public void makeNoise() {
        System.out.println("MEOWWWWW!!!!!");
    }

}

class Dog implements IAnimal {

    @Override
    public void makeNoise() {
        System.out.println("WUFF WUFF!!!!");
    }

}

public class CodingToInterfaceDemo {

    public static void main(String[] args) {

        IAnimal animal = new Cat();
        animal.makeNoise();
        print(animal);

    }

    private static void print(IAnimal animal) {

        animal.makeNoise();

    }

}