package org.example.codility;

public class MaxCounters {
    public int[] solution(int N, int[] A) {
        int[] counters = new int[N];
        int max = 0;

        for(int i = 0; i < A.length; i++) {
            if (A[i] <= N) {
                counters[A[i] - 1]++;
                max = Math.max(max, counters[A[i] - 1]);
            } else {
                for (int j = 0; j < counters.length; j++){
                    counters[j] = max;
                }
            }
        }
        return counters;
    }


    public static void main(String[] args) {
        MaxCounters mc = new MaxCounters();
        int[] result = mc.solution(5, new int[] { 3, 4, 4, 6, 1, 4, 4});
        for (int i : result) {
            System.out.println(i);
        }
    }
}
