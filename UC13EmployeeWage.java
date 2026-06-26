//Calculated daily wages along with total wages also.

import java.util.ArrayList;

interface IEmpDailyWageBuilder {
    void calculateWages();
    void displayWages();
}

class CompanyDailyEmpWage {

    private String company;
    private int ratePerHour;
    private int maxHours;
    private int maxDays;
    private int totalWage;

    //created Arraylist for storing the dailwages.
    private ArrayList<Integer> dailyWages;

    public CompanyDailyEmpWage(String company, int ratePerHour,
                          int maxHours, int maxDays) {

        this.company = company;
        this.ratePerHour = ratePerHour;
        this.maxHours = maxHours;
        this.maxDays = maxDays;
        this.dailyWages = new ArrayList<>();
    }

    //Calculating total wage and also the daily wages.
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

            //calculating daily wage.
            int dailyWage = empHours * ratePerHour;
            dailyWages.add(dailyWage);
        }

        totalWage = totalHours * ratePerHour;
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

class EmpDailyWageBuilder implements IEmpDailyWageBuilder {

    ArrayList<CompanyDailyEmpWage> companies = new ArrayList<>();

    public EmpDailyWageBuilder() {

        companies.add(new CompanyDailyEmpWage("TCS", 20, 100, 20));
        companies.add(new CompanyDailyEmpWage("Infosys", 30, 120, 25));
        companies.add(new CompanyDailyEmpWage("Wipro", 40, 150, 30));
        companies.add(new CompanyDailyEmpWage("Deloitte", 50, 180, 35));
    }

    @Override
    public void calculateWages() {

        for (CompanyDailyEmpWage company : companies) {
            company.computeEmpWage();
        }
    }

    @Override
    public void displayWages() {

        for (CompanyDailyEmpWage company : companies) {
            company.display();
        }
    }
}

public class UC13EmployeeWage {

    public static void main(String[] args) {

        IEmpDailyWageBuilder builder = new EmpDailyWageBuilder();

        builder.calculateWages();

        builder.displayWages();
    }
}