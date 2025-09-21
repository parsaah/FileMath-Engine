import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class FileReader {
    String filePath = "C:\\Users\\Lenovo\\Desktop\\untitled\\file.txt";

    public void fileReader(Initializer initializerObj) {
        try {
            File file = new File(filePath);
            Scanner scanner = new Scanner(file);

            while (scanner.hasNextLine()) {
                String data = scanner.nextLine();
                String[] pieces = data.trim().split(" ");
                initializerObj.initializer(Integer.parseInt(pieces[0]), pieces[1], Integer.parseInt(pieces[2]));
            }
        } catch (FileNotFoundException e) {
            System.out.println("Eerror");
            e.printStackTrace();
        }
    }
}