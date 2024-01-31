package ast.expressions;

public enum Operator {
	ADD("+"),SUB("-"),MUL("*"),DIV("/"),AND("&&"),OR("||"),NEG("~"),BNIG("!");
	String repr;
	Operator(String repr){
		this.repr= repr;
	}
	
	public String toString() {
		return this.repr;
	}
	
}