public class Mondai07 {
	public static void main(String[] args) {
		String str1 = "Hello! ";
		String str2 = "How are you doing ? ";
		String str3 = " ";

		System.out.println(str1);
		System.out.println(str2);

		System.out.println();
		str3 = str1;
		str1 = str2;
		str2 = str3;

		System.out.println(str1);
		System.out.println(str2);
		System.out.println(str3);
	}
}
