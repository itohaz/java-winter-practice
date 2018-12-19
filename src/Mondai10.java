import java.util.Scanner;
public class Mondai10 {
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.print("入力値：");
		 // 文字列を入力
		 String inputNum = sc.next();
		 // 文字列を数値に変換
		int num = Integer.parseInt(inputNum);
		 System.out.print("入力された数値：" + num);
		}
}
