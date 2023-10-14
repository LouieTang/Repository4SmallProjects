package src.main.java;
public abstract class Animal {
    private String name;
    private String species;
    private double age;
    private boolean awake;

    Animal(String name, String species, double age, boolean awake){
        this.setName(name);
        this.setSpecies(species);
        this.setAge(age);
        this.setAwakeStatus(awake);
    }

    Animal(Animal animal){
        this.copy(animal);
    }

    public abstract void speak();
    public abstract void move();

    public void copy(Animal other){
        setName(other.getName());
        setAge(other.getAge());
        setSpecies(other.getSpecies());
        setAwakeStatus(other.getAwakeStatus());
    }

    public boolean isAnimal(){
        return true;
    }

    public String getName(){
        return this.name;
    }
    public void setName(String name){
        this.name = name;
    }

    public String getSpecies(){
        return this.species;
    }
    public void setSpecies(String species){
        this.species = species;
    }

    public double getAge(){
        return this.age;
    }
    public void setAge(double age){
        this.age = age;
    }

    public boolean getAwakeStatus(){
        return this.awake;
    }
    public void setAwakeStatus(boolean awake){
        this.awake = awake;
    }
    
}
