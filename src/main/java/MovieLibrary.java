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
        for (Movie m : movies) {
            for (int i = 0; i < m.getActors().size(); i++) {
                if (m.getActors().get(i).getName().equals(actor.getName()) && m.getActors().get(i).getLastName().equals(actor.getLastName())) {
                    filtredList.add(m);
                }
            }
        }
        System.out.println("Your actor played in: ");
        for (Movie movie : filtredList) {
            System.out.println(movie.getTitle());
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
