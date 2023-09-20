package practice1;

//첫 번째로 나오는 음수
public class P5 {

    public static void main(String[] args) {
        Solution solution = new Solution();
        solution.solution(new int[] {12, 4, 15, 46, 38, -2, 15});
    }

    static class Solution {
    	 
    	 public int solution(int[] num_list) {
    	        int answer = -1;
    	        
    	        for(int i=0; i<num_list.length; i++) {
    	        	if(num_list[i] < 0) {
    	        		answer = i;
    	        		System.out.println(answer);
    	        		break;
    	        	}
    	        }
    	        
    	        return answer;
    	    }
 
    }
}


