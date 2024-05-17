package memory;

public class JavaStackMain {
    // 스택(Stack) 구조: 후입선출(LIFO, Last In First Out)
    // main 메서드가 가장 먼저 실행되지만, 가장 나중에 종료된다.
    public static void main(String[] args) {
        System.out.println("Main Start!");
        method1(10);
        System.out.println("Main End!");
    }

    static void method1(int m1) {
        System.out.println("Method1 Start!");
        int cal = m1 * 2;
        method2(cal);
        System.out.println("Method1 End!");
    }

    static void method2(int m2) {
        System.out.println("Method2 Start!");
        System.out.println("Method2 End!");
    }
}