package java;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;
import java.util.StringTokenizer;

public class 생일_5635 {

	public static void main(String[] args) throws IOException{
		BufferedReader br =  new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		String[][] arr = new String[n][4];
		for(int i =0; i <n; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			arr[i][0] = st.nextToken();
			arr[i][1] = st.nextToken();
			arr[i][2] = st.nextToken();
			arr[i][3] = st.nextToken();
		}
		 Arrays.sort(arr, new Comparator<String[]>() {
	            @Override
	            public int compare(String[] s1, String[] s2) {
	                if (Integer.parseInt(s1[3]) == Integer.parseInt(s2[3])) {
	                    if (Integer.parseInt(s1[2]) == Integer.parseInt(s2[2]))
	                        return Integer.parseInt(s1[1]) - Integer.parseInt(s2[1]);
	                    else
	                        return Integer.parseInt(s1[2])- Integer.parseInt(s2[2]);
	                }
	                return Integer.compare(Integer.parseInt(s1[3]), Integer.parseInt(s2[3]));
	            }
	        });
	        System.out.println(arr[n-1][0]+"\n"+arr[0][0]);
	}
}