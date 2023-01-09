package main.java.me.whiteship.item01;

public interface HelloService {
    
    public String hello();

    // JAVA 9부터 interface에서도 메소드를 구현하는 것이 가능해짐 - default
    default String bye() {
        return "bye";
    }

    // 내부적인 용도로 사용하기 위한 private static 메소드
    private static void preparedMessage() {
    }

    // JAVA 9부터 interface에서도 메소드를 구현하는 것이 가능해짐 - 정적메서드
    static String hi() {
        preparedMessage();
        return "hi";
    }

    // JAVA 9부터 interface에서도 메소드를 구현하는 것이 가능해짐 - 정적메서드
    static String hi2() {
        preparedMessage();
        return "hi";
    }
}
