package ast.expressions;

public class ConstExpr implements Expression{
	private int value ; 
	public ConstExpr(int value) {
		this.value = value;
	}
	
	public int getValue() {
		return value;
	}
	@Override
	public boolean equals(Object o ) {
		if(! (o instanceof Expression ))
			return false;
		Expression x = (Expression ) o; 
		
		return this.eval()== x.eval(); 
	}
	@Override
	public String toString() {
		return Integer.toString(this.value);
	}
	@Override
	public Type semantic() {
		return Type.INTEGER;
	}
	@Override
	public int eval() {
		return this.value;
	}

	

	@Override
	public void print() {
		System.out.println(this.toString());
	}
}