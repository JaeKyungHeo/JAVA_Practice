package sec03.exam02;

public class StringContcatExample {

	public static void main(String[] args) {
		//String -> byte
		String str = "10";
		byte value = Byte.parseByte(str);

		//String -> short
		short value1 = Short.parseShort(str);

		//String -> int
		int value2 = Integer.parseInt(str);

		//String -> long
		long value3 = Long.parseLong(str);

		//String -> float
		float value4 = Float.parseFloat(str);

		//String -> double
		double value5 = Double.parseDouble(str);

		//String -> boolean
		boolean value6 = Boolean.parseBoolean(str);

	}

}
