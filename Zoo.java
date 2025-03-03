import java.util.ArrayList;
/**
 * Write a description of class Zoo here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Zoo
{
     // while(intBlue_bird){
            // listArrayList<>;
            // Count"Blue"
        // }
    private ArrayList<Bird> zooBird;
    
    /**
     * Constructor for objects of class Zoo
     */
    public Zoo()
    {
        zooBird = new ArrayList<>();
        zooBird.add(new Bird("blue","blue jay",2));
        zooBird.add(new Bird("red","red cardinal",1));
        zooBird.add(new Bird("blue","red cardinal",1));
        zooBird.add(new Bird("red","red cardinal",1));
        zooBird.add(new Bird("blue","red cardinal",1));
        zooBird.add(new Bird("blue","red cardinal",1));
        zooBird.add(new Bird("blue","red cardinal",1));
        zooBird.add(new Bird("red","red cardinal",1));
        zooBird.add(new Bird("red","red cardinal",1));
    }

    int countBlueBirds(){
        int countBlueBirds = 0;
        for(Bird b : zooBird){
            if (b.color().equals("blue")){
                countBlueBirds++;
            }
            
        }
        return countBlueBirds;
    }   
}
