package src.gardenOfEden;

public class Human {
    private String name;
    private boolean gender;
    private int age;

    public void setAge(int age) {
        this.age = age;
    };
    public void setGender(boolean gender) {
        this.gender = gender;
    };
    public String getName(){
        return this.name;
    }
    public void setName(String name) {
        this.name = name;
    };
    public void say(String words){
        System.out.println(words);
    };
    public void eat(int weigth){
        System.out.println("Eating an apple");
    }
    public void sleep(){
        System.out.println("zZZZ");
    }

}
