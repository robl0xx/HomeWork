import java.util.Scanner;

public class Styl {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Ввведите число стульев: ");
		int sty = scanner.nextInt();
		System.out.print("Ввведите число учеников: ");
		int ych = scanner.nextInt();
		if (sty > ych) {
			System.out.print("Лишних стульев: " + (sty - ych));
		}
		else if (ych > sty) {
			System.out.print("Нехватает стульев: " + (ych - sty));
		}
		else {
			System.out.print("Количество стульев и учеников совпадает!");
		}
	}
}
