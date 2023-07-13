package org.example.codility.prefixSums;

public class MinAvgTwoSlice {
    public int solution(int[] A) {
        int index = 0;
        double minAvg = Double.MAX_VALUE;

        for (int i = 0; i < A.length - 2; i++) {
            double avg2 = (A[i] + A[i+1]) / 2.0;
            double avg3 = (A[i] + A[i+1] + A[i+2]) / 3.0;
            double min = Math.min(avg2, avg3);

            if (min < minAvg) {
                minAvg = min;
                index = i;
            }
        }

        double avg2 = (A[A.length - 2] + A[A.length - 1]) / 2.0;
        if (avg2 < minAvg) {
            index = A.length - 2;
        }

        return index;
    }
}
