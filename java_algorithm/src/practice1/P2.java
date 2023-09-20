package practice1;

//부분 문자열인지 확인하기
public class P2 {

    public static void main(String[] args) {
        Solution solution = new Solution();
        int result = solution.solution("banana","ana");
        System.out.println(result);
    }

    static class Solution {
    	
    	 public int solution(String my_string, String target) {
    		 int answer = 0;
    		 if(target.contains(target)) {
    			 answer =1;
    		 }
    		 return answer;
    	 }
    	 
    }
}
