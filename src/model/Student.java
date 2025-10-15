package model;

public class Student {
    private String identification;
    private byte gender;
    private double salary;
    private boolean work;

    public Student(String identification, byte gender, double salary, boolean work) {
        this.identification = identification;
        this.gender = gender;
        this.salary = salary;
        this.work = work;
    }

    public String getIdentification() {
        return identification;
    }

    public void setIdentification(String identification) {
        this.identification = identification;
    }

    public byte getGender() {
        return gender;
    }

    public void setGender(byte gender) {
        this.gender = gender;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public boolean isWork() {
        return work;
    }

    public void setWork(boolean work) {
        this.work = work;
    }
}
