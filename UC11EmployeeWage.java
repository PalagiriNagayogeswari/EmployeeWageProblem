
//followed an interface approach to do the EmployeeWage Problem.
interface IEmpWageBuilder {

    void calculateWages();

    void displayWages();
}

//implementing the interface
class EmplWageBuilder implements IEmpWageBuilder {

    //created array of objects for CompanyTotalEmpWage class
    CompanyTotalEmpWage[] arr = new CompanyTotalEmpWage[4];

    //creating reference for each company.
    public EmplWageBuilder() {
        arr[0] = new CompanyTotalEmpWage("TCS",20,100,40);
        arr[1] = new CompanyTotalEmpWage("Infosys",30,120,25);
        arr[2] = new CompanyTotalEmpWage("Wipro",40,150,30);
        arr[3] = new CompanyTotalEmpWage("Deloitte",50,180,35);
    }

    //overriding and implementing the method calculateWages.
    @Override
    public void calculateWages() {

        for(CompanyTotalEmpWage company : arr){
            company.computeEmpWage();
        }
    }

    //overriding and implementing the method displayWages.
    @Override
    public void displayWages() {

        for(CompanyTotalEmpWage company : arr){
            company.display();
        }
    }
}

//class handing the calculating wages for each company.
class CompanyTotalEmpWage {

    //instance variables.
    private String company;
    private int ratePerHour;
    private int maxHours;
    private int maxDays;
    private int totalWage;


    //constructor.
    public CompanyTotalEmpWage(String company,int ratePerHour,
                          int maxHours,int maxDays){

        this.company = company;
        this.ratePerHour = ratePerHour;
        this.maxHours = maxHours;
        this.maxDays = maxDays;
    }

    //computing wage method to calculate wage for each company.
    public void computeEmpWage(){

        int totalHours = 0;
        int totalDays = 0;

        while(totalHours < maxHours && totalDays < maxDays){

            totalDays++;

            int empCheck = (int)(Math.random()*3);

            int empHours = 0;

            switch(empCheck){

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
    public void display(){

        System.out.println("Company : " + company);
        System.out.println("Total Wage : " + totalWage);
    }
}

//main class of UC11 use case.
public class UC11EmployeeWage {

    public static void main(String[] args){

        //creating object for EmpWageBuilder with the reference of interface.
        IEmpWageBuilder builder = new EmplWageBuilder();

        //calling the methods.
        builder.calculateWages();
        builder.displayWages();
    }
}