import java.util.List;

public class Movie {
    private String title;
    private Director director;
    private int date;
    private String genre;
    private List<Actor> actors;

    public Movie(String title, Director director, int date, String genre, List<Actor> actors) {
        this.title = title;
        this.director = director;
        this.date = date;
        this.genre = genre;
        this.actors = actors;
    }

    public Movie() {

    }

    public Movie(int date) {
        this.date = date;
    }

    public String getTitle() {
        return title;
    }

    public Director getDirector() {
        return director;
    }

    public int getDate() {
        return date;
    }

    public String getGenre() {
        return genre;
    }

    public List<Actor> getActors() {
        return actors;
    }

    @Override
    public String toString() {
        return "title: " + title + " \ndirector: " + director + " \ndate: " + date + " \ngenre: " + genre + "  \nactors: " + actors;
    }
}



