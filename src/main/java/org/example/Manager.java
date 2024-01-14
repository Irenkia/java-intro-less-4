package org.example;

public class Manager extends BaseEmployee{
    private final double basicSalary = 5000.0;
    private double  bonusAmount = 500.0;

    public Manager(String name, String surname, int yearOfWork) {
        super(name, surname, yearOfWork);
    }


    public double getBasicSalary() {
        return basicSalary;
    }

    public double getBonusAmount() {
        return bonusAmount;
    }

    public void setBonusAmount(double bonusAmount) {
        this.bonusAmount = bonusAmount;
    }

    public double calcMonthlySalary() {
        return getBasicSalary() + getBonusAmount();
    }

    @Override
    public int getYearOfWork() {
        return 2024 - super.getYearOfWork();
    }

    @Override
    public String toString() {
        return "\nManager :" + super.toString();
    }
}
