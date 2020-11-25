package com.company;

import java.util.Calendar;
import java.util.Date;

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
        Calendar cal = Calendar.getInstance();
        Date date = new Date();
        date.setYear(2012);
        date.setMonth(3);
        date.setDate(2);
        cal.setTime(date);
        cal.get(Calendar.DAY_OF_WEEK);
      //  Date date = new Date(year, month, day, 0, 0);
        return Reportcount;
    }

    public void setReportcount(String reportcount) {
        Reportcount = reportcount;
    }
}
