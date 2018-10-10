import java.util.Scanner;
//This program will take various inputs, and respond accordingly
public class Stage3 {
    public static void main(String[] args) {
        //init scanner
        Scanner input = new Scanner(System.in);
        //ask name
        System.out.println("What is your name?");
        String name = input.nextLine();
        System.out.println("Hello " + name + "!");
        //ask fruit
        System.out.println(name + ", what is your favourite fruit?");
        String favFruit = input.nextLine();
        System.out.println("I love " + favFruit + " too!");
        //ask sport
        System.out.println("What is your favourite sport?");
        String favSport = input.nextLine();
        System.out.println("Ooh interesting! If I wasn't a Java program, I bet I would love to watch you play "+favSport);

        //goodbye
        System.out.println("Goodbye " + name +", nice meeting you!");

    }
}