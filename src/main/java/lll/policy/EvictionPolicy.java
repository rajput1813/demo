package lll.policy;

public interface EvictionPolicy <Key>{
    Key updateKey(Key key);
    Key evictKey();
}
