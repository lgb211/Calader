import java.util.Scanner;

public class PrintCalander {

	private final static int[] MAX_DAYS = { 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };

	public int getmaxDayOfMonth(int month) {
		return MAX_DAYS[month];
	}

	public static void print(int month) {

		System.out.println(">");

		System.out.println(" 일  월   화   수   목   금  토");
		System.out.println("--------------------");
		for (int i = 1; i <= MAX_DAYS[month - 1]; i++) {
			System.out.printf("%3d", i);
			if (i % 7 == 0)
				System.out.println();

		}
	}

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("월을 입력하세요");
		int month = scan.nextInt();
		while (true) {
			if (month == -1) {
				System.out.println("bye~");
				break;
			} else {
				print(month);
				System.out.println();
				System.out.println("월을 입력하세요");
				month = scan.nextInt();
			}
		}
	}

}
