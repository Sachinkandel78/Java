import java.util.*;

class Employee {
    private String name;
    private double salary;

    public void setname(String name) {
        this.name = name;
    }

    public void setsalary(double salary) {
        this.salary = salary;
    }

    public String getname() {
        return name;
    }

    public double getsalary() {
        return salary;
    }
}

class Manager extends Employee {
    private String Section_name;

    public void setSection_name(String Section_name) {
        this.Section_name = Section_name;
    }

    public String getSection_name() {
        return Section_name;
    }
}

class Supervisor extends Employee {
    private int grp_id;

    public void setgrp_id(int grp_id) {
        this.grp_id = grp_id;
    }

    public int getgrp_id() {
        return grp_id;
    }
}

public class Demo {
    public static void main(String[] args) {
        Manager m = new Manager();
        m.setname("Sachin Kandel");
        m.setsalary(1000);
        m.setSection_name("Accounting");

        System.out.println("Name = " + m.getname());
        System.out.println("Salary = " + m.getsalary());
        System.out.println("Section = " + m.getSection_name());
    }
}
