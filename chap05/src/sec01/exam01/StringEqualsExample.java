package sec01.exam01;

public class StringEqualsExample {

	public static void main(String[] args) {
		String str1 = "�Ź�ö";
		String str2 = "�Ź�ö";
		
		if(str1 == str2) {
			System.out.println("����");
		}else {
			System.out.println("�ٸ�");
		}
		
		if(str1.equals(str2)) {
			System.out.println("����");
		}
		
		String str3 = new String("�Ź�ö");
		String str4 = new String("�Ź�ö");
		
		if(str3 == str4) {
			System.out.println("����");
		}else {
			System.out.println("�ٸ�");
		}
		
		if(str3.equals(str4)) {
			System.out.println("����");
		}
		
	}

}
