package collectionframework.Ex;

//정수 배열은 하나 받아 중복값을 제거하고 배열 데이터를 내림차순으로 정렬해서 반환하는 solution()함수를 구현하기.
import java.util.Arrays;
import java.util.Collections;

public class Solution2 {
    public static void main(String[] args) {
        int[] arr = {1,3,5,7,9};
        System.out.println(Arrays.toString(solution(arr)));
    }



    private static int[] solution(int[] arr){
        Integer[] result = Arrays.stream(arr).boxed().distinct(). // 중복값 제거
                toArray(Integer[]::new);

        Arrays.sort(result, Collections.reverseOrder()); //내림차순 정렬

        return Arrays.stream(result).mapToInt(Integer::intValue).toArray(); //int형 배열로 변경 후 반환
    }
}
