package src.main.java;

public class Cheetah extends Animal {
    Cheetah(String name, double age, boolean awake){
        super(name, "Cheetah", age, awake);
    }

    Cheetah(Cheetah other){
        super(other);
    }

    @Override
    public void speak(){
        System.out.printf("%s says meow\n", this.getName());
    }

    @Override
    public void move(){
        System.out.printf("%s is moving\n", this.getName());
    }
}
