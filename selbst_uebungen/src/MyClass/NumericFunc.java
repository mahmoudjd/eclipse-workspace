package MyClass;

public class NumericFunc <T extends Number>{
	
	T num ; 
	
	NumericFunc (T ob){
	
		this.num = ob ;
	
	}
	
	double square () {
		
		return num.intValue() * num.doubleValue() ;
		
	}
	
	boolean absequals(NumericFunc<?> ob) {
		if(Math.abs(num.doubleValue()) == Math.abs(ob.num.doubleValue()))
			return true ;
		
		return false ;
	}

}
