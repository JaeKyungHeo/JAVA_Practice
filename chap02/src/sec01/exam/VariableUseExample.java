package sec01.exam;

public class VariableUseExample {

	public static void main(String[] args) {
		int hour = 3;
		int minute = 5;
		System.out.println(hour + "½Ã°£" + minute + "ºÐ");
		
		int totalMinute = (hour*60) + minute;
		System.out.println("ÃÑ " + totalMinute + "ºÐ");
		
		
		int x = 3;
		int y = 5;
		System.out.println("x:" + x + ", y:" + y);
		
		int temp = x;
		x = y;
		y = temp;
		System.out.println("x:" + x + ", y:" + y);
		

	}

}
