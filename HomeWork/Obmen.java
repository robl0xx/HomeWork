import java.util.Scanner;

public class Obmen {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
			int first = scanner.nextInt();
			int second = scanner.nextInt();
			String firstHead = "" + first / 10;
			String secondHead = "" + second / 10;
			String firstTail = "" + first % 10;
			String secondTail = "" + second % 10;
			System.out.println(firstHead + secondTail);
			System.out.println(secondHead + firstTail);
	}
}