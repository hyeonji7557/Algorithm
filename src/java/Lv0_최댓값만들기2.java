package java;
import java.util.Arrays;

public class Lv0_최댓값만들기2 {
	public int solution(int[] numbers) {
        int answer = 0;
        Arrays.sort(numbers);
        int a = numbers[0] * numbers[1];
        int b = numbers[numbers.length - 1] * numbers[numbers.length - 2];
        if(a > b){
            return a;
        }else{
            return b;
        }
    }
}
