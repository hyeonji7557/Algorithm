package java;

public class Lv0_배열의평균값 {
public double solution(int[] numbers) {
        double answer = 0;
        for(double a:numbers){
            answer += a;
        }
        answer /= numbers.length;
        return answer;
    }
}
