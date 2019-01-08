import java.util.Scanner;
public class Mondai12 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("曜日を漢字1文字で入力してください（例：土）：");
		String weekday = sc.next();

		System.out.print("割引券をお持ちですか？（true/false）：");
		boolean ticket = sc.nextBoolean();

		int price = 2000;
		double value = 1;

		if (weekday.equals("金") && ticket == true) {
			value = 0.7;
		} else if (weekday.equals("金") || ticket == true) {
			value = 0.8;
		}
		System.out.println("入場料は" + price * value + "円です");
	}
}
