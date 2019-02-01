import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class HangmanForMovies {
    public static void main (String [] args) {

        String [] movies;

        System.out.println("Initializing application.");
        movies = getMovies(getNumberOfMovies());

        HangmanGame game = new HangmanGame(movies);
        game.startGame();

    }

    private static String[] getMovies(int numberOfMovies) {
        // Read file
        Scanner scanner;
        File movieList = new File("files/movieList.txt");
        String [] movies = new String[numberOfMovies];

        try {
            scanner = new Scanner(movieList);

            int arrayPosition = 0;
            while(scanner.hasNextLine()) {
                movies[arrayPosition] = scanner.nextLine();
                arrayPosition++;
            }

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        return movies;
    }

    private static int getNumberOfMovies() {
        // Read file
        Scanner scanner;
        File movieList = new File("files/movieList.txt");

        int countMovies = 0;
        try {
            scanner = new Scanner(movieList);

            // Get basic info about the file
            while(scanner.hasNextLine()) {
                scanner.nextLine();
                countMovies++;
            }
            System.out.println("I have a list of " + countMovies + " movies.");

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        return countMovies;
    }
}
