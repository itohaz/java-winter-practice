import java.util.Scanner;
public class Mondai29 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int answer = (int)(Math.random()*100);
		int ansInput = 0;

		System.out.println("------- 数当てゲーム -------");
		System.out.println("コンピュータが選んだ 2 桁の数値を当ててください。");

		do {
			System.out.print("数値を入力 > ");
			ansInput = sc.nextInt();

			if (ansInput > answer) {
				if ((ansInput - answer) < 5) {
					System.out.print("惜しい！もう少し");
				} else {
					System.out.print("もっと");
				}
				System.out.print("小さな数です\n");

			} else if (ansInput < answer) {
				if ((answer - ansInput) < 5) {
					System.out.print("惜しい！もう少し");
				} else {
					System.out.print("もっと");
				}
				System.out.print("大きな数です\n");
			}
		} while (ansInput != answer);
		System.out.println("あたり！");
	}
}
