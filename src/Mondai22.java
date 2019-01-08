public class Mondai22 {
	public static void main(String[] args) {
		int x = 1;
		do {
			System.out.print(x + "\t");
			if (x%5 == 0) {
				System.out.print("\n");
			}
			x++;
		} while (x <= 50);
	}
}