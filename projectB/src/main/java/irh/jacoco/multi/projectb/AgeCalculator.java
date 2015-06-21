package irh.jacoco.multi.projectb;

import irh.jacoco.multi.projecta.MathOperations;

public class AgeCalculator {

	public int sum(int a, int b) {
		
		if(a < 0 || b < 0) {
			throw new IllegalArgumentException("Age cannot be negative.");
		}

		int result = MathOperations.add(a, b);
		
		
		return result;
		
	}
	
}
