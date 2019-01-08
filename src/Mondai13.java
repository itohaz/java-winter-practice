import java.util.Scanner;
public class Mondai13 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("血液型を入力してください＞");
		String bloodtype = sc.next();

		System.out.print("あなたは" + bloodtype + "型ですね。");

		// 補足資料① p6 switch文の文字列判定
		switch (bloodtype) {
		case "A":
			System.out.print("ぜひ献血をお願いします。");
			break;
		default:
			System.out.print("A型の人を紹介してください。");
		}
	}
}
