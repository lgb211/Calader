import java.util.Scanner;

public class Calander {

	private final static int[] MAX_DAYS = { 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };

	public int getmaxDayOfMonth(int month) {
		return MAX_DAYS[month];
	}

	public void printSample() {
		System.out.println(" 일  월   화   수   목   금  토");
		System.out.println("--------------------");
		System.out.println(" 1  2  3  4  5  6  7");
		System.out.println(" 8  9 10 11 12 13 14");
		System.out.println("15 16 17 18 19 20 21");
		System.out.println("22 23 24 25 26 27 28");

	}

	public static void main(String[] args) {

		// 숫자를 입력받아 최대 일수를 출력하는 프로그램/

		Scanner scan = new Scanner(System.in);
		Calander ca = new Calander();

	//	System.out.println("반복횟수 입력");
	//	int j = scan.nextInt();

	/*	for (int i = 0; i < j; i++) {
			System.out.println("월을 입력하세요");
			int month = scan.nextInt();
			System.out.println(month+"월은" + ca.getmaxDayOfMonth(month - 1)+"까지 있습니다");
		}
*/
		
		while(true) {			
			System.out.println("월을 입력하세요");	
			int month = scan.nextInt();
			if(month == -1) {
				System.out.println("Have a nice day!");
				scan.close();
				return;
			}else {
				System.out.println(month+"월은" + ca.getmaxDayOfMonth(month - 1)+"까지 있습니다");
			}
				
		}
	}
}
