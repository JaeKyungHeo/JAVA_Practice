package sec03.test;

public class start {

	public static void main(String[] args) {
		Car myCar = new Car();

		myCar.setSpeed(60);
		System.out.println("현재 속도: " + myCar.getSpeed());

		if(!myCar.isStop()) {
			myCar.setStop(true);
		}

		System.out.println("현재 속도: " + myCar.getSpeed());

	}

}
