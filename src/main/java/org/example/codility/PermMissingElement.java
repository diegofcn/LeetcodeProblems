package org.example.codility;

public class PermMissingElement {
    public int solution(int[] A) {
        double N = A.length + 1;
        double sumOfArithematicSeries = N * (N + 1) / 2;
        for (int i : A) {
            sumOfArithematicSeries -= i;
        }
        return (int) (sumOfArithematicSeries);
    }

    public static void main(String[] args) {
        System.out.println(new PermMissingElement().solution(new int[] { 2, 3, 1, 5}));
    }
}
