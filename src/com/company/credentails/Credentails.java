package com.company.credentails;

import com.company.employer.IEmployee;

import java.util.Random;

public class Credentails {
    private IEmployee employee;
    private String email;
    private String password;

    public Credentails(IEmployee employee) {
        this.employee = employee;
    }

    public String generateEmailAddress() {
        return employee.getFirstName() + employee.getLastName() + "@"
                + employee.getDepartment() + "." + employee.getDepartment()
                + ".com";
    }

    public void generatePassword(int noOfChar) {
        this.password = this.generateRandomChar(noOfChar);
    }

    private String generateRandomChar(int noOfChar) {
        String str = "";
        Random random = new Random();
        for (int i = 0; i < noOfChar; i++) {
            str += (char) (random.nextInt(106) + '!');
        }
        return str;
    }

    public void generatePassword() {
        this.password = this.generateRandomChar(8);
    }

    public void showCredential() {
        System.out.println("Dear " + this.employee.getFirstName() + " your generated credentials are as follows");
        System.out.println("Email          --> " + this.email);
        System.out.println("Password       --> " + this.password);
    }
}
