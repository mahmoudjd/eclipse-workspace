package ast.expressions;

public class AndExp extends BooleanExp{
	
	public AndExp(Expression l,Expression r) {
		super(l,r,Operator.AND);
	}

	@Override
	public int eval() {
		
		return this.l.eval() != 0 && this.r.eval() != 0 ?1 : 0;
	}
	
}
