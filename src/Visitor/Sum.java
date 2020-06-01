package Visitor;

public class Sum extends BinaryOperation{

    public Sum(Expression left, Expression right){
        super(left,right);
    }

    @Override
    public void accept(ExpressionVisitor expr) {
        expr.visit(this);
    }

    public int getValue(){
        return this.getRight().getValue() + this.getLeft().getValue();
    }

}
