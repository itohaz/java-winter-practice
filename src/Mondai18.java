import java.util.Scanner;
public class Mondai18 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("整数の階乗を計算します。整数を入力してください：");
		int scan = sc.nextInt();
		int i = 2;
		int sum = 1;

		while (i <= scan) {
			sum *= i;
			i++;
		}

		System.out.print( scan + "! は" + sum + "です。");
	}
}
