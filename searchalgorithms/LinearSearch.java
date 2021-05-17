package dev.carbajal.searchalgorithms;

public class LinearSearch {
	
	public static void main (String[] args) {
		
		// dummy data
		
		char[] letters = { 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r','s', 't', 'u', 'v', 'w', 'x', 'y', 'z' };
		
		char letter = 'm';
		
		// method calls
		
		LinearSearch ls = new LinearSearch();
		
		System.out.println(ls.findIndex(letter, letters));
		
	}
	
	// methods
	
	public int findIndex(char target, char[] data) {
		
		if (data == null) {
			
			return -1;
			
		}
		
		int result = -1;
		
		// loop through the data
		
		for (int i = 0; i < data.length; i++) {
			
			char temp = data[i];
			
			// test current element against target
			
			if (temp == target) {
				
				return i;
				
			}
			
		}
		
		return result;
		
	}

}
