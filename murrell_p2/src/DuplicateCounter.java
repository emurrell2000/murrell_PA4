import java.io.PrintWriter;
import java.util.Collections;
import java.util.HashMap;
import java.util.Scanner;

public class DuplicateCounter {
    private static HashMap<String, Integer> wordCounter = new HashMap<String, Integer>();

    public static void count(Scanner dataFile) {
        while(dataFile.hasNext()) {
            String nextWord = dataFile.next();
            if(wordCounter.containsKey(nextWord)) {
                wordCounter.put(nextWord, (wordCounter.get(nextWord) + 1));
            }
            else {
                wordCounter.put(nextWord, 1);
            }
        }
    }
    public static void write(PrintWriter outputFile) {
        outputFile.print(Collections.singletonList(wordCounter));
    }

}