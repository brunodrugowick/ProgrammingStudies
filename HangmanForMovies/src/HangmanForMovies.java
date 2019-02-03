import java.io.FileNotFoundException;

public class HangmanForMovies {

    public static void main (String [] args) {

        //System.out.print("Welcome! This is a classic Hangman game. I'll choose a movie and you'll have to guess which one it's.");

        System.out.println("Initializing game...");

        System.out.println("    getting movies list.");
        MoviesList moviesList = null;
        if (args.length != 0) {
            try {
                moviesList = new MoviesList(args[0]);
            } catch (FileNotFoundException e) {
                e.printStackTrace();
                System.out.println("Could not use/find the specified file.");
            }
        }
        else {
            try {
                moviesList = new MoviesList();
            } catch (FileNotFoundException e) {
                e.printStackTrace();
                System.out.println("Could not use/find the default file. Check your installation.");
            }
        }
        //System.out.println(moviesList.toString());

        System.out.println("    randomly selecting one for you to guess.");
        String movie = moviesList.getRandomMovie();

        System.out.println("\nOk. I'm done! Let's start, shall we?");
        HangmanGame hangmanGame = new HangmanGame(movie);

        while (!hangmanGame.isFinished()){
            hangmanGame.play();
        }
    }
}