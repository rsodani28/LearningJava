import java.util.Scanner;

public class WhoAreYou {

	public static void main(String[] args) {
		Scanner stringScanner = new Scanner(System.in);
		System.out.println("Name:");
		String N = "";
		N += stringScanner.nextLine();
		System.out.println("Age:");
		String A = stringScanner.next();
		System.out.println("City you live in:");
		String Ad = stringScanner.next();
		System.out.println("Phone Number:");
		String P = stringScanner.next();
		System.out.println("Employer you work for:");
		String J = stringScanner.next();
		System.out.println("Your name is " + N + " and you are " + A + " years old. You live in " + Ad
				+ " you are reachable at " + P + ", and you work for " + J + ".");
		stringScanner.close();
	}

}
