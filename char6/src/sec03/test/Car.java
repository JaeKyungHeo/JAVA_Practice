package sec03.test;

public class Car {
	// Ư���� ������ ���ٸ� ��� �ʵ�� private���� �����Ͽ� ���Ἲ ����
		// �ʱⰪ�� �ڵ����� int 0, boolean false�� �ʱ�ȭ
		private int speed;
		private boolean stop;
		
		// speed�� ���� ������ �� �� �ֵ��� public �޼ҵ� ����
		public int getSpeed() {
			int km = speed * 3;
			return km;
		}
		
		// speed�� ������ �� �յ��� public �޼ҵ� ����
		public void setSpeed(int speed) {
			// ��ȿ�� ���� �ʵ�� ������ �� �ֵ��� ���� ����
			if (speed <0) {
				this.speed =0;
				return;
			} else {
				this.speed = speed;
			}
		}
		
		// boolean Getter�� is�� ����
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
