package java;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class 약수구하기_2501 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int n = Integer.parseInt(st.nextToken());
		int k = Integer.parseInt(st.nextToken());
        for (int i = 1; i <= n; i++) {
            if(n % i == 0) k--;
            if(k == 0) {
                System.out.println(i);
                break;
            }
        }
        if(k != 0) 
            System.out.println(0); 
    }
}