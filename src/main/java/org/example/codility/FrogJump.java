package org.example.codility;

public class FrogJump {
    public int solution(int x, int y, int D) {
        int jump = 0;
        int totalDistance = x;
        while(totalDistance <= y) {
            jump++;
            totalDistance += D;
        }
        return jump;
    }

    public static void main(String[] args) {
        System.out.println(new FrogJump().solution(0));
    }
}
