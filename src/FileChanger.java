import java.io.FileWriter;
import java.io.IOException;

public class FileChanger{
    private String filePath = "C:\\Users\\Lenovo\\Desktop\\untitled\\file.txt";

    public void fileChanger(Initializer initializer) {
        try {
            FileWriter fileWriter = new FileWriter(filePath);
            for (String result : initializer.resultList) {
                fileWriter.append(result + "\n");
            }
            fileWriter.close();
            System.out.println("Successfully wrote to the file.");
        } catch (IOException e) {
            System.out.println("Eerror");
            e.printStackTrace();
        }
    }
}