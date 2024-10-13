package Java17;

import java.time.InstantSource;
import java.time.Clock;

public class InstantSourceExample {
    public static void main(String[] args) {
        InstantSource source = Clock.systemUTC();
        System.out.println("Current Instant: " + source.instant());
    }
}