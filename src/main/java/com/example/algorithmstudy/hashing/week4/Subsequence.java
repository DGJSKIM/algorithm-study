package com.example.algorithmstudy.hashing.week4;

public class Subsequence {
    public int solution(int[] nums, int m){
        int answer = 0;
        //  당연히 2중 for 문으로 돌면 해결은 되는데
        for (int i = 0; i < nums.length; i++) {
            int sum = nums[i];
            if (sum == m) {
                answer++;
            }
            for (int j = i+1; j < nums.length; j++) {
                sum += nums[j];
                if (sum == m) {
                    answer++;
                }
            }
        }
        return answer;
    }

    public int solution2(int[] nums, int m){
        int answer = 0;
        // 2중 for 문 없이 되나
        // 오 답지 풀이 레전드
        

        return answer;
    }
    

    public static void main(String[] args){
        Subsequence T = new Subsequence();
        System.out.println(T.solution(new int[]{2, 2, 3, -1, -1, -1, 3, 1, 1}, 5));
        System.out.println(T.solution(new int[]{1, 2, 3, -3, 1, 2, 2, -3}, 5));
        System.out.println(T.solution(new int[]{1, 2, 3, -3, 1, 2}, 3));
        System.out.println(T.solution(new int[]{-1, 0, 1}, 0));
        System.out.println(T.solution(new int[]{-1, -1, -1, 1}, 0));
    }
}