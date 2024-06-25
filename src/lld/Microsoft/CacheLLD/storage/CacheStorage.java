package lld.Microsoft.CacheLLD.storage;

import lld.Microsoft.CacheLLD.exception.KeyNotFoundException;
import lld.Microsoft.CacheLLD.exception.StorageFullException;

public interface CacheStorage<Key, Value> {
    public void put(Key key, Value value) throws StorageFullException;
    public Value get(Key key) throws KeyNotFoundException;
    public Value delete(Key key);

}
