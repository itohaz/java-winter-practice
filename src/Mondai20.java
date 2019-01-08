public class Mondai20 {
	public static void main(String[] args) {
		for(int x = 1; x <= 9; x++) {
			for (int y = 1; y <= 9; y++) {
				if (y == 6) {
					break;
				}
				System.out.print(x*y + "\t");
			}
			System.out.print("\n");
		}
	}
}
