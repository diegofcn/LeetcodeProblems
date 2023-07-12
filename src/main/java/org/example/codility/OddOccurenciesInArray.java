package org.example.codility;

import java.util.ArrayList;
import java.util.List;

public class OddOccurenciesInArray {
    List<Integer> aList = new ArrayList<>();
    public int solution(int[] A) {

        for (int i = 0; i < A.length; i++) {
            int a = A[i];
            if (aList.contains(a)) {
                aList.remove(Integer.valueOf(a));
            } else {
                aList.add(a);
            }
        }
        return aList.get(0);
    }
    public static void main(String[] args) {
        OddOccurenciesInArray ooia =  new OddOccurenciesInArray();
        System.out.println(ooia.solution(new int[] {9, 3, 9, 3, 9, 7, 9}));

    }
}
