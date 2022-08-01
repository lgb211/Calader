import java.util.Scanner;

public class Sum {
	public static void main(String[] args) {
		// 키보드 두 수의 입력
		// 화면에 두수의 합 출력
		Scanner scan = new Scanner(System.in);//키보드 system
		String one = scan.nextLine();
		String[] a = one.split(",");

		int i = Integer.parseInt(a[0]);
		int j = Integer.parseInt(a[1]);

		System.out.println(i + j);

		int value1 = scan.nextInt();
		int value2 = scan.nextInt();

		System.out.println(value1 + value2);
		System.out.printf("%d 와 %d의 합은 %d 입니다",value1,value2,value1+value2);
		scan.close();
	}
}
