import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/* This class loads a list of movies from a file */
public class MoviesList {

    private File file;

    //TODO What about array lists?
    private String [] movies;
    private int numberOfMovies;

    public MoviesList() throws FileNotFoundException {
        // Read file
        this.file = new File("../files/movieList.txt");
        setNumberOfMovies();
        getMoviesListFromFile();
    }

    public MoviesList(String filePath) throws FileNotFoundException {
        // Read file
        this.file = new File(filePath);
        setNumberOfMovies();
        getMoviesListFromFile();
    }

    private void getMoviesListFromFile() throws FileNotFoundException {

        this.movies = new String[this.numberOfMovies];

        int arrayPosition = 0;
        Scanner scanner = new Scanner(this.file);
        while(scanner.hasNextLine()) {
            this.movies[arrayPosition] = scanner.nextLine();
            arrayPosition++;
        }
    }

    private void setNumberOfMovies() throws FileNotFoundException {
        int numberOfMovies = 0;
        Scanner scanner = new Scanner(this.file);
        while(scanner.hasNextLine()) {
            numberOfMovies++;
            scanner.nextLine();
        }
        this.numberOfMovies = numberOfMovies;
    }

    public String getRandomMovie() {
        int random = (int) (Math.random() * this.numberOfMovies);
        return this.movies[random];
    }

    public String toString() {
        String movies = "===== Movies List =====\n";
        for (String movie: this.movies)
            movies += movie + "\n";
        movies += "===== End of list =====\n";
        return movies;
    }

}
