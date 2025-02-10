package collectionframework.List;

import java.util.ArrayList;
import java.util.List;

public class ListBasic {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>(); // 기본 생성자로 생성하면 내부 10개의 객체를 저장할 수 있는 용량을 가짐.
        //List list2 = new ArrayList(); // 저장할 때 object로 변환하고 찾아올 때 원래타입으로 변환하므로 성능에 좋지 않은 영향을 끼침

        //맨끝에 객체 추가
        list.add("정명채");
        System.out.println(list);
        //지정된 인덱스에 객체 삽입
        list.add(0,"명채");
        System.out.println(list);
        //인덱스로 객체 찾기
        String str = list.get(1);
        System.out.println(str);
        //인덱스로 객체 삭제
        list.remove(0);
        System.out.println(list);
        //객체 삭제
        list.remove("정명채");
        System.out.println(list);

    }
}
