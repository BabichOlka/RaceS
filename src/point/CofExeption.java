package point;

public class CofExeption extends Exception {
    public CofExeption() {
    }

    public CofExeption(String message) {
        super(message);
    }

    public CofExeption(String message, Throwable cause) {
        super(message, cause);
    }

    public CofExeption(Throwable cause) {
        super(cause);
    }

    public CofExeption(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
