package ratelimiter;


import java.time.Instant;

public class Bucket {
    private  int capacity;
    private  int refillRate;
    private  int tokens;
    private Instant lastRefillTime;

    public Bucket(int capacity, int refillRate) {
        this.capacity = capacity;
        this.refillRate = refillRate;
        this.tokens=capacity;
        this.lastRefillTime=  Instant.now();
    }

    public Boolean tryConsume() throws InterruptedException {
        refill();
        if(tokens>0){
            tokens--;
            System.out.println("request is allowed ");
            return  true;
        }
        else
        {
            System.out.println("request is not allowed. ");
            return false;
        }
    }
    private void refill() throws InterruptedException {
        Instant now = Instant.now();
        Instant lastRefillTime= this.lastRefillTime;
       // Thread.sleep(5000);
        Double d= Instant.now().minusNanos(lastRefillTime.getNano()).getNano()*1.0;
        int tokens= (int)Math.ceil(d/1000000000)*refillRate;
        this.tokens = Math.min(capacity,this.tokens+tokens);
    }
}
