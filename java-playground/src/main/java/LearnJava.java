package src.main.java;

public class LearnJava{
    
    public static void main(String args[]){
        
        // Scanner scanner = new Scanner(System.in);
        // System.out.print("Enter your name: ");
        // String text = scanner.nextLine();
        // System.out.printf("Your Name: %s\n", text);
        // scanner.close();

        final int[] ints = new int[4];
        ints[0] = 1;
        ints[1] = 2;
        ints[2] = 3;
        ints[3] = 4;
        ints[0] = 5;
        for(int i: ints){
            System.out.println(i);

        }

    }

}