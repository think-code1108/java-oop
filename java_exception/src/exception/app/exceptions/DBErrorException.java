package exception.app.exceptions;

public class DBErrorException extends Error {
    public DBErrorException(String message) {
        super("My Application Error - " + message);
    }
}
