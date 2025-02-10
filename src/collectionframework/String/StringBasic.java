package collectionframework.String;

public class StringBasic {
    public static void main(String[] args) {

        String str = "Hello, world!";
        System.out.println(str);
        System.out.println(System.identityHashCode(str));
        str += "!!";
        System.out.println(str);
        System.out.println(System.identityHashCode(str));
        str = str.replace("!","~");
        System.out.println(str);
        System.out.println(System.identityHashCode(str));


        /*
        String객체는 값을 변경할 수 없는 Immutable객체.
        System.identityHashCode()메서드는 객체를 특정할 수 있는 식별값을 반환
        str값에 추가 변경이 있을 때마다 identityHashCode()메서드의 출력값은 달라짐
        Hello,world! 와 Hello,world!!!, Hello,world~~~가 서로 다른 객체임을 의미
        String객체의 값을 변경하는 작업은 새로운 String객체를 만들고 값을 복사하는 작업이 수행되는 것
         */
    }
}
