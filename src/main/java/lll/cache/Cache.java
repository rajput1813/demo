package lll.cache;

import lll.policy.EvictionPolicy;

import java.util.HashMap;
import java.util.Map;

public class Cache<K,V> {
    private EvictionPolicy<K> evictionPolicy;
    private Map<K,V>database;
    private int capacity;
    public  Cache(EvictionPolicy evictionPolicy,int capacity){
        this.evictionPolicy = evictionPolicy;
        this.database = new HashMap<>();
        this.capacity=capacity;
    }
    public void put(K k,V v){
        if(database.containsKey(k)){
            evictionPolicy.updateKey(k);
            database.put(k,v);
            return;
        }
        if(database.size()>=capacity){
           K  k1 = evictionPolicy.evictKey();
           database.remove(k1);
           database.put(k,v);
           evictionPolicy.updateKey(k);

        }
    }
    public  V get(K k){
        if(database.containsKey(k)){
            evictionPolicy.updateKey(k);
            return  database.get(k);
        }
        return  null;
    }

}
