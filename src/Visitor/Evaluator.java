package Visitor;

public class Evaluator implements ExpressionVisitor{

    int evaluation;

    @Override
    public void visit(Constant con) {
        this.evaluation = con.getValue();
    }

    @Override
    public void visit(BinaryOperation exp) {
        this.evaluation = exp.getValue();
    }

    public int getEvaluation() {
        return evaluation;
    }
}
