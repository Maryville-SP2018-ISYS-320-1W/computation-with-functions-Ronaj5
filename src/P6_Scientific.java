/*
	ISYS 320
	Name(s): Rona Davis	
	Date: 4/3/18
*/

public class P6_Scientific {

	public static void main(String[] args) {
		double base = 6.5;
		int base10 = 10;
		double result = 0.0;
		result = computeScientificValue(base, base10);
		System.out.println(result);

	}

	private static double computeScientificValue(double base, int base10) {
		return (base*(Math.pow(base10, 3)));
	
	}

}
