import java.util.Scanner;

public class Pypy {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Начало");
		int num = scanner.nextInt();
		int i = 0;
		for (i = - num + 1; i != num; i++) {
			System.out.print(i + " ");
		}
		System.out.println("");
		System.out.println("Завершено");	
	} 
}