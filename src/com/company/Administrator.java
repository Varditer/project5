package com.company;

public class Administrator extends Person {
    private int Salary;
    private String Reportcount;

    public int getSalary() {
        return Salary;
    }

    public void setSalary(int salary) {
        Salary = salary;
    }

    public String getReportcount() {
        return Reportcount;
    }

    public void setReportcount(String reportcount) {
        Reportcount = reportcount;
    }
}
