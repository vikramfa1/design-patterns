package lld.Microsoft.CacheLLD.policy;

public class LRUEvictionPolicy<Key> implements EvictionPolicy<Key>{

    @Override
    public void keysAccessed(Key key) {

    }

    @Override
    public Key evict() {
        return null;
    }
}
