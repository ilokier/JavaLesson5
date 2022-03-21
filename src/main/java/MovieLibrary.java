import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class MovieLibrary {
    static Random random = new Random();
    List<Movie> filtredList = new ArrayList<>(3);
    private List<Movie> movies;

    public MovieLibrary() {
    }

    public List<Movie> getMovies() {
        return movies;
    }

    public void printMoviesWithChosenActors(Actor actor) {
        System.out.println("Your actor played in: ");
        for (Movie m : movies) {
            if (m.getActors().get(0).equals(actor)) {
                filtredList.add(m);
                System.out.println(m.getTitle());
            }
        }
    }

    public void getRandomFilm() {
        System.out.println("Random film information: ");
        System.out.println(movies.get(random.nextInt(movies.size())).toString());
    }

    public void printMoviesBetweenDate(int year1, int year2) {
        List<Movie> filtredMoviesWithDate = new ArrayList<>();
        for (Movie movie : movies) {
            if (movie.getDate() <= year2 & movie.getDate() >= year1) {
                filtredMoviesWithDate.add(movie);
            }
        }
        System.out.println("Your movies are: ");
        for (Movie movie : filtredMoviesWithDate) {
            System.out.println(movie.getTitle());
        }

    }

}
