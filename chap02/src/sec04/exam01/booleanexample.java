package sec04.exam01;

public class booleanexample {

	public static void main(String[] args) throws Exception {
		int keyCode = System.in.read();
		System.out.println(keyCode);
		int a;
		a = System.in.read();
		System.out.println(a);
		while(true) {
			a=System.in.read();
			System.out.println(a);
			if(a=='q')
				break;
		}
	}

}
