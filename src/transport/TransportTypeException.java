package transport;

import java.io.IOException;

public class TransportTypeException extends IOException {
    public TransportTypeException() {
        super();
    }

    public TransportTypeException(String message) {
        super(message);
    }

    public TransportTypeException(String message, Throwable cause) {
        super(message, cause);
    }

    public TransportTypeException(Throwable cause) {
        super(cause);
    }
}
