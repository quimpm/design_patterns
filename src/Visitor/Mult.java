package Visitor;

public class Mult extends BinaryOperation{

    public Mult(Expression left, Expression right){
        super(left,right);
    }

    @Override
    public void accept(ExpressionVisitor expr) {
        expr.visit(this);
    }

    public int getValue(){
        return this.getRight().getValue() * this.getLeft().getValue();
    }

}
