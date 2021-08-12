package sec03.test;

public class Car {
	// 특별한 조건이 없다면 모든 필드는 private으로 선언하여 무결성 보존
		// 초기값은 자동으로 int 0, boolean false로 초기화
		private int speed;
		private boolean stop;
		
		// speed의 값을 가져다 쓸 수 있도록 public 메소드 선언
		public int getSpeed() {
			int km = speed * 3;
			return km;
		}
		
		// speed를 수정할 수 잇도록 public 메소드 선언
		public void setSpeed(int speed) {
			// 유효한 값만 필드로 저장할 수 있도록 조건 설정
			if (speed <0) {
				this.speed =0;
				return;
			} else {
				this.speed = speed;
			}
		}
		
		// boolean Getter은 is로 시작
		public boolean isStop() {
			return stop;
		}
		
		public void setStop(boolean stop) {
			this.stop = stop;
			if(stop) {
				speed =0;
			}
		}
}
