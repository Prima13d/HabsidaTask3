package app.model;

import  org.springframework.stereotype.Component;

import java.time.LocalTime;

@Component
public class Timer {
    private final LocalTime sayTime;

    public Timer() {
        this.sayTime = LocalTime.now();
    }

    public LocalTime getSayTime() {
        return sayTime;
    }

    private Long nanoTime = System.nanoTime();

    public Long getTime() {
        return nanoTime;
    }
}
