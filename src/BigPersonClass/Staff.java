package src.BigPersonClass;

public class Staff extends Person {
    private String school;
    private double pay;

    public Staff(){
    };

    public void setSchool(String school) {
        this.school = school;
    }

    public String getSchool() {
        return school;
    }

    public void setPay(double pay) {
        this.pay = pay;
    }

    public double getPay() {
        return pay;
    }

    @Override
    public String toString(){
        return "Staff[Person[name = " + super.getName() + " ,address = " + super.getAddress() + "]" +
                ",school = " + getSchool() + " ,pay = " + getPay() + "]";
    }
}
