package Visitor;

public class Evaluator implements ExpressionVisitor{

    int evaluation;

    @Override
    public void visit(Constant con) {
        this.evaluation = con.getValue();
    }

    @Override
    public void visit(BinaryOperation exp) {
        exp.getLeft().accept(this);
        int leftResult = evaluation;
        exp.getRight().accept(this);
        int rightResult = evaluation;
        if(exp instanceof Sum){
            evaluation = leftResult + rightResult;
        } else {
            evaluation = leftResult * rightResult;
        }
    }

    public int getEvaluation() {
        return evaluation;
    }
}
