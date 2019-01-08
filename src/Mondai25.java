public class Mondai25 {
	public static void main(String[] args) {
		int[] arr = {5, 3, 6, 10, 1};
		int min = arr[0];

		for (int i = 0; i < arr.length; i++) {
			if (arr[i] < min) {
				min = arr[i];
			}
		}
		System.out.println("最小値は" + min + "です。");
	}
}
