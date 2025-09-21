public class Main {
    public static void main(String[] args) {
        Initializer initializerObj = new Initializer();

        FileReader fileReader = new FileReader();
        fileReader.fileReader(initializerObj);

        FileChanger fileChanger = new FileChanger();
        fileChanger.fileChanger(initializerObj);
    }
}
