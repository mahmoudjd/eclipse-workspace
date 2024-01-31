package Recktangle;

public class reckt {
 private  int length ;
 private  int width  ;
 
public reckt() {
	length= 10;
	width = 15;
	//System.out.println("a new room created with 10 * 15");
}
public reckt(int l, int w) {
	length = l;
	width = w;
	
}
public void modify(reckt R) {
	 R.length = 67;
	 R.width = 98;
 }
public reckt  Add ( reckt room2) {
	reckt res= new reckt ();
	res.length = this.length + room2.length ;
	res.width = this.width + room2.width ;
	
	return res;
}
 
 public  void set_len(int l) {
	 length = l;
 }
  
 public  void set_wid(int w) {
	 width = w;
 }
 
 public int get_len () {
	 return length ;	 
 }
 public int get_wid() {
	 return width ;
	 
 }
 
 public int get_area () {
	 return length * width ;
 }
 public boolean isEqual( reckt r2) {
	 if (this.length == r2.length &&this.width == r2.width )
		 return true;
	 else
         return false;	 
 }
 
}
