public class UC4EmployeeWage {

    public static void main(String[] args) {

        int EMP_RATE_PER_HOUR = 20;

        int empCheck = (int)(Math.random() * 3);

        int empHours;

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

        int wage = empHours * EMP_RATE_PER_HOUR;

        System.out.println("Hours = " + empHours);
        System.out.println("Wage = " + wage);
    }
}