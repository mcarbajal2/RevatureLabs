package dev.carbajal.recursion;

public class ExampleOne {
	
	public static void main(String[] args) {
		
		// dummy data for our method
		
		int input = 3;
		
		ExampleOne eo = new ExampleOne();
		
		// calling methods
		
		System.out.println(eo.factorial(input));
		
	}
	
	// method creation
	
	public int factorial(int num) {
		
		if (num <= 0) {
			
			return 0;
			
		}
		
		if (num == 1) {
			
			return 1;
			
		}
		
		return num * factorial(num - 1);
		
	}

}
