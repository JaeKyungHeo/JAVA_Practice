package sec05.exam;

public class start {

	public static void main(String[] args) {
		Person p1 = new Person("123-456","hong");		
		System.out.println(p1.nation);
		System.out.println(p1.ssn);

		//p1.nation = "USA"; // 컴파일에러 // final이기 때문에

		System.out.println("지구의 반지름: "+ Earth.EARTH_RADIUS + " KM");
		System.out.println("지구의 표면적: "+ Earth.EARTH_AREA + " KM^2");
				
	}

}
