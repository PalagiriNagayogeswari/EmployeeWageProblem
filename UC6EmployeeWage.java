public class UC6EmployeeWage {

    public static void main(String[] args) {

        int EMP_RATE_PER_HOUR = 20;
        int totalHours = 0;
        int totalDays = 0;

        while(totalHours <= 100 && totalDays < 20) {

            totalDays++;

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

            totalHours += empHours;
        }

        int totalWage = totalHours * EMP_RATE_PER_HOUR;

        System.out.println("Total Days = " + totalDays);
        System.out.println("Total Hours = " + totalHours);
        System.out.println("Total Wage = " + totalWage);
    }
}