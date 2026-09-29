package app;

/**
 * Entry point used by native packages so JavaFX is loaded from the bundled
 * application classpath before the Application subclass is initialized.
 */
public final class Launcher {
    private Launcher() {
    }

    public static void main(String[] args) {
        MainApp.main(args);
    }
}
