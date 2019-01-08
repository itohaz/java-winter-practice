public class Mondai21 {
	public static void main(String[] args) {
		for(int x = 1; x <= 9; x++) {
			if (x == 6) {
				continue;
			}
			for (int y = 1; y <= 9; y++) {
				System.out.print(x*y + "\t");
			}
			System.out.print("\n");
		}
	}
}