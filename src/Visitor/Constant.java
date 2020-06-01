package Visitor;

public class Constant implements Expression{

    private int value;

    public Constant(int value){
        this.value=value;
    }

    public int getValue() {
        return value;
    }

    @Override
    public void accept(ExpressionVisitor expr) {
        expr.visit(this);
    }
}
