import java.util.Scanner;

public class HangmanGame {


    private static final int MISTAKES_ALLOWED = 10;
    private static final String PLAYMODE_COMMANDLINE = "CommandLine";
    // TODO other play modes (?)

    private String playMode;

    public String getPlayMode() {
        return playMode;
    }

    public void setPlayMode(String playMode) {
        this.playMode = playMode;
    }

    //TODO What about array lists?
    private String secretValue;
    private String [] secretValueMask;

    private boolean isFinished;
    private int mistakes;
    private boolean victory;

    public HangmanGame(String secretValue) {
        this.secretValue = secretValue;
        this.secretValueMask = new String[secretValue.length()];
        for (int i = 0; i < secretValue.length(); i++) {
            if (' ' == this.secretValue.charAt(i))
                this.secretValueMask[i] = "  ";
            else
                this.secretValueMask[i] = "_ ";
        }
        this.isFinished = false;
        this.mistakes = 0;
        this.playMode = PLAYMODE_COMMANDLINE;
    }

    public void play() {
        if (mistakes >= MISTAKES_ALLOWED) {
            printCurrentMask();
            this.isFinished = true;
            this.victory = false;
            System.out.println("\n\nYou LOST by making 10 mistakes. Try again.");
            return;
        } else {
            if (this.playMode.equals(PLAYMODE_COMMANDLINE)) {
                printCurrentMask();
                System.out.print("\nType a letter: ");
                evaluateUserGuess();
                evaluateVictory();
            }
        }
    }

    private void evaluateVictory() {
        for (String letter : this.secretValueMask) {
            if (letter.contains("_"))
                return;
        }
        printCurrentMask();
        this.isFinished = true;
        this.victory = true;
        System.out.println("\n\nYou guessed '" + this.secretValue + "' and made " + this.mistakes + " mistakes.");

    }

    private void evaluateUserGuess() {
        Scanner scanner = new Scanner(System.in);
        String guess = scanner.next();
        boolean mistake = true;
        int startingIndex=0;
        while (this.secretValue.indexOf(guess, startingIndex) >= 0) {
            int guessedAt = this.secretValue.indexOf(guess, startingIndex);
            this.secretValueMask[guessedAt] = guess + " ";
            startingIndex = guessedAt + 1;
            mistake = false;
        }
        if (mistake)
            this.mistakes++;

    }

    private void printCurrentMask() {
        System.out.println();
        System.out.println("You've made " + this.mistakes + " mistake(s).");
        for (int i = 0; i < this.secretValue.length(); i++) {
                System.out.print(this.secretValueMask[i]);
        }
    }

    public boolean isFinished() {
        return isFinished;
    }
}
