package Visitor;

public interface ExpressionVisitor {
    void visit(Constant con);
    void visit(BinaryOperation exp);
}
