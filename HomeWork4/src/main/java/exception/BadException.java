package exception;

/**
 * Исключение в случае наличия некорректного символа
 */
public class BadException extends RuntimeException {
    public BadException(String message) {
        super(message);
    }
}
