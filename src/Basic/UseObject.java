package Basic;

public class UseObject {

	// object ; 
	
	public static void main(String[] args) {
		
		// ClassName objectName = new constructor of class();
		
		UseDataType dataType =new UseDataType();
		System.out.println(dataType.salary);
		dataType.salary= 4800.50;	
		
		UseAccessModifier uam = new UseAccessModifier();
		System.out.println(uam.mobileNumber);
		
		
	}
	
	
	
	
}
