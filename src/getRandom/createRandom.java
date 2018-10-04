package src.getRandom;
import java.util.Random;
public class createRandom {
    private int num;
    private Random generator = new Random(1000);
    public void setRange(int num){
        this.num = num;
    }
    public int getNum(){
        return this.num;
    }
    public int randomGenerator() {
        return generator.nextInt(this.num);
    }
}
