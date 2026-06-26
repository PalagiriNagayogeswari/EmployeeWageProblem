public class UC5EmployeeWage {

    public static void main(String[] args) {

        int EMP_RATE_PER_HOUR = 20;
        int totalWage = 0;

        for(int day = 1; day <= 20; day++) {

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

            totalWage += empHours * EMP_RATE_PER_HOUR;
        }

        System.out.println("Monthly Wage = " + totalWage);
    }
}