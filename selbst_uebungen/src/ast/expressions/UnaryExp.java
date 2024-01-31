package ast.expressions;

public abstract class UnaryExp implements Expression  {
	Expression x;
	Operator op ;
	UnaryExp(Expression x, Operator op ){
		this.x= x;
		this.op= op ;
	}
	
	
	public boolean equals (Object o) {
		if(!(o instanceof Expression ))
			return false;
		Expression ex = (Expression) o; 
		return this.eval()== ex.eval();
	}
	
	@Override
	public void print() {
		System.out.println(this.toString());
	}
	
	@Override
	public String toString() {
		return "("+op.toString()+x.toString()+")";
	}
}
