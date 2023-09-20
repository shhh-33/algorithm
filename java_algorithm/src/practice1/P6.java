package practice1;

//배열의 원소만큼 추가하기
public class P6 {

    public static void main(String[] args) {
        Solution solution = new Solution();
        solution.solution(new int[] {5, 1, 4});
    }

    static class Solution {
    	 
        public int[] solution(int[] arr) {
        	
        	int[] answer = {};
        	int sum = 0;

     		// arr의 각 인덱스의 합 = 반환할 인덱스의 길이
	        for (int i = 0; i < arr.length; i++) {
	            sum += arr[i];    
	        }
	        answer = new int[sum];
            
            for(int i=0; i<arr.length; i++) {
            	for(int j=0; j<arr[i]; j++) {
            		answer[i] = arr[i];
            	}
            	System.out.println(answer[i]);
            }
            return answer;
        }
 
    	 
    }
}


