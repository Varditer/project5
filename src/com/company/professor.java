package com.company;

public class professor extends Person {
    private int salary;
    private String laboratory;
    private String computer;
    private String Lecture;

    public int getSalary() {
        return salary;
    }

    public String getLaboratory() {
        return laboratory;
    }

    public void setLaboratory(String laboratory) {
        this.laboratory = laboratory;
    }

    public String getComputer() {
        return computer;
    }

    public String getLecture() {
        return Lecture;
    }

    public void setLecture(String lecture) {
        Lecture = lecture;
    }

    public void setComputer(String computer) {
        this.computer = computer;

    }

    public void setSalary(int salary) {
        this.salary = salary;



    }
}
