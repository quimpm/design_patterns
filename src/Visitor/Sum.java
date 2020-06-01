package Visitor;

public class Sum extends BinaryOperation{

    public Sum(Expression left, Expression right){
        super(left,right);
    }

    @Override
    public void accept(ExpressionVisitor expr) {
        expr.visit(this);
    }

}
