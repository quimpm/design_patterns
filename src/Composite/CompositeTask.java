package Composite;

import java.util.HashSet;

public class CompositeTask implements Task{

    private HashSet<Task> listOfTasks;

    public CompositeTask(Money cost, int duration){
        listOfTasks = new HashSet<>();
    }

    @Override
    public Money costInEuros() {
        int amount=0;
        for(Task task : this.listOfTasks){
            amount = task.costInEuros().getAmount();
        }
        return new Money(amount);
    }

    @Override
    public int durationInDays() {
        int amount = 0;
        for(Task task : this.listOfTasks){
            amount = task.durationInDays();
        }
        return amount;
    }

    public void addSubTask(Task task){
        listOfTasks.add(task);
    }

}
