package Composite;

public class SerialCompositeTask extends CompositeTask{

    public int durationInDays() {
        int amount = 0;
        for(Task task : this.listOfTasks){
            amount += task.durationInDays();
        }
        return amount;
    }

}
