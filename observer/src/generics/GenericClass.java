package generics;


public class GenericClass <T>{

	private T content;
	
	public T getContent() {
		return content;
	}
	
	public void setContent(T content) {
		this.content = content;
	}
	
	public static void main(String[] args) {
		GenericClass<String> stringContainer = new GenericClass<String>();
		
		stringContainer.setContent("Hallo");
		
		System.out.println("stringContainer: "+stringContainer.getContent());
		
		GenericClass<Integer> ints = new GenericClass<>();
		ints.setContent(5);
		
		System.out.println("intgerContainer: "+ ints.getContent());
		
	
	}
}
