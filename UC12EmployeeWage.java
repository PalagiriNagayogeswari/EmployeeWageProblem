import java.util.ArrayList;

//created EmpWageBuilderList class where it creates ArrayList for CompanyEmpWageList class.
class EmpWageBuilderList{

    //created an ArrayList of CampanyEmpWageList class.
   ArrayList<CompanyEmpWageList> arr=new ArrayList<>();

    //created instances of CompanyEmpWage for each company.
    public EmpWageBuilderList() {
        arr.add(new CompanyEmpWageList("TCS", 20, 100, 40));
        arr.add(new CompanyEmpWageList("Infosys", 30, 120, 25));
        arr.add(new CompanyEmpWageList("Wipro", 40, 150, 30));
        arr.add(new CompanyEmpWageList("Deloitte", 50, 180, 35));
    }

    //called CalculateWages for each company.
    public void CalculateWages(){
        arr.get(0).computeEmpWage();
        arr.get(1).computeEmpWage();
        arr.get(2).computeEmpWage();
        arr.get(3).computeEmpWage();
    }

    //calculated displayWages for each campany to display the wages.
    public void displayWages(){
        arr.get(0).display();
        arr.get(1).display();
        arr.get(2).display();
        arr.get(3).display();
    }

}


//created CompanyEmpWageList class for handling the calculating the campany wages functionality.
class CompanyEmpWageList {

    //instance variables.
    private String company;
    private int ratePerHour;
    private int maxHours;
    private int maxDays;
    private int totalWage;

    //constructor
    public CompanyEmpWageList(String company, int ratePerHour,
                          int maxHours, int maxDays) {

        this.company = company;
        this.ratePerHour = ratePerHour;
        this.maxHours = maxHours;
        this.maxDays = maxDays;
    }

    //computeEmWage to calculate the wages
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


    //display function to display the wages.
    public void display() {
        System.out.println("Company : " + company);
        System.out.println("Total Wage : " + totalWage);
    }
}


//main class of UC12 use case.
public class UC12EmployeeWage {
    public static void main(String[] args){
        EmpWageBuilder e=new EmpWageBuilder();
        e.CalculateWages();
        e.displayWages();
    }
}
