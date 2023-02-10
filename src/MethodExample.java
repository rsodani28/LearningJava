
public class MethodExample {
	public static void main(String[] args) {
		int result = squareNumber(5);
		System.out.println("The result is: " + result);
	}

	public static int squareNumber(int number) {
		int result = number * number;
		return result;
	}

}
