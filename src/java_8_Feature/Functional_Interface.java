package java_8_Feature;

public interface Functional_Interface {
	
	  void singleAbstractMethod(); 
	 default void say() 
	 {
		 System.out.println("The main Method");
		 printName();
	 }
	  
		
		  private void printName() {
		  System.out.println("Functional inteface is running");
		  }
		 
}
