package animals;

public class Dog implements Animal, Domestic{
    @Override
    public void sound()
    {
        System.out.println("Bark");
    }

    public String name=null;
    public Dog(){
        this.name = "DOG";
    }
    public Dog(String name) {
        this.name = name;
    }

    public void printName() {
        System.out.println("Dog’s name is " + name);
    }
}
