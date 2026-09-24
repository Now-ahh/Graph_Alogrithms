package Exceptions;

public class ArcNotPresentException extends RuntimeException {
    public ArcNotPresentException(String message) {
        super(message);
    }
}
