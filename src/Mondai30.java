import java.util.Scanner;
public class Mondai30 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int clear = 0;

		int count = (int)(Math.random()*20);
		System.out.println("----- " + count + "問答えよ -----");

		long startTime = System.currentTimeMillis();

		for (int i = 0; i < count; i++) {
			int a = (int)(Math.random()*100);
			int b = (int)(Math.random()*100);

			System.out.print(a + "+" + b + "= ");
			int ans = sc.nextInt();

			if (ans == a + b) {
				System.out.println("○");
				clear++;
			} else {
				System.out.println("✗");
			}
		}

		long endTime = System.currentTimeMillis();

		System.out.println("正解数: " + clear);
		System.out.println("正解率: " + ((double)clear / count)*100 + "%");
		System.out.println("かかった時間: " + (endTime - startTime)/1000 + "秒");
	}
}
