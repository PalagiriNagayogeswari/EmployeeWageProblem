//created a method to get the Total Wage when queried by Company

import java.util.ArrayList;
import java.util.Scanner;

interface IEmpWageComBuilder {
    void calculateWages();
    void displayWages();
    int getTotalWageByCompany(String companyName);
}

class CompanyEmpWageDisplay {

    private String company;
    private int ratePerHour;
    private int maxHours;
    private int maxDays;
    private int totalWage;

    private ArrayList<Integer> dailyWages;

    public CompanyEmpWageDisplay(String company, int ratePerHour,
                          int maxHours, int maxDays) {

        this.company = company;
        this.ratePerHour = ratePerHour;
        this.maxHours = maxHours;
        this.maxDays = maxDays;
        this.dailyWages = new ArrayList<>();
    }

    public void computeEmpWage() {

        int totalHours = 0;
        int totalDays = 0;

        while (totalHours < maxHours && totalDays < maxDays) {

            totalDays++;

            int empCheck = (int)(Math.random() * 3);

            int empHours = 0;

            switch (empCheck) {

                case 1:
                    empHours = 8;
                    break;

                case 2:
                    empHours = 4;
                    break;

                default:
                    empHours = 0;
            }

            totalHours += empHours;

            int dailyWage = empHours * ratePerHour;
            dailyWages.add(dailyWage);
        }

        totalWage = totalHours * ratePerHour;
    }

    public String getCompany() {
        return company;
    }

    public int getTotalWage() {
        return totalWage;
    }

    public void display() {

        System.out.println("\nCompany : " + company);

        System.out.println("Daily Wages:");

        for (int i = 0; i < dailyWages.size(); i++) {
            System.out.println("Day " + (i + 1) + " : " + dailyWages.get(i));
        }

        System.out.println("Total Wage : " + totalWage);
    }
}

class EmpWageDisplayBuilder implements IEmpWageComBuilder {

    ArrayList<CompanyEmpWageDisplay> companies = new ArrayList<>();

    public EmpWageDisplayBuilder() {

        companies.add(new CompanyEmpWageDisplay("TCS",20,100,20));
        companies.add(new CompanyEmpWageDisplay("Infosys",30,120,25));
        companies.add(new CompanyEmpWageDisplay("Wipro",40,150,30));
        companies.add(new CompanyEmpWageDisplay("Deloitte",50,180,35));
    }

    @Override
    public void calculateWages() {

        for (CompanyEmpWageDisplay company : companies) {
            company.computeEmpWage();
        }
    }

    @Override
    public void displayWages() {

        for (CompanyEmpWageDisplay company : companies) {
            company.display();
        }
    }

    //Overridden method to get the total wage queired by the company
    @Override
    public int getTotalWageByCompany(String companyName) {

        for (CompanyEmpWageDisplay company : companies) {

            if (company.getCompany().equalsIgnoreCase(companyName)) {
                return company.getTotalWage();
            }
        }

        return -1;
    }
}

public class UC14EmployeeWage {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        IEmpWageComBuilder builder = new EmpWageDisplayBuilder();

        builder.calculateWages();

        builder.displayWages();

        System.out.print("\nEnter Company Name: ");
        String companyName = sc.nextLine();

        int wage = builder.getTotalWageByCompany(companyName);

        if (wage != -1) {
            System.out.println("Total Wage of " + companyName + " is : " + wage);
        } else {
            System.out.println("Company Not Found.");
        }

    }
}