import java.io.File;
import java.util.Scanner;

public class WordCount {
    public static void main (String [] args) throws Exception {

        File file;
        if (args.length == 0)
            file = new File("files/TheHappyPrince.txt");
        else
            file = new File(args[0]);
        Scanner scanner = new Scanner(file);

        int words = 0;
        while (scanner.hasNextLine()) {
            words += scanner.nextLine().split(" ").length;
        }

        System.out.println("There is " + words + " words on this file.");
    }
}
