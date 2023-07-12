package org.example.codility;

public class TapeEquilibrium {
    public int solution(int[] A) {
        int numbersOnRight = 0;
        for (int i=0; i < A.length; i++){
            numbersOnRight += A[i];
        }

        int minDiff = Integer.MAX_VALUE;

        int numbersOnLeft = 0;
        for (int i=0; i < A.length - 1; i++){
            numbersOnRight -= A[i];
            numbersOnLeft += A[i];
            if(Math.abs(numbersOnLeft - numbersOnRight) < minDiff) {
                minDiff = Math.abs(numbersOnLeft - numbersOnRight);
            }
        }
        return minDiff;
    }

    public static void main(String[] args) {
        System.out.println(new TapeEquilibrium().solution(new int[] {3, 1, 2, 4, 3}));
    }
}
