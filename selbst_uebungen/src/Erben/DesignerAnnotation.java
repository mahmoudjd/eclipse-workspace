package Erben;

public class DesignerAnnotation {

	private String name;
	public DesignerAnnotation(String name) {
		this.name= name ;
	}
	public String generateString(String oldname) {
		return "Special Design :" +name + "from  "+ oldname;
	}
}
