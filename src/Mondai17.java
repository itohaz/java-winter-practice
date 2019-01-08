import java.util.Scanner;
public class Mondai17 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("開始値 from を入力してください：");
		int fromId = sc.nextInt();

		System.out.print("終了値 to を入力してください：");
		int toId = sc.nextInt();

		int sumId = fromId;
		int i = 1;

		while (i < toId) {
			sumId += fromId + i;
			i++;
		}

		System.out.print("総和は" + sumId + "です。");
	}
}
