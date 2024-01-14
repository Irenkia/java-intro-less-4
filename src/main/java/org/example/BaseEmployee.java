package org.example;

public abstract  class BaseEmployee{
    protected String name;
    protected String surname;
    private final  double basicSalary = 3000.0;
    private int yearOfWork;

    public abstract double calcMonthlySalary();

    public BaseEmployee(String name, String surname, int yearOfWork) {
        this.name = name;
        this.surname = surname;
        this.yearOfWork = yearOfWork;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public double getBasicSalary() {
        return basicSalary;
    }

    public int getYearOfWork() {
        return yearOfWork;
    }

    @Override
    public String toString() {
        return "\nname='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", yearOfWork=" + yearOfWork;
    }

}
