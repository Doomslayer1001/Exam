
/**
 * Write a description of class AgeCalculator here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class AgeCalculator
{
    // year_of_birth = 2004;
        // age = currentYear - year_of_birth;
         // if(age>=16){
         // System.out.println("able to drive");
         
        // }
        // else{ 
            // //16-age = missing_year;
            // System.out.println("not eligible to drive"+ missing_year);
        // }
    private int currentYear=2025;

    /**
     * Constructor for objects of class AgeCalculator
     */
    public int getAge(int year_of_birth)
    {
        int age = currentYear - year_of_birth;
        if(age>=16){
        System.out.println("able to drive");
         
        }
        else{ 
            int missing_year = 16-age;
            System.out.println("not eligible to drive missing" + missing_year + "year left");
        }
        return age;
    }
}
