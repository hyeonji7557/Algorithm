package java;

public class Lv1_소수만들기 {

	public int solution(int[] nums) {
		int answer = 0;
		for (int i = 0; i < nums.length; i++) {
			for (int j = i + 1; j < nums.length; j++) {
				for (int k = j + 1; k < nums.length; k++) {
					int a = nums[i] + nums[j] + nums[k];
					boolean count = true;
					for (int z = 2; z < a; z++) {
						if (a % z == 0) {
							count = false;
							break;
						}
					}
					if (count)
						answer++;
				}
			}
		}
		return answer;
	}
}