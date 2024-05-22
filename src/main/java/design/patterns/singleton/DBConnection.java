package design.patterns.singleton;

public class DBConnection {
    private static DBConnection connection;

    private DBConnection(){}

    public static DBConnection getConnection(){
        if(connection == null){
            synchronized (DBConnection.class){
                if(connection == null)
                    connection = new DBConnection();
            }
        }
        return connection;
    }

}
