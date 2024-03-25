package com.workintech.developers;

public class JuniorDeveloper extends Employee{

    private JuniorDeveloper[] juniorDevelopers;

    public JuniorDeveloper(int id, String name, double salary) {
        super(id, name, salary);
    }

    @Override
    public void work() {
        setSalary(30000);
        System.out.println(getName() + " junior developer starts to working");
    }
}
