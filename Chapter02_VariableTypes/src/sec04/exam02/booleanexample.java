package sec04.exam02;

import java.util.Scanner;

public class booleanexample {

	public static void main(String[] args) {
		Scanner line = new Scanner(System.in);		
		String a = line.nextLine();
		if(a.equals("hello"))
			System.out.printf("%s", a);
		else
			System.out.printf("%s", "no");
				
	}

}