package practice1;

//원하는 문자열 찾기
public class P3 {

    public static void main(String[] args) {
        Solution solution = new Solution();
        int result = solution.solution("AbCdEfG","aBc");
        System.out.println(result);
    }

    static class Solution {
    	
    	 public int solution(String myString, String pat) {
    		 myString = myString.toLowerCase();
	         pat = pat.toLowerCase();
    	        
	         if (myString.contains(pat)) {
	            return 1;
	         }else {
	            return 0;
	         }
    	 }
    }
}
