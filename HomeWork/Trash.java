import java.util.Scanner;

public class Trash {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		int i = 0;
		for (i = 10; i != 100; i++) {
			if ((i % 10) + (i / 10) == n ) {
				System.out.println(i);
			}
		}
	}
}