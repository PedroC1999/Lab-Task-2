import java.util.Scanner;

public class Stage2 {
    public static void main(String[] args) {
        //init scanner and ask user for name
        Scanner input = new Scanner(System.in);
        System.out.println("What is your name?");
        //read in user's name
        String userName = input.nextLine();
        System.out.println("Hello " + userName + "!");
    }
}