package collectionframework.Ex;

//정수 배열을 정렬해서 반환하는 solution() 함수를 완성하기.

import java.util.Arrays;

public class Solution {
    public static void main(String[] args) {

        int[] arr = {1,5,2,4,3};
        System.out.println(Arrays.toString(solution(arr)));
    }

    private static int[] solution(int[] arr){
        int[] clone = arr.clone();
        Arrays.sort(clone);
        return clone;
    }
}
