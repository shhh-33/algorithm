package practice1;

//소문자로 바꾸기
public class P4 {

    public static void main(String[] args) {
        Solution solution = new Solution();
        String result = solution.solution("aBcDeFg");
        System.out.println(result);
    }

    static class Solution {
    	
    	 public String solution(String myString) {
	         String answer = myString.toLowerCase();
	         return answer;
    	 }
    }
    
}
