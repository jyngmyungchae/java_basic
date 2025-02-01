package lambda;

public class LambdaBasic {
    public static void main(String[] args) {
        FunctionalInterface fi;

        // 1. 매개 변수 없음
//        fi = () -> {
//            String str = "method call1";
//            System.out.println(str);
//        };
//        fi.method();
//
//        fi = () -> {
//            System.out.println("method call2");
//        };
//        fi.method();
//
//        fi = () -> System.out.println("method call3");
//        fi.method();


        //2. 매개 변수 (x)
//        fi = (x) ->{
//            int result = x * 5;
//            System.out.println(result);
//        };
//        fi.method(2);
//
//        fi = (x) -> {
//            System.out.println(x*5);
//        };
//        fi.method(2);
//
//        fi = x -> System.out.println(x*5); // 매개 변수가 하나일 경우에는 괄호 생략가능
//        fi.method(2);

        fi = (x, y) -> {
            int result = x + y;
            return result;
        };
        System.out.println(fi.method(2, 5));

        fi = (x, y) -> {
            return x + y;
        };
        System.out.println(fi.method(2, 5));

        fi = (x, y) -> x + y; // return문만 있을 경우 중괄호와 return문 생략 가능
        System.out.println(fi.method(2, 5));

        fi = (x, y) -> sum(x,y); // return문만 있을 경우 중괄호와 return문 생략 가능
        System.out.println(fi.method(2,5));
    }

    public static int sum(int x, int y) {
        return (x + y);
    }
}