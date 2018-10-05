package src.gardenOfEden;

public class World {
    public static void main(String[] args) {
        Apple goldApple = new Apple();
        Snake snake = new Snake();
        Human Adam = new Human();
        Human Eva = new Human();
        God god = new God();
        god.say("Chúa nói: Không được ăn táo, nếu ăn sẽ chết");
        snake.say("Con rắn nói: Ăn táo đi ngon lắm, không chết đâu");
        Adam.setGender(true);
        Adam.setName("Adam");
        Adam.setAge(24);
        Eva.setGender(false);
        Eva.setName("Eva");
        Eva.setAge(19);
        while(goldApple.isEmpty()){
            System.out.println(Eva.getName() + " ăn 1 miếng táo");
            Eva.eat(goldApple.weight);
            goldApple.weight--;
            System.out.println(Adam.getName() + " ăn 1 miếng táo");
            Adam.eat(goldApple.weight);
            goldApple.weight--;
        }
        System.out.println("Adam đi ngủ");
        Adam.sleep();
        System.out.println("Eva đi ngủ");
        Eva.sleep();
        god.say("Chúa nói: Eva bà sẽ phải vâng lời chồng và đau đớn khi sinh con");
        god.say("Chúa nói: Adam ngươi sẽ phải cuốc đất trồng cây mà ăn");
    }
}
