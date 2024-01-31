package ast.expressions;

public interface Expression {
	int eval();
	Type semantic();
	void print();
}