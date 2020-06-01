package Visitor;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class EvaluateTest {

    Expression exp;

    @BeforeEach
    public void setUp(){
        exp = new Sum(new Constant(2), new Mult(new Constant(4), new Constant(8)));
    }

    @Test
    public void evaluate(){
        Evaluator eval = new Evaluator();
        exp.accept(eval);
        assertEquals(34, eval.getEvaluation());
    }


}
