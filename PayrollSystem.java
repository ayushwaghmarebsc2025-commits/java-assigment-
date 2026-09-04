public class PayrollSystem {
    public static void main(String[] args) {

        // ---- Just edit these values and run the program ----
        String name = "Akshita";
        double monthlySalary = 80000;
        boolean isHandicapped = false;      // true = Yes, false = No
        double hoursWorked = 40;            // hours worked THIS WEEK
        int workingDays = 22;               // working days in that month (Mon-Fri only)

        // ---- Basic values ----
        double hoursPerDay = 8;
        double totalMonthlyHours = workingDays * hoursPerDay;
        double hourlyWage = monthlySalary / totalMonthlyHours;

        double standardWeeklyHours = 40;

        double regularPay = 0;
        double overtimePay = 0;
        double bonus = 0;

        // ---- Apply payroll rules ----
        if (hoursWorked > standardWeeklyHours) {
            // worked more than 40 hours -> overtime applies
            double overtimeHours = hoursWorked - standardWeeklyHours;

            regularPay = standardWeeklyHours * hourlyWage;
            overtimePay = overtimeHours * hourlyWage * 1.5;

            // handicapped employee crossing 50 hours gets 10% extra on overtime pay
            if (isHandicapped && hoursWorked > 50) {
                bonus = overtimePay * 0.10;
            }

        } else if (hoursWorked == standardWeeklyHours) {
            // worked exactly 40 hours -> fixed pay, no overtime
            regularPay = standardWeeklyHours * hourlyWage;

        } else {
            // worked less than 40 hours -> pay only for hours worked
            regularPay = hoursWorked * hourlyWage;
        }

        double totalPay = regularPay + overtimePay + bonus;

        // ---- Print result ----
        System.out.println();
        System.out.println("----- Payroll Slip -----");
        System.out.println("Employee Name        : " + name);
        System.out.println("Working Days in Month : " + workingDays);
        System.out.println("Hourly Wage           : Rs. " + hourlyWage);
        System.out.println("Hours Worked          : " + hoursWorked);
        System.out.println("Handicapped           : " + (isHandicapped ? "Yes" : "No"));
        System.out.println("Regular Pay           : Rs. " + regularPay);
        System.out.println("Overtime Pay          : Rs. " + overtimePay);
        System.out.println("Handicapped Bonus     : Rs. " + bonus);
        System.out.println("Total Weekly Payment  : Rs. " + totalPay);
    }
}
