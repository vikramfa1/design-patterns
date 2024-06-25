package lld.Microsoft.CacheLLD.policy;

public interface EvictionPolicy<Key> {
    public void keysAccessed(Key key);
    public Key evict();
}
