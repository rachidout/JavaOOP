package validationofData;

import java.lang.*;

public class NonValidePasswordException extends RuntimeException {
    public NonValidePasswordException() {
        super();
    }

    public NonValidePasswordException(String message) {
        super(message);
    }

    public NonValidePasswordException(String message, Throwable cause) {
        super(message, cause);
    }
}
