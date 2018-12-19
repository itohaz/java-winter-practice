import java.util.Scanner;
public class Mondai11 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = 0;

		System.out.println("欠席日数を入力＞");
		num = sc.nextInt();

		if (num >= 55) {
			System.out.println("退学勧告が出ています。");
		} else if (num >= 40) {
			System.out.println("あなたは、学科長に呼ばれました。");
		} else if (num >= 25) {
			System.out.println("自宅に警告書が送付されました。");
		} else if (num >= 10) {
			System.out.println("あなたは、担任の先生に呼ばれました。");
		} else {
			System.out.println("授業を休まず、この調子でがんばってください。");
		}
	}
}
