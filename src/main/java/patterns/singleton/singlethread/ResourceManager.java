package patterns.singleton.singlethread;

public class ResourceManager {
    public static void main(String[] args) {

        PrintSpooler printSpooler = PrintSpooler.getInstance();
    }
}
