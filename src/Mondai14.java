import java.util.Scanner;
public class Mondai14 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("IDを入力してください：");
		String userid = sc.next();

		System.out.print("パスワードを入力してください：");
		String password = sc.next();

		if (userid.equals("user")) {
			if (password.equals("mypassword")) { // worst
				System.out.print("あなたは認証されました。");
			} else {
				System.out.print("パスワードが違います。処理を終了します。");
			}
		} else {
			System.out.print("IDが違います。処理を終了します。");
		}
	}
}
