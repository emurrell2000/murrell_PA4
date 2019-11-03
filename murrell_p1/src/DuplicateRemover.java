import java.util.Scanner;
import java.util.HashSet;
import java.io.PrintWriter;

public class DuplicateRemover {
    private static HashSet<String> uniqueWords = new HashSet<String>();

    public static void remove(Scanner dataFile) {
        while(dataFile.hasNext()) {
            uniqueWords.add(dataFile.next());
        }
    }
    public static void write(PrintWriter outputFile) {
        outputFile.print(uniqueWords);
    }

}
