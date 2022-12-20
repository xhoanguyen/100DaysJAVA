public class Dog extends Animal{

    String type;

    public Dog(String name, int age, String type){
        super(name, age);
        this.type = type;

    }


    @Override
    public void makeNoice(){
        super.makeNoice();
        System.out.println("WOULF WOULF!!");
    }



}
