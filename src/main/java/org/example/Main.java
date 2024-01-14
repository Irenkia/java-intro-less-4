package org.example;

public class Main {
    public static void main(String[] args) {
        forEmployee();
    }
    public static void forEmployee(){
        Manager manager1 = new Manager("Hanna", "Nowak", 2014);
        System.out.println(manager1.toString());
        System.out.println("basic salary amount = " + manager1.getBasicSalary() + " zl.");
        System.out.println("employee works in the company = " + manager1.getYearOfWork() + " years");
        System.out.println("total monthly salary = " + manager1.calcMonthlySalary() + " zl.");
        System.out.println("The manager receives a monthly bonus in the amount of " + manager1.getBonusAmount() + " zl.");
        System.out.println("increase the bonus amount for the manager by 200 zl.");
        manager1.setBonusAmount(700.0);
        System.out.println("now the bonus amount = " + manager1.getBonusAmount() + " zl.");
        System.out.println("and now total monthly salary = " + manager1.calcMonthlySalary() + " zl.");

        TicketSeller ticketSeller1 = new TicketSeller("Maja", "Kowalska", 2020);
        System.out.println(ticketSeller1.toString());
        System.out.println("basic salary amount = " + ticketSeller1.getBasicSalary() + " zl.");
        System.out.println("employee works in the company = " + ticketSeller1.getYearOfWork() + " years");
        System.out.println("total monthly salary = " + ticketSeller1.calcMonthlySalary() + " zl.");
        System.out.println("The ticketSeller receives a monthly bonus in the amount of " + ticketSeller1.getBonusAmount() + " zl.");
        System.out.println("increase the bonus amount for the manager by 200 zl.");
        ticketSeller1.setBonusAmount(200.0);
        System.out.println("now the bonus amount = " + ticketSeller1.getBonusAmount() + " zl.");
        System.out.println("and now total monthly salary = " + ticketSeller1.calcMonthlySalary() + " zl.");
    }
}