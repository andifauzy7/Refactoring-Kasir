package database;

public final class DBRestoran {
    private static DBRestoran instance;

    private DBRestoran() {
        // The following code emulates slow initialization.

    }

    public static DBRestoran getInstance() {
        if (instance == null) {
            instance = new DBRestoran();
        }
        return instance;
    }
}
