package java;

public class Lv0_숨어있는숫자의덧셈1 {
	public int solution(String my_string) {
		int answer = 0;
		String replace = "";
		replace = my_string.toLowerCase().replaceAll("[abcdefghijklmnopqrstuvwxyz]", "");
		String[] arry = replace.split("");
		for (int i = 0; i < arry.length; i++) {
			answer += Integer.parseInt(arry[i]);
		}
		return answer;
	}
}
