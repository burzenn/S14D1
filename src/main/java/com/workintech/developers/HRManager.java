package com.workintech.developers;

public class HRManager extends Employee{

    private final JuniorDeveloper[] juniorDevelopers;
    private final MidDeveloper[] midDevelopers;
    private final SeniorDeveloper[] seniorDevelopers;


    public HRManager(int id, String name, double salary, JuniorDeveloper[] juniorDevelopers, MidDeveloper[] midDevelopers, SeniorDeveloper[] seniorDevelopers) {
        super(id, name, salary);
        this.juniorDevelopers = juniorDevelopers;
        this.midDevelopers = midDevelopers;
        this.seniorDevelopers = seniorDevelopers;
    }

    public void addEmployee(int index, JuniorDeveloper juniorDeveloper) {

        try {
            if(juniorDevelopers[index] == null) {
                juniorDevelopers[index] = juniorDeveloper;
            }
            else {
                System.out.println("index is full some record exist!");
            }
        } catch (ArrayIndexOutOfBoundsException e) {
            e.printStackTrace();
            System.out.println("index not found: " + index);
        }

    }

    public void addEmployee(int index, MidDeveloper midDeveloper) {

        try {
            if(midDevelopers[index] == null) {
                midDevelopers[index] = midDeveloper;
            }
            else {
                System.out.println("index is full some record exist!");
            }
        } catch (ArrayIndexOutOfBoundsException e) {
            e.printStackTrace();
            System.out.println("index not found: " + index);
        }

    }

    public void addEmployee(int index, SeniorDeveloper seniorDeveloper) {

        try {
            if(seniorDevelopers[index] == null) {
                seniorDevelopers[index] = seniorDeveloper;
            }
            else {
                System.out.println("index is full some record exist!");
            }
        } catch (ArrayIndexOutOfBoundsException e) {
            e.printStackTrace();
            System.out.println("index not found: " + index);
        }

    }

    @Override
    public void work() {
        setSalary(60000);
        System.out.println(getName() + "hr manager starts to working");
    }


}
