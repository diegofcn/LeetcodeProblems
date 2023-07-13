package org.example.codility.prefixSums;

public class PassingCars {
    public int solution(int[] A) {
        int eastCount = 0;
        int passCount = 0;

        for (int i = 0; i < A.length; i++) {
            if (A[i] == 0) {
                eastCount++;
            } else if (A[i] == 1) {
                passCount += eastCount;
                if (passCount > 1_000_000_000) {
                    return -1;
                }
            }
        }

        return passCount;
    }
}
