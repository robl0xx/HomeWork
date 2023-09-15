public class Last {
	public static void main(String[] args) {
		int i = 0;
		for (i = 100; i != 1000; i ++) {
			if (((i / 100) % 2 == 0) && (((i / 10) % 10 ) % 2 == 0) && ((i % 10) % 2 == 0)) {
				System.out.print(i + " ");
			}
		}
	}
}