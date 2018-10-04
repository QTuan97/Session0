package src.StopWatch;

public class Watch {
    public static void main(String[] args) {
        setup StopWatch0 = new setup();
        int count = 0;
        StopWatch0.start();
        for(int i = 0;i < 104440000;i++){
            count += 12323;
        }
        StopWatch0.end();
        System.out.println("It takes " + StopWatch0.getElapsedTime() + " milliseconds");
    }
}
