import java.util.*;

class EmployeeTotalWage {

    //static int totalHours = 0;
    //static int totalDays = 0;
    //static final int RATE_PER_HOUR = 20;
    //static final int MAX_HOURS = 100;
    //static final int MAX_DAYS = 20;

    //static method of computing Employee Wage.
    public static void computeEmpWage(int campany) {

        switch (campany) {
            case 1:
                //For TCS rate_per_hour=30,max_hours=200,max_days=30;
                computeCompanyWage("TCS",20, 200, 30);
                break;
            case 2:
                //For Infosys rate_per_hour=40,max_hours=50,max_days=10;
                computeCompanyWage("Infosys",40, 50, 10);
                break;
            case 3:
                //For Wipro rate_per_hour=50,max_hours=100,max_days=40;
                computeCompanyWage("Wipro",50, 100, 40);
                break;
            case 4:
                //For Deloitte rate_per_hour=60,max_hours=150,max_days=20;
                computeCompanyWage("Deloitte",60, 150, 20);
                break;
        }
    }


    //static method of calculating Employee wage of each campany seperately based on parameters
    public static void computeCompanyWage(String company,int RATE_PER_HOUR,int MAX_HOURS,int MAX_DAYS){
       int  totalDays=0;
       int totalHours=0;

        while (totalHours < MAX_HOURS && totalDays < MAX_DAYS) {

            totalDays++;

            int empCheck = (int) (Math.random() * 3);

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
        }

        int empWage = totalHours * RATE_PER_HOUR;
        System.out.println("Company  : " + company);
        System.out.println("Total Days  : " + totalDays);
        System.out.println("Total Hours : " + totalHours);
        System.out.println("Employee Wage : " + empWage);
    }
}


//main UC8 class file
public class UC8EmployeeWage {

    public static void main(String[] args) {
        int ch;
        Scanner sc=new Scanner(System.in);
        //Giving options to the user to select the compay
        do{
            System.out.println("\n===== Select Your Campany =====");
            System.out.println("1. TCS");
            System.out.println("2. Infosys");
            System.out.println("3. Wipro");
            System.out.println("4. Deloitte");
            System.out.println("5. Exit");

            System.out.println("Enter your choice : ");
            ch = sc.nextInt();

            switch (ch) {
                case 1:
                case 2:
                case 3:
                case 4:
                    EmployeeTotalWage.computeEmpWage(ch);
                    break;
                case 5:
                    System.out.println("Thank you. Have a nice day");
                    break;

                default:
                    System.out.println("Invalid choice");
            }
        }while (ch!=5);

    }
}