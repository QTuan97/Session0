package src.gardenOfEden;

public class Apple {
    public int weight = 10;
    public boolean isEmpty(){
        if(weight <= 0){
            System.out.println("Empty apple!");
            return false;
        }
        return true;
    }
}
