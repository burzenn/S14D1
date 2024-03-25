package com.workintech;

import com.workintech.cylinder.Circle;
import com.workintech.cylinder.Cylinder;
import com.workintech.developers.HRManager;
import com.workintech.developers.JuniorDeveloper;
import com.workintech.developers.MidDeveloper;
import com.workintech.developers.SeniorDeveloper;
import com.workintech.pool.Cuboid;
import com.workintech.pool.Rectangle;

public class Main {
    public static void main(String[] args) {

        System.out.println("Cylinder Problem: ");

        Circle circle = new Circle(3.75);
        System.out.println("circle.radius= " + circle.getRadius());
        System.out.println("circle.area= " + circle.getArea());

        Cylinder cylinder = new Cylinder(5.55, 7.25);
        System.out.println("cylinder.radius= " + cylinder.getRadius());
        System.out.println("cylinder.height= " + cylinder.getHeight());
        System.out.println("cylinder.area= " + cylinder.getArea());
        System.out.println("cylinder.volume= " + cylinder.getVolume());


        System.out.println("Pool Area Problem: ");

        Rectangle rectangle = new Rectangle(5, 10);
        System.out.println("rectangle.width= " + rectangle.getWidth());
        System.out.println("rectangle.length= " + rectangle.getLength());
        System.out.println("rectangle.area= " + rectangle.getArea());

        Cuboid cuboid = new Cuboid(5,10,5);
        System.out.println("cuboid.width= " + cuboid.getWidth());
        System.out.println("cuboid.length= " + cuboid.getLength());
        System.out.println("cuboid.area= " + cuboid.getArea());
        System.out.println("cuboid.height= " + cuboid.getHeight());
        System.out.println("cuboid.volume= " + cuboid.getVolume());

        System.out.println("Developer Company Problem: ");

        JuniorDeveloper burcu = new JuniorDeveloper(1,"burcu", 0);
        JuniorDeveloper buse = new JuniorDeveloper(2,"buse", 0);
        JuniorDeveloper batu = new JuniorDeveloper(3,"batu", 0);

        System.out.println("before start working: " + burcu);
        System.out.println("before start working: " + buse);
        System.out.println("before start working: " + batu);

        burcu.work();
        buse.work();
        batu.work();

        System.out.println("after started working: " + burcu);
        System.out.println("after started working: " + buse);
        System.out.println("after started working: " + batu);

        MidDeveloper burcu1 = new MidDeveloper(1,"burcu", 0);
        MidDeveloper buse1 = new MidDeveloper(2,"buse", 0);
        MidDeveloper batu1 = new MidDeveloper(3,"batu", 0);

        System.out.println("before start working: " + burcu1);
        System.out.println("before start working: " + buse1);
        System.out.println("before start working: " + batu1);

        burcu1.work();
        buse1.work();
        batu1.work();

        System.out.println("after started working: " + burcu1);
        System.out.println("after started working: " + buse1);
        System.out.println("after started working: " + batu1);

        SeniorDeveloper burcu2 = new SeniorDeveloper(1,"burcu", 0);
        SeniorDeveloper buse2 = new SeniorDeveloper(2,"buse", 0);
        SeniorDeveloper batu2 = new SeniorDeveloper(3,"batu", 0);

        System.out.println("before start working: " + burcu2);
        System.out.println("before start working: " + buse2);
        System.out.println("before start working: " + batu2);

        burcu2.work();
        buse2.work();
        batu2.work();

        System.out.println("after started working: " + burcu2);
        System.out.println("after started working: " + buse2);
        System.out.println("after started working: " + batu2);

        System.out.println("----------");

        HRManager hrManager = new HRManager(1,"elif",0,new JuniorDeveloper[2],new MidDeveloper[5], new SeniorDeveloper[4]);
        System.out.println("before start working: " + hrManager);
        hrManager.work();
        System.out.println("after started working: " + hrManager);

        hrManager.addEmployee(0,burcu2);
        hrManager.addEmployee(1,buse);
        hrManager.addEmployee(0,batu1);

        System.out.println(hrManager);




    }
}
