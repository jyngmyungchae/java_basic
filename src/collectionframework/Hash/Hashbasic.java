package collectionframework.Hash;

import java.util.HashMap;

public class Hashbasic {
    public static void main(String[] args) {

        HashMap<String,Integer> map = new HashMap<>(); // 키는 String을, 값은 32비트 Integer를 저장하는 해시맵 호출
        map.put("apple",1);
        map.put("banana",2);
        map.put("orange",3);

        System.out.println(map); // {banana=2, orange=3, apple=1}

        String key = "apple";

        if(map.containsKey(key)){
            int value = map.get(key);
            System.out.println(key + " : " + value);
        }else{
            System.out.println(key + "는 해시맵에 없습니다.");
        }

        map.put("banana",4); // key banana,4 수정
        System.out.println(map);

        map.remove("orange"); // key orange를 찾아  삭제
        System.out.println(map);
    }
}
