package lld.Microsoft.CacheLLD.exception;

public class KeyNotFoundException extends RuntimeException{

    public KeyNotFoundException(String msg) {
        super(msg);
    }

    public KeyNotFoundException(String msg, Throwable throwable) {
        super(msg, throwable);
    }
}
