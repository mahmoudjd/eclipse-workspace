package Lambda;
interface A {
	
	
//	public void show() ;

	public void show_2(int i);
}

public class LambdaDemo {

	public static void main(String[] args) {
		
//		A obj ; 
//		
//		obj = () -> System.out.println("Hello_2") ; 
//		
		
		A obj = new A () {
//			
//			public void show(){
//				System.out.println("Hello_1");
//			}

			@Override
			public void show_2(int i) {
				
				System.out.println("Hello Welt "+ i);
			}
			
		};
		
		obj.show_2(5);
		
//		obj.show();
		
		A obj2 =(int ii) -> System.out.println("Hallo Welt "+ ii); 
		
		obj2.show_2(15);
	
	}

}
