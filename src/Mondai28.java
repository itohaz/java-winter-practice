public class Mondai28 {
	public static void main(String[] args) {
		int score = (int)(Math.random()*100);
		String omikuji ="";

		if (score >= 80) {
			omikuji = "大吉";
		} else if (score >= 60) {
			omikuji = "中吉";
		} else if (score >= 40) {
			omikuji = "小吉";
		} else if (score >= 20) {
			omikuji = "吉";
		} else {
			omikuji = "凶";
		}

		System.out.println("あなたの運勢は " + omikuji + " です (score: " + score + ")");
	}
}
