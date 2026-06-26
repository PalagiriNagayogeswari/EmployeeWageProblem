import java.util.*;

class EmployeeWage {

    static int totalHours = 0;
    static int totalDays = 0;
    static final int RATE_PER_HOUR = 20;
    static final int MAX_HOURS = 100;
    static final int MAX_DAYS = 20;

    public static void computeEmpWage() {

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

        System.out.println("Total Days  : " + totalDays);
        System.out.println("Total Hours : " + totalHours);
        System.out.println("Employee Wage : " + empWage);
    }
}

public class UC7EmployeeWage {

    public static void main(String[] args) {
        EmployeeWage.computeEmpWage();
    }
}