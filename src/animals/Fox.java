package animals;

public class Fox implements Animal,Wild{
    public void sound()
    {
        System.out.println("Wa-pow");
    }
    public String name=null;
    public Fox(){
        this.name = "Worldwide";
    }
    public Fox(String name) {
        this.name = name;
    }

    public void printHabitat() {
        System.out.println("Fox lives in " + name);
    }
}
