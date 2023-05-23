package java;

public class Lv0_인덱스바꾸기 {
	public String solution(String my_string, int num1, int num2) {
		StringBuilder sb = new StringBuilder(my_string);
		char a = sb.charAt(num1);
		sb.setCharAt(num1, sb.charAt(num2));
		sb.setCharAt(num2, a);
		return sb.toString();
	}
}
