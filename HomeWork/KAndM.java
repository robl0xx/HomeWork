import java.util.Scanner;

class Programm {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int firstNum = scanner.nextInt();
        int secondNum = scanner.nextInt();
        int i = 0;
        for (i = firstNum; i <= secondNum; i++) {
            if (i % 3 == 0) {
                System.out.print(i);
            }
        }
    }
}