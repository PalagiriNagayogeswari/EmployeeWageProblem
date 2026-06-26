//created a EmployeeWageBuilder class for each campany and used instance variables instead of function parameters.

//EmployeeWageBuilder Class.
class EmployeeWageBuilder {

    //instance variables.
    private String company;
    private int ratePerHour;
    private int maxHours;
    private int maxDays;
    private int totalWage;

    //constructor.
    public EmployeeWageBuilder(String company, int ratePerHour,
                               int maxHours, int maxDays) {

        this.company = company;
        this.ratePerHour = ratePerHour;
        this.maxHours = maxHours;
        this.maxDays = maxDays;
    }

    //Non-static computeEmpWage method for calculating employee wage.
    public void computeEmpWage() {

        int totalHours = 0;
        int totalDays = 0;

        while (totalHours < maxHours && totalDays < maxDays) {

            totalDays++;

            int empCheck = (int)(Math.random() * 3);

            int empHours = 0;

            switch(empCheck) {

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
        }

        totalWage = totalHours * ratePerHour;
    }

    //display method
    public void display() {
        System.out.println("Company : " + company);
        System.out.println("Total Wage : " + totalWage);
    }
}

public class UC9EmployeeWage {

    public static void main(String[] args) {


        //creating instance of EmployeeWageBuilder class for each campany.

        EmployeeWageBuilder tcs =
                new EmployeeWageBuilder("TCS",20,200,30);

        EmployeeWageBuilder infosys =
                new EmployeeWageBuilder("Infosys",40,50,10);

        EmployeeWageBuilder wipro =
                new EmployeeWageBuilder("Wipro",50,100,40);

        EmployeeWageBuilder deloitte =
                new EmployeeWageBuilder("Deloitte",60,150,20);

        //calling computeWage method for each campany
        tcs.computeEmpWage();
        infosys.computeEmpWage();
        wipro.computeEmpWage();
        deloitte.computeEmpWage();

        //displaying wages of each campany.
        tcs.display();
        infosys.display();
        wipro.display();
        deloitte.display();
    }
}