package memory;

public class JavaHeapMain {
    public static void main(String[] args) {
        System.out.println("Main Start!");
        method1();
        System.out.println("Main End!");
    }

    static void method1() {
        System.out.println("Method1 Start!");
        Data data = new Data(10);
        method2(data);  // Data 인스턴스의 참조 값을 변수 data에 담아 매개변수로 넘겨준다.
        System.out.println("Method1 End!");
    }

    static void method2(Data data) {    // data: 참조 값을 매개변수로 전달 받는다.
        System.out.println("Method2 Start!");
        System.out.println("data = " + data);
        System.out.println("Method2 End!");
    }
}