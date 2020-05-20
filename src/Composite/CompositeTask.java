package Composite;

import java.util.HashSet;

public abstract class CompositeTask implements Task{

    protected HashSet<Task> listOfTasks = new HashSet<>();;

    @Override
    public Money costInEuros() {
        int amount=0;
        for (Task task : this.listOfTasks) {
            amount += task.costInEuros().getAmount();
        }
        return new Money(amount);
    }

    public void addSubTask(Task task){
        listOfTasks.add(task);
    }



}
