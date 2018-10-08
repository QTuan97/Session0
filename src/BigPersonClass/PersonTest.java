package src.BigPersonClass;

public class PersonTest {
    public static void main(String[] args) {
        Person person = new Person();
        Student Adam = new Student();
        Adam.setName("Adam");
        Adam.setAddress("England");
        Adam.setProgram("Economic");
        Adam.setYear(3);
        Adam.setFee(20000.0);
        System.out.println(Adam.toString());
        Staff Lisa = new Staff();
        Lisa.setName("Lisa");
        Lisa.setAddress("Canada");
        Lisa.setSchool("College of Economic");
        Lisa.setPay(30000.0);
        System.out.println(Lisa.toString());
    }
}
