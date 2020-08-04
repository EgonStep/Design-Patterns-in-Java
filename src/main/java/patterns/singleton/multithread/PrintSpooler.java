package patterns.singleton.multithread;

public class PrintSpooler {

    private static final PrintSpooler spooler = new PrintSpooler();

    private static boolean initialized = false;

    private PrintSpooler() { }

    private void init() {
        // Code to initialize our printer spooler goes here
    }

    // The synchronized keyword prevents two threads entering a method at the same time. Slowing the application
    public static synchronized PrintSpooler getInstance() {
        if(initialized) return spooler;
        spooler.init();
        initialized = true;
        return spooler;
    }
}
