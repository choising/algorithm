package test;

public class RegularExpTest {
	public static void main(String[] args) {
		String inpStr = "1S2D*3T";
		String[] digits = inpStr.split("[0-9]+");
		String[] nonDigits = inpStr.split("\\D+");
		
		for(int i = 0; i < digits.length; i++) {
			System.out.println(digits[i]);
		}
		
//		for(int i = 0; i < nonDigits.length; i++) {
//			System.out.println(nonDigits[i]);
//		}
		
		
	}

}
