package animals;

public class Cat implements Animal, Domestic {
    @Override
    public void sound()
    {
        System.out.println("Meow");
    }

    public String name=null;
    public Cat(){
        this.name = "CAT";
    }
    public Cat(String name) {
        this.name = name;
    }

    public void printName() {
        System.out.println("Cat’s name is " + name);
    }
}
