class Solution {
    public String solution(String s) {
        String[] arr = s.split(" ");
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        
        for(String number : arr){
            int a = Integer.parseInt(number);
            if(a > max){
                max = a;
            }
            if(a < min){
                min = a;
            }
        }
        return min + " " + max;
    }
}
