package com.company.employer;

public class Employee implements IEmployee {
    private String firstName;
    private String lastName;
    private String department;
    private String company;

    public Employee() {
    }

    public Employee(String firstName, String lastName, String department, String company) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.department = department;
        this.company = company;
    }

    @Override
    public String getFirstName() {
        return firstName;
    }

    @Override
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    @Override
    public String getLastName() {
        return lastName;
    }

    @Override
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    @Override
    public String getDepartment() {
        return department;
    }

    @Override
    public void setDepartment(String department) {
        this.department = department;
    }

    @Override
    public String getCompany() {
        return company;
    }

    @Override
    public void setCompany(String company) {
        this.company = company;
    }
}
