package Visitor;

public class Mult extends BinaryOperation{

    public Mult(Expression left, Expression right){
        super(left,right);
    }

    @Override
    public void accept(ExpressionVisitor expr) {
        expr.visit(this);
    }

}
