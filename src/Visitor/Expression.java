package Visitor;

public interface Expression {
    void accept(ExpressionVisitor expr);
    int getValue();
}
