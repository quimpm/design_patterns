package Composite;

public class SimpleTask implements Task{

    Money cost;
    int duration;

    public SimpleTask(Money cost, int duration){
        this.cost=cost;
        this.duration=duration;
    }

    @Override
    public Money costInEuros() {
        return cost;
    }

    @Override
    public int durationInDays() {
        return duration;
    }
}
