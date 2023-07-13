package org.example.codility;

import java.util.HashSet;

public class PermCheck {
    public int solution(int[] A) {
        HashSet<Integer> nums = new HashSet<>();

        for (int i = 1; i <= A.length; i++) {
            nums.add(i);
        }
        for (int a : A) {
            nums.remove(Integer.valueOf(a));
        }
        if(nums.size() == 0) {
            return 1;
        } else {
            return 0;
        }
    }


    public static void main(String[] args) {
        PermCheck pc = new PermCheck();
        System.out.println(pc.solution(new int[] { 4, 1, 3, 2 }));
    }
}
