package org.example.codility;

import java.util.HashSet;

public class FrogRiverOne {
    public int solution(int x, int[] A) {

        HashSet<Integer> set = new HashSet<>();

        for (int i = 0; i < A.length; i++) {
            set.add(A[i]);
            if (set.size() == x) {
                return i;
            }
        }
        return -1;

    }

    public static void main(String[] args) {
        FrogRiverOne fro = new FrogRiverOne();
        System.out.println(fro.solution(5, new int[] {1, 3, 1, 4, 2, 3, 5, 4}));
    }
}
