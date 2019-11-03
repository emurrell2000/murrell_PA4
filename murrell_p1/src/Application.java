import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Application {
    public static void main(String[] args) throws IOException {
        DuplicateRemover duplicateRemover = new DuplicateRemover();

        FileInputStream dataFile = new FileInputStream("problem1.txt");
        Scanner inFS = new Scanner(dataFile);

        FileOutputStream outputFile = new FileOutputStream("unique_words.txt");
        PrintWriter outFS = new PrintWriter(outputFile);

        duplicateRemover.remove(inFS);
        duplicateRemover.write(outFS);

        outFS.flush();
        dataFile.close();
        outputFile.close();
    }
}
