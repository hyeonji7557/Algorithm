package java;

public class Lv0_구슬을나누는경우의수 {
	public int solution(int balls, int share) {
		int a = 1;
		int b = 1;
		int c = 1;
		for (int i = 1; i <= balls; i++) 
			a = a * i;
		for (int i = 1; i <= share; i++) 
			b = b * i;
		for (int i = 1; i <= balls - share; i++) 
			c = c * i;
		return (a / (b * c));
	}
}
