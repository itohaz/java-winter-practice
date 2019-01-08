public class Mondai15 {
	public static void main(String[] args) {
		int num = (int)(Math.random() *4);

		String weather = "";

		switch(num) {
		case 0:
			weather = "晴れ";
			break;
		case 1:
			weather = "雨";
			break;
		case 2:
			weather = "曇り";
			break;
		case 3:
			weather = "雪";
			break;
		}

		System.out.println("明日の天気は" + weather + "になるでしょう。");
	}
}
