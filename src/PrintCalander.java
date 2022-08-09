import java.util.Scanner;

public class PrintCalander {

	private final static int[] MAX_DAYS = { 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };
	private final static int[] LEAP_YEAR = { 31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };
	
	public static boolean leapYear(int year) {
		if(year % 4 ==0 && (year %100 !=0 || year %400 == 0))
		return true;
		else
		return false;
		}
	
	public static int getmaxDayOfMonth(int year,int month) {
		if(leapYear(year)) {
			return LEAP_YEAR[month-1];
		}else {
			return MAX_DAYS[month-1];
		}
	}

	public static void print(int year,int month) {
		int j = getmaxDayOfMonth(year,month);
		System.out.println(j);
		System.out.println(">");
		System.out.println(" 일  월   화   수   목   금  토");
		System.out.println("--------------------");
		if(MAX_DAYS[month] !=0) {
			for (int i = 1; i <= j; i++) {
				System.out.printf("%3d", i);
				if (i % 7 == 0)
					System.out.println();
			}
		}else {
			for (int i = 1; i <= j; i++) {
				System.out.printf("%3d", i);
				if (i % 7 == 0)
					System.out.println();

			}
		}
		
	}

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("년도를 입력하세요");
		int year = scan.nextInt();
		System.out.println("월을 입력하세요");
		int month = scan.nextInt();
		while (true) {
			if (month == -1) {
				System.out.println("bye~");
				break;
			} else {
				print(year,month);
				System.out.println();
				System.out.println("년도를 입력하세요");
				year = scan.nextInt();
				System.out.println("월을 입력하세요");
				month = scan.nextInt();
			}
		}
	}

}