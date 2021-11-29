package com.company;

import com.company.credentails.Credentails;
import com.company.employer.Employee;
import com.company.employer.IEmployee;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter your first name");
        String firstName = sc.nextLine();
        System.out.println("Please enter your last name");
        String lastName = sc.nextLine();
        System.out.println("Please enter your company name");
        String company = sc.nextLine();
        System.out.println("Please enter the department from the following\n1. Technical\n2.Admin\n3.Human Resource\n4.Legal");
        int department = sc.nextInt();
        IEmployee emp = new Employee();
        emp.setFirstName(firstName);
        emp.setLastName(lastName);
        emp.setCompany(company);
        switch (department) {
            case 1:
                emp.setDepartment("tech");
                break;
            case 2:
                emp.setDepartment("admin");
                break;
            case 3:
                emp.setDepartment("hr");
                break;
            case 4:
                emp.setDepartment("legal");
                break;
            default:
                throw new Error("Invalid Department no");

        }
        sc.close();
        Credentails cr = new Credentails(emp);
        cr.generateEmailAddress();
        cr.generatePassword();
        cr.showCredential();
    }
}
