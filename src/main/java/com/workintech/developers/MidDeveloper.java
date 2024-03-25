package com.workintech.developers;

public class MidDeveloper extends Employee{

    private MidDeveloper[] midDevelopers;

    public MidDeveloper(int id, String name, double salary) {
        super(id, name, salary);
    }

    @Override
    public void work() {
        setSalary(40000);
        System.out.println(getName() +" mid developer starts to working");
    }
}
