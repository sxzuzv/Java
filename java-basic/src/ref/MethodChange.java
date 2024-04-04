package ref;

public class MethodChange {
    public static void main(String[] args) {
        int a = 10;

        System.out.println("메서드 호출 전 a : " + a);    // 10
        changePrimitive(a); // 변수 a의 값을 '복사'하여 매개변수로 전달한다.
        System.out.println("메서드 호출 후 a : " + a);    // 10

    }

    public static void changePrimitive(int x) {
        // 메서드가 호출될 때, 매개변수 x에 변수 a의 값을 복사하여 전달한다.
        // => int x = a; 와 동일한 작업을 실행하는 것!
        // 메모리에 변수 x가 생성되고, 10이라는 값을 가지게 된다.
        x = 20; // 변수 x의 값을 20으로 변경해도 변수 a에는 영향을 끼치지 않는다.
    }
}
