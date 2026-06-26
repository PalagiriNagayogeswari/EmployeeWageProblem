
//created EmpWageBuilder class where it creates array of objects for CompanyEmpWage class.
class EmpWageBuilder{
    CompanyEmpWage[] arr=new CompanyEmpWage[4];

    //created instances of CompanyEmpWage for each company.
    public EmpWageBuilder() {
        arr[0] = new CompanyEmpWage("TCS", 20, 100, 40);
        arr[1] = new CompanyEmpWage("Infosys", 30, 120, 25);
        arr[2] = new CompanyEmpWage("Wipro", 40, 150, 30);
        arr[3] = new CompanyEmpWage("Deloitte", 50, 180, 35);
    }

    //called CalculateWages for each company.
    public void CalculateWages(){
        arr[0].computeEmpWage();
        arr[1].computeEmpWage();
        arr[2].computeEmpWage();
        arr[3].computeEmpWage();
    }

    //calculated displayWages for each campany to display the wages.
    public void displayWages(){
        arr[0].display();
        arr[1].display();
        arr[2].display();
        arr[3].display();
    }

}


//created CompanyWage class for handling the calculating the campany wages functionality.
class CompanyEmpWage {

    //instance variables.
    private String company;
    private int ratePerHour;
    private int maxHours;
    private int maxDays;
    private int totalWage;

    //constructor
    public CompanyEmpWage(String company, int ratePerHour,
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


//main class of UC10 use case.
public class UC10EmployeeWage {
    public static void main(String[] args){
        EmpWageBuilder e=new EmpWageBuilder();
        e.CalculateWages();
        e.displayWages();
    }
}
