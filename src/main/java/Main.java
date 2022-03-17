import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;

import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.Random;


public class Main {
    static Random random = new Random();
  public static Movie movie= new Movie();
   public static MovieLibrary movieLibrary = new MovieLibrary();
  static File path = new File("./src/main/resources/movies.json");
    public static void main(String[] args) throws IOException {

        movieLibrary = FileInputHandler.getMoviesToList(path);
        System.out.println(movieLibrary.getMovies().toString());
        pickMenuOptions(movie);
           }

    public static void pickMenuOptions(Movie movie) throws IOException {
        int selectedOption = UserMenu.getIntFromUser();
        switch (selectedOption) {
            case 1:
                movieLibrary.printMoviesBetweenDate(UserMenu.getDate(), UserMenu.getDate());
break;
            case 2:
                movieLibrary.randomFilm(FileInputHandler.getMoviesToList(path));
                break;
            case 3:
                movieLibrary.printMoviesWithChosenActors(UserMenu.getActorDataFromUser(), movieLibrary);

        }
    }
}
