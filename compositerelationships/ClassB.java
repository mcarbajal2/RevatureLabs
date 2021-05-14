package dev.carbajal.compositerelationships;

public class ClassB {
	
	ClassA classA = new ClassA();
	
	public static void main(String[] args) {
		
		ClassB classB = new ClassB();
		
		classB.classA.setName("Taylor");
		
		System.out.println(classB.classA.getName());
		
	}

}
