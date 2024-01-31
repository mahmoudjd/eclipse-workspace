package ast.expressions;

public class AddExp extends BinaryExp {
	
	public AddExp(Expression l ,Expression r) {
		super(l,r,Operator.ADD);
	}
	@Override
	public int eval() {
		return this.l.eval() + this.r.eval();
	}

}
