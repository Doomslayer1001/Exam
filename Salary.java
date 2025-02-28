
/**
 * Write a description of class Salary here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Salary
{
    // Question 14
    //hourly_wage * hours = salary;
    //    int taxe = 30%
    //    salary * taxe = taxe_deduction;
    //    salary-taxe_deduction = total_taxe;
    //   System.out.println("Total salary is" + total_salary);
    /**
     * Question 14(Correction)
     */
    public double getnetpay(int hours,int hourly_wage)
    {
        int salary = hourly_wage * hours;
        double taxe = 0.3;
        double taxe_deduction = salary * taxe;
        double total_salary = salary - taxe_deduction;
        System.out.println("Total salary is" + total_salary);
        return total_salary;
    }
}
