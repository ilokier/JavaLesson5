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
        System.out.println("Pick a menu option: \n" + "1 – Print all films between year 1 and year 2\n" + "\n" + "2 – Print random film information\n" + "\n" + "3 – Print fims for choosen actor. Please write actor name and last name\n" + "\n" + "4 – End program");
        return scan.nextInt();
    }
}



