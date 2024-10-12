package ratelimiter;

import java.util.concurrent.ConcurrentHashMap;

public class RateLimiter {
    private int capacity;
    private  int refillRate;
    private ConcurrentHashMap<String,Bucket> buckets ;

    public RateLimiter(int capacity, int refillRate) {
        this.capacity = capacity;
        this.refillRate = refillRate;
        this.buckets=new ConcurrentHashMap<>();
    }
    public Boolean allowRequest(String userId) throws InterruptedException {
        Bucket  bucket= buckets.computeIfAbsent(userId,id->new Bucket(capacity,refillRate));
       return bucket.tryConsume();
    }
}
