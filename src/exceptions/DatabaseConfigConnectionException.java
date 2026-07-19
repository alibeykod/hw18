package exceptions;

public class DatabaseConfigConnectionException extends RuntimeException {
    public DatabaseConfigConnectionException(String message) {
        super(message);
    }
}
