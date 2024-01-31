package ast.expressions;

public abstract class BinaryExp implements Expression {
	Expression l, r;
	Operator op;
	 BinaryExp(Expression l,Expression r, Operator op ) {
		this.l = l; 
		this.r = r;
		this.op = op ;
	
	}
	@Override
	public Type semantic() {
		if(r.semantic()!= Type.INTEGER|| r.semantic()!= Type.INTEGER)
		    return null;
		return Type.INTEGER;
	}
	@Override
	public void print() {
		System.out.println(this.toString());
		
	}
	@Override
	public String toString() {
		return "("+l.toString()+" "+op.toString()+" "+ r.toString()+")";
	}

}
