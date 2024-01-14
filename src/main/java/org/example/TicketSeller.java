package org.example;

public class TicketSeller extends BaseEmployee{
    private double  bonusAmount = 0.0;

    public TicketSeller(String name, String surname, int yearOfWork) {
        super(name, surname, yearOfWork);
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
        return "\nTicketSeller :" + super.toString();
    }
}
