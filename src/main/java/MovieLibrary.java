import java.util.List;
import java.util.Random;

public class MovieLibrary {
    static Random random = new Random();
    private List<Movie> movies;

    public MovieLibrary() {
    }

    public List<Movie> getMovies() {
        return movies;
    }

    public void printMoviesWithChosenActor(Actor actor) {
        System.out.println("Your actor played in: ");
        for (Movie m : movies) {
            if (m.getActors().get(0).equals(actor)) {
                System.out.println(m.getTitle());
            }
        }
    }

    public void printRandomMovieInformation() {
        System.out.println("Random film information: ");
        System.out.println(movies.get(random.nextInt(movies.size())).toString());
    }

    public void printMoviesBetweenDate(int year1, int year2) {
        System.out.println("Your movies are: ");
        for (Movie movie : movies) {
            if (movie.getDate() <= year2 & movie.getDate() >= year1) {
                System.out.println(movie.getTitle());

            }
        }
    }

}
