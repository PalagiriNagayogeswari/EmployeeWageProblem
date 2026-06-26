public class UC2EmployeeWage {

    public static void main(String[] args) {

        int EMP_RATE_PER_HOUR = 20;
        int FULL_DAY_HOURS = 8;

        int isPresent = (int)(Math.random() * 2);

        if(isPresent == 1) {
            int wage = EMP_RATE_PER_HOUR * FULL_DAY_HOURS;
            System.out.println("Daily Wage = " + wage);
        }
        else {
            System.out.println("Employee Absent");
        }
    }
}