package sec05.exam;

public class start {

	public static void main(String[] args) {
		Person p1 = new Person("123-456","hong");		
		System.out.println(p1.nation);
		System.out.println(p1.ssn);

		//p1.nation = "USA"; // �����Ͽ��� // final�̱� ������

		System.out.println("������ ������: "+ Earth.EARTH_RADIUS + " KM");
		System.out.println("������ ǥ����: "+ Earth.EARTH_AREA + " KM^2");
				
	}

}
