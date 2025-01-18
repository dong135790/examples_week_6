import java.io.*;
import java.util.Scanner;

/**
 * Skeleton code to demonstrate exceptions.
 */
public class ExceptionsFilesDemo {

    /**
     * A method to read in a file
     *
     * @param fileName the name of the file to be read
     * @throws FileNotFoundException thrown if the file cannot be found
     */
    public static void readFile(String fileName) throws FileNotFoundException {

        // Option 1: use a try/catch to handle a FileNotFoundException
        // locally in this method.
//        try {
//            BufferedReader br = new BufferedReader(new FileReader(fileName));
//        } catch (FileNotFoundException fnf) {
//            System.out.println("File not found: " + fileName);
//        }

        // Option 2: the FileNotFoundException will be propagated to the calling method.
        // Note the throws clause in the method header.
        BufferedReader br = new BufferedReader(new FileReader(fileName));

    }

    /**
     * Demonstrate reading a file using a try-with-resources.
     * This method is preferred as the file will be auto-closed.
     *
     * @param fileName name of the file
     */
    public static void readUsingTryWithResources(String fileName) {

        try (Scanner scanner = new Scanner(new File(fileName))) {
            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                System.out.println(line);
            }
        } catch (FileNotFoundException fnf) {
            System.out.println(fnf.getMessage());
//            fnf.printStackTrace();
        }
    }


    public static void main(String[] args) {

        // If readFile throws a checked exception, a try/catch will be used here.
        try {
            readFile("Test.txt");
        } catch (IOException e) {

        }

        // try/catch is not necessary
        // Note the relative path of the file.
        readUsingTryWithResources("testCases/text.txt");

    }


}
