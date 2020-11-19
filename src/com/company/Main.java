package com.company;

public class Main {

    public static void main(String[] args) {
        Student studet3=new Student();
        studet3.setFaculty("kqa");
        studet3.setProfession("byology");
        studet3.setTicket("12");
        studet3.setFirstName("Anna");
        studet3.setLastName("Amiryan");

        professor professor1 = new professor();
        professor1.setFirstName("Arman");
        professor1.setLastName("Karapetyan");
        professor1.setYear(55);
        professor1.setComputer("HP");
        professor1.setLaboratory("bacteriology");
        professor1.setLecture("byology");
        professor1.setSalary(200000);
        professor1.setPhone(86867);


        Administrator administrator = new Administrator();
        administrator.setReportcount("cost");
        administrator.setSalary(100000);
        administrator.setFirstName("Inna");
        administrator.setLastName("Alaverdyan");
        administrator.setPhone(73628);
        administrator.setYear(25);
        administrator.setProfession("economist");

        Rector rector = new Rector();
        rector.setFirstName("Ruben");
        rector.setLastName("Sahakyan");
        rector.setDocument("university");
        rector.setPhone(8688);
        rector.setProfession("Lawyer");
        rector.setYear(49);
        rector.setUniversity("EPMH");
        rector.setPosition("rector");

        librarian librarian = new librarian();
        librarian.setFirstName("Alise");
        librarian.setLastName("Aleyan");
        librarian.setPhone(78678);
        librarian.setProfession("librarian");
        librarian.setBooks("student");
        librarian.setYear(50);
        librarian.setListofbooks("Russian authors");



               











    }


}
