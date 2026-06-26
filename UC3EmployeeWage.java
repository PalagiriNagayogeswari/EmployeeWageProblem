public class UC3EmployeeWage {

    public static void main(String[] args) {

        int EMP_RATE_PER_HOUR = 20;
        int FULL_TIME = 1;
        int PART_TIME = 2;

        int empCheck = (int)(Math.random() * 3);

        int empHours = 0;

        if(empCheck == FULL_TIME)
            empHours = 8;
        else if(empCheck == PART_TIME)
            empHours = 4;
        else
            empHours = 0;

        int wage = empHours * EMP_RATE_PER_HOUR;

        System.out.println("Employee Hours = " + empHours);
        System.out.println("Employee Wage = " + wage);
    }
}