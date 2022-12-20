public class Animal {
    String name;
    int age;

    public Animal(){}

    public Animal(String name, int age){
        this.name = name;
        this.age  = age;
    }

    public void makeNoice(){
        System.out.println("Im an animal");
    }
}
