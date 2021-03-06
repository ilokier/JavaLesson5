import java.io.File;
import java.io.IOException;

public class Main {
    public static MovieLibrary movieLibrary = new MovieLibrary();
    static File path = new File("./src/main/resources/movies.json");

    public static void main(String[] args) throws IOException {

        movieLibrary = FileInputHandler.getMoviesToList(path);
        pickMenuOptions();
    }

    public static void pickMenuOptions() {
        while (true) {
            int selectedOption = UserMenu.getIntFromUser();
            switch (selectedOption) {
                case 1:
                    movieLibrary.printMoviesBetweenDate(UserMenu.getDate(), UserMenu.getDate());
                    break;
                case 2:
                    movieLibrary.printRandomMovieInformation();
                    break;
                case 3:
                    //choose Tom Hanks ;)
                    movieLibrary.printMoviesWithChosenActor(UserMenu.getActorDataFromUser());
                    break;
                case 4:
                    System.exit(0);
                    break;
                default:
                    System.out.println("Something went wrong, try again");
            }
        }
    }
}