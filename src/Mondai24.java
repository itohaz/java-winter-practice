public class Mondai24 {
	public static void main(String[] args) {
		int[] arr = {5, 3, 6, 10, 1};
		int max = 0;

		for (int i = 0; i < arr.length; i++) {
			if (arr[i] > max) {
				max = arr[i];
			}
		}
		System.out.println("最大値は" + max + "です。");
	}
}
