package org.example.codility;

public class CyclicRotation {

    public int[] solution(int[] A, int k){
        for (int i = 0; i < k; i++) {
            int lastValue = A[A.length - 1];
            for (int j = A.length - 2; j >= 0; j--){
                A[j + 1] = A[j];
            }
            A[0] = lastValue;
        }
        return A;
    }
    public static void main(String[] args) {
        CyclicRotation cr = new CyclicRotation();
        int[] result = cr.solution(new int[] { 3, 8, 9, 6, 2 }, 3);
        for (int i : result){
            System.out.print(i + " ");
        }
    }
}
