package com.company;


public class Student extends Person {

    private String faculty;
    private int studentID;
    private String studentticket;

    public void setStudentticket(String studentticket) {
        this.studentticket = studentticket;
    }

    public String getFaculty() {
        return faculty;
    }

    public int getStudentID() {
        return studentID;
    }

    public void setStudentID(int studentID) {
        this.studentID = studentID;
    }

    public String getTicket() {
        return studentticket;
    }

    public void setTicket(String ticket) {
        this.studentticket = ticket;
    }

    public void setFaculty(String faculty) {
        this.faculty = faculty;



    }
}
