package lld.Microsoft.CacheLLD.exception;

public class StorageFullException extends RuntimeException{
    public StorageFullException(String msg) {
        super(msg);
    }

    public StorageFullException(String msg, Throwable throwable) {
        super(msg, throwable);
    }
}
