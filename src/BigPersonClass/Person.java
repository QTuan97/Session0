package src.BigPersonClass;

public class Person {
    private String name;
    private String address;

    public Person(){
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getAddress() {
        return address;
    }

    @Override
    public String toString(){
        return "Person[name = " + getName() + ",address = " + getAddress() +"]";
    }
}

