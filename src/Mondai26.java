public class Mondai26 {
	public static void main(String[] args) {
		int[][] kazu = new int [9][9]; //int 型二次元配列を宣言
		for (int a = 1; a <= 9; a++) {
			for (int b = 1; b <= 9; b++) {
				kazu[a - 1][b - 1] = a * b; //二次元配列に値を代入
			}
		}
		// ここに出力処理を書く
		for (int x = 0; x < kazu.length; x++) {
			for (int y = 0; y < kazu[x].length; y++) {
				System.out.print(kazu[x][y] + "\t");
			}
			System.out.print("\n");
		}
	}
}
