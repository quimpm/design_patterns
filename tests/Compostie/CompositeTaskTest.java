package Compostie;

import Composite.CompositeTask;
import Composite.Money;
import Composite.SimpleTask;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CompositeTaskTest {

    CompositeTask rootTask;
    CompositeTask emptyTask;

    @BeforeEach
    public void setUp(){
        rootTask = new CompositeTask();
        rootTask.addSubTask(new SimpleTask(new Money(10), 20));
        CompositeTask compTask2 = new CompositeTask();
        rootTask.addSubTask(compTask2);
        compTask2.addSubTask(new SimpleTask(new Money(5), 60));
        compTask2.addSubTask(new SimpleTask(new Money(15), 30));
        emptyTask = new CompositeTask();
    }

    @Test
    public void costInEurosTest(){
        assertEquals(new Money(30), rootTask.costInEuros());
    }

    @Test
    public void durationInDaysTest(){
        assertEquals(110, rootTask.durationInDays());
    }

    @Test
    public void noTasksTest(){
        assertEquals(new Money(0), emptyTask.costInEuros());
        assertEquals(0, emptyTask.durationInDays());
    }

}
