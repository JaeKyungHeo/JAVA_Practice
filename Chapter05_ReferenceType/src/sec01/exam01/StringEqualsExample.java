package sec01.exam01;

public class StringEqualsExample {

	public static void main(String[] args) {
		String str1 = "Ω≈πŒ√∂";
		String str2 = "Ω≈πŒ√∂";
		
		if(str1 == str2) {
			System.out.println("∞∞¿Ω");
		}else {
			System.out.println("¥Ÿ∏ß");
		}
		
		if(str1.equals(str2)) {
			System.out.println("∞∞¿Ω");
		}
		
		String str3 = new String("Ω≈πŒ√∂");
		String str4 = new String("Ω≈πŒ√∂");
		
		if(str3 == str4) {
			System.out.println("∞∞¿Ω");
		}else {
			System.out.println("¥Ÿ∏ß");
		}
		
		if(str3.equals(str4)) {
			System.out.println("∞∞¿Ω");
		}
		
	}

}
