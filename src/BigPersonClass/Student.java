package src.BigPersonClass;

public class Student extends Person {
    private String program;
    private int year;
    private double fee;

    public Student(){
    };

    public void setProgram(String program) {
        this.program = program;
    }

    public String getProgram() {
        return program;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getYear() {
        return year;
    }

    public void setFee(double fee) {
        this.fee = fee;
    }

    public double getFee() {
        return fee;
    }

    @Override
    public String toString(){
        return "Student[Person[name = " + super.getName() + " ,address = " + super.getAddress() +"]" +
                ",program = " + getProgram() + " ,year = " + getYear() + " ,fee = " + getFee() + "]";
    }
}
