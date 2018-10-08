package src.Animal;
public class AbstractAndInterfaceTests {
    public static void main(String[] args) {
        animal[] Animals = new animal[2];
        Animals[0] = new Tiger();
        Animals[1] = new Chicken();
        for (animal animal : Animals) {
            System.out.println(animal.makeSound());

            if (animal instanceof Chicken) {
                Edible edibler = (Chicken) animal;
                System.out.println(edibler.howToEat());
            }
        }
        Fruit[] fruits = new Fruit[2];
        fruits[0] = new Orange();
        fruits[1] = new Apple();
        for (Fruit fruit : fruits) {
            System.out.println(fruit.howToEat());
        }
    }
}
