import java.util.Scanner;
public class Mondai16 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("言語を入力してください：");
		int langid = sc.nextInt();

		switch(langid) {
		case 1:
			System.out.print("おはようございます");
			break;
		case 2:
			System.out.print("Good morning!");
			break;
		case 3:
			System.out.print("早上好！");
			break;
		default:
			System.out.print("入力ミスです");
		}
	}
}
