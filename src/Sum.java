import java.util.Scanner;

public class Sum {
	public static void main(String[] args) {
		//키보드 두 수의 입력
		//화면에 두수의 합 출력
		Scanner scan = new Scanner(System.in);
		String one =scan.nextLine();
		String[] a = one.split(",");
		
		int i = Integer.parseInt(a[0]);
 		int j = Integer.parseInt(a[1]);
 		
 		System.out.println(i + j);
 		
 		int value1 = scan.nextInt();
 		int value2 = scan.nextInt();
 		
 		System.out.println(value1 + value2);
	}
}
