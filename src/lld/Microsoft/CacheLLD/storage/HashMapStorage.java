package lld.Microsoft.CacheLLD.storage;

import lld.Microsoft.CacheLLD.exception.KeyNotFoundException;
import lld.Microsoft.CacheLLD.exception.StorageFullException;

import java.util.HashMap;

public class HashMapStorage<Key, Value> implements CacheStorage<Key, Value>{

    HashMap<Key, Value> hashMap;
    int capacity;

    public HashMapStorage(int capacity) {
        this.hashMap = new HashMap<>();
        this.capacity = capacity;
    }
    @Override
    public void put(Key key, Value value) {
        if(!isStorageFull()) {
            hashMap.put(key, value);
        } else {
            throw new StorageFullException("storage full");
        }
    }

    private boolean isStorageFull() {
        return this.hashMap.size() == capacity;
    }

    @Override
    public Value get(Key key) {
        if(hashMap.containsKey(key)) {
            return hashMap.get(key);
        } else {
            throw new KeyNotFoundException("key not found");
        }
    }

    @Override
    public Value delete(Key key) {
        if(hashMap.containsKey(key)) {
            return hashMap.remove(key);
        }
        return null;
    }
}
