package src.getRandom;

public class frist50Num {
    public static void main(String[] args) {
    createRandom fristRandom = new createRandom();
    fristRandom.setRange(100);
    for(int i = 0; i < 50;i++){
    System.out.println(fristRandom.randomGenerator());
    }
    }
}
