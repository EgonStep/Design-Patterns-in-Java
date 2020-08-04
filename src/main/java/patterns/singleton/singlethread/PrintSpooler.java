package patterns.singleton.singlethread;

import lombok.Setter;

@Setter
public class PrintSpooler {

    private static PrintSpooler spooler;

    private static boolean isInitialized = false;

    private PrintSpooler() { /* prevent new instances */ }

    private void init() {
        // Code to initialized our print spooler goes here
    }

    public static PrintSpooler getInstance() {
        if (isInitialized) {
            return spooler;
        }
        spooler.init();
        isInitialized = true;
        return spooler;
    }
}
