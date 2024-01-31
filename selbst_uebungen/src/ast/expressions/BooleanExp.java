package ast.expressions;

public abstract class BooleanExp extends BinaryExp{
	Expression l,r;
	Operator op;
	
	BooleanExp(Expression l, Expression r ,Operator op){
		super(l,r,op);
	}
	@Override
	public boolean equals(Object o) {
		if(!(o instanceof BooleanExp))
			return false;
		
		BooleanExp bo = (BooleanExp) o;
		
		return this.l.equals(bo.l)&& this.r.equals(bo.r) && this.op == bo .op;
	}
	@Override
	public Type semantic() {
		if(l.semantic() == null || r.semantic()== null)
			return null;
		return Type.BOOLEAN;
	}
}
