import java.util.HashMap;
import java.util.Map;

public class Lv0_모스부호1 {
	public String solution(String letter) {
		Map<String, String> list = new HashMap<>() {
			{
				put(".-", "a");
				put("-...", "b");
				put("-.-.", "c");
				put("-..", "d");
				put(".", "e");
				put("..-.", "f");
				put("--.", "g");
				put("....", "h");
				put("..", "i");
				put(".---", "j");
				put("-.-", "k");
				put(".-..", "l");
				put("--", "m");
				put("-.", "n");
				put("---", "o");
				put(".--.", "p");
				put("--.-", "q");
				put(".-.", "r");
				put("...", "s");
				put("-", "t");
				put("..-", "u");
				put("...-", "v");
				put(".--", "w");
				put("-..-", "x");
				put("-.--", "y");
				put("--..", "z");
			}
		};
		String answer = "";
		String[] arr = letter.split(" ");
		for (String a : arr) {
			answer += list.get(a);
		}
		return answer;
	}
}
