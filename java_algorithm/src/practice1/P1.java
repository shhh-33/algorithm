package practice1;

public class P1 {

    public static void main(String[] args) {
        // Solution 클래스의 인스턴스 생성
        Solution solution = new Solution();
        String result = solution.solution("ProgrammerS123", 11);
        System.out.println(result);
    }

    static class Solution {
        public String solution(String my_string, int n) {
            String answer = "";
            answer = my_string.substring(0, n);
            return answer;
        }
    }
}
