import java.util.Scanner;

class Ves {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		System.out.println(n % 10 + n / 10);
	}
}