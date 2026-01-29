import java.util.*;

public class StepTracker{
    private int steps;
    private int minimumsteps;
    private int days;
    private int activedays;
    
    public StepTracker(int minimum){
        minimumsteps = minimum;
        steps = 0;
        days = 0;
        activedays = 0;
    }
    
    public void addDailySteps(int numsteps){
        steps = steps+numsteps;
        if(numsteps >= minimumsteps){
            activedays = activedays + 1;
        }
    }
    
    public int activeDays(){
        return activedays;
    }
    
    public double averageSteps(){
        return steps/days;
    }
    
    
}