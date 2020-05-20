package Composite;

import java.util.HashSet;

public class ParallelCompositeTask extends CompositeTask{

    public int durationInDays() {
        int currentAmount = 0;
        for(Task task : this.listOfTasks){
            if (task.durationInDays() > currentAmount){
                currentAmount = task.durationInDays();
            }
        }
        return currentAmount;
    }


}
