package src.main.java;

public class Zoo {
    public static void main(String args[]){
        
        Cheetah chester = new Cheetah("Chester", 2, true);

        Cheetah charlie = new Cheetah(chester);

        charlie.setName("Charlie");
        chester.copy(charlie);
        charlie.speak();

        chester.speak();
        System.out.println(chester.getSpecies());

    }
}
