import java.util.Scanner;

public class ScannerUsage {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Number 1");
		int x = in.nextInt();
		System.out.println("Number 2");
		int y = in.nextInt();
		int z = x + y;
		System.out.println("Answer: " + z);
		in.close();
	}
}
