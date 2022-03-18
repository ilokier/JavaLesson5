import java.util.Scanner;

public class UserMenu {
    static Scanner scan = new Scanner(System.in);

    public static int getDate() {
        System.out.println("Enter year");
        int year = scan.nextInt();
        return year;
    }

    public static Actor getActorDataFromUser() {
        scan.nextLine();
        System.out.println("Enter actor name");
        String name = scan.nextLine();
        System.out.println("Enter actor last name");
        String lastname = scan.nextLine();
        return new Actor(name, lastname);
    }

    public static int getIntFromUser() {
        System.out.println("\nPick a menu option:" + "\n1 – Print all films between year 1 and year 2" + "\n2 – Print random film information" + "\n3 – Print fims for choosen actor. Please write actor name and last name" + "\n4 – End program\n");
        return scan.nextInt();
    }
}



