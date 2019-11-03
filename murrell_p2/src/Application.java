import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Application {
    public static void main(String[] args) throws IOException {
        DuplicateCounter duplicateCounter = new DuplicateCounter();

        FileInputStream dataFile = new FileInputStream("problem2.txt");
        Scanner inFS = new Scanner(dataFile);

        FileOutputStream outputFile = new FileOutputStream("unique_word_counts.txt");
        PrintWriter outFS = new PrintWriter(outputFile);

        duplicateCounter.count(inFS);
        duplicateCounter.write(outFS);

        outFS.flush();
        dataFile.close();
        outputFile.close();
    }
}
