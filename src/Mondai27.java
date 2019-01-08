public class Mondai27 {
	public static void main (String args[]) {
		String seiseki[][] = {	{"英語", "32", "67"},
								{"国語", "56", "69"},
								{"数学", "71", "38"},
								{"社会", "47", "77"},
								{"理科", "25", "60"}	};

		System.out.println("教科\t 中間\t 期末");

		// ここに出力処理を書く
		for (int x = 0; x < seiseki.length; x++) {
			for (int y = 0; y < seiseki[x].length; y++) {
				System.out.print(seiseki[x][y] + "\t ");
			}
			System.out.print("\n");
		}
	}
}
