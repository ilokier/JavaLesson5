import java.util.List;
import java.util.Random;

public class MovieLibrary {
    static Random random = new Random();
    private List<Movie> movies;
    private List<Movie> filtredList;

    public MovieLibrary(List<Movie> movies) {
        this.movies = movies;
    }

    public MovieLibrary() {
    }

    public List<Movie> getMovies() {
        return movies;
    }

    public void printMoviesWithChosenActors(Actor actor, MovieLibrary movieLibrary) {
        for (Movie movie : movieLibrary.getMovies()) {
            if (movie.getActors().get(0).getName().equals(actor.getName())) {
                if (movie.getActors().get(0).getLastName().equals(actor.getLastName())) {
                    System.out.println(actor.getName());

                }

            }
        }
        System.out.println(movies);
    }

    public Movie randomFilm(MovieLibrary movieLibrary) {
        for (Movie movie : movies) {
            movies.get(random.nextInt(movies.size()));
                   }
        return new Movie();
    }

    public void printMoviesBetweenDate(int year1, int year2) {
        for (Movie movie : movies) {
            if (movie.getDate() <= year2 & movie.getDate() >= year1) {
                filtredList.add(movie);
                System.out.println(movie.getTitle());
            }
        }

        System.out.println(filtredList.get(0).getTitle());
     }

//     public void getAllData(){
//         for (Movie movie : movies) {
//             System.out.println(movie.toString());
//
//         }
     }


