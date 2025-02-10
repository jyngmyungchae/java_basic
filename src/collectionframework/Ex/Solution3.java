package collectionframework.Ex;

import java.util.Arrays;
import java.util.HashSet;

//정수 배열 numbers가 주어집니다. numbers에서 서로 다른 인덱스에 있는 2개의 수를 뽑아 더해
//만들 수 있는 모든 수를 배열에 오름차순으로 담아 반환하는 solution()함수를 완성하기
public class Solution3 {
    public static void main(String[] args) {
        int[] arr = {5,0,2,7};
        System.out.println(Arrays.toString(solution(arr)));
    }


    private static int[] solution(int[] numbers){
        HashSet<Integer>set = new HashSet<>(); // 중복값 제거를 위한 해시셋 생성

        //두 수를 선택하는 모든 경우의 수를 반복문으로 구함
        for(int i=0; i<numbers.length-1; i++) {
            for (int j = i+1; j < numbers.length; j++) {
                //두 수를 더한 겨로가를 해시셋에 추가
                set.add(numbers[i] + numbers[j]);
            }
        }
        //해시셋의 값을 오름차순 정렬, int[]형태의 배열로 변환하여 반환
        return set.stream().sorted().mapToInt(Integer::intValue).toArray();
    }
}
