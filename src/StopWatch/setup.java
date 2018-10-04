package src.StopWatch;
import java.lang.System;
public class setup {
    private long startTime;
    private long stopTime;
    public void start(){
        this.startTime = System.currentTimeMillis();
    }
    public void end() {this.stopTime = System.currentTimeMillis();}
    public long getElapsedTime(){
        long elapsed = this.stopTime - this.startTime;
        return elapsed;
    }
}
