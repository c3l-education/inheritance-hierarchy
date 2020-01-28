package se.almstudio.service;

public class Employee extends Person {

    public int priceofemloyeePerHour;

    public Employee(String name, String familyName, int personalNumber, int price) {
        firstName = name;
        lastName = familyName;
        personnummer = personalNumber;
        priceofemloyeePerHour = price;
    }

    public void setPrice(int price) {
        priceofemloyeePerHour = price;
    }

    public int getPrice() {
        return priceofemloyeePerHour;
    }

    public static int salaryCalculator(int price, int numberofWorkingHours) {
        int salary = price * numberofWorkingHours;
        return salary;
    }

    public void info() {
        System.out.printf("employee name is %s\n", getName());
        System.out.printf("employee last name is %s\n", getFamily());
        System.out.printf("employee price per hour is %s\n", getPrice());
    }
}
