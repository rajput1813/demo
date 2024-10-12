package ratelimiter;

import com.sun.tools.javac.Main;

public class RateLimitMain {
    public static void main(String[] args) throws InterruptedException {
        RateLimiter rateLimiter = new RateLimiter(1,1);
        while(true){
            rateLimiter.allowRequest("1");
        }

//        rateLimiter.allowRequest("1");
//        rateLimiter.allowRequest("1");
//        rateLimiter.allowRequest("1");
//        rateLimiter.allowRequest("1");
//        rateLimiter.allowRequest("1");
//        rateLimiter.allowRequest("1");
//        rateLimiter.allowRequest("1");
//        rateLimiter.allowRequest("1");
//        rateLimiter.allowRequest("1");
//        rateLimiter.allowRequest("1");
//        rateLimiter.allowRequest("1");
//        rateLimiter.allowRequest("1");
//        rateLimiter.allowRequest("1");
//        rateLimiter.allowRequest("1");
//        rateLimiter.allowRequest("1");
//        rateLimiter.allowRequest("1");
//        rateLimiter.allowRequest("1");
//        rateLimiter.allowRequest("1");
//        rateLimiter.allowRequest("1");
//        rateLimiter.allowRequest("1");
//        rateLimiter.allowRequest("1");
//        rateLimiter.allowRequest("1");
//        rateLimiter.allowRequest("1");
//        rateLimiter.allowRequest("1");
//        rateLimiter.allowRequest("1");
//        rateLimiter.allowRequest("1");
//        rateLimiter.allowRequest("1");
//        rateLimiter.allowRequest("1");
//        rateLimiter.allowRequest("1");
//        rateLimiter.allowRequest("1");
//        rateLimiter.allowRequest("1");
//        rateLimiter.allowRequest("1");
//        rateLimiter.allowRequest("1");
//        rateLimiter.allowRequest("1");
//        rateLimiter.allowRequest("1");
//        rateLimiter.allowRequest("1");
//        rateLimiter.allowRequest("1");
//        rateLimiter.allowRequest("1");
//        rateLimiter.allowRequest("1");
    }
}
