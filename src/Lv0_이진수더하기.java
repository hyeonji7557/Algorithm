
public class Lv0_이진수더하기 {
	public String solution(String bin1, String bin2) {
		long newValue = Long.parseLong(bin1, 2) + Long.parseLong(bin2, 2);
		return Long.toBinaryString(newValue);
	}
}
