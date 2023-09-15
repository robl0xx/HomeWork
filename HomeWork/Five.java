import java.util.Scanner;

class Prog {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		boolean fiveIn = false;
		while(true) {
			int num = scanner.nextInt();
			if (num == 0) {
				break;
			}
			else if (num == 5) {
				fiveIn = true;
			}
		}
		if (fiveIn) {
			System.out.println("YES");
		}
		else {
			System.out.println("NO");
		}

	}
}