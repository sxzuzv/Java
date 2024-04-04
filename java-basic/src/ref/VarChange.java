package ref;

public class VarChange {
    public static void main(String[] args) {
        int a = 10;
        int b = a;  // 변수 a의 값을 복사하여 대입한다.

        System.out.println("a = " + a); // 10
        System.out.println("b = " + b); // 10

        a = 20; // 변수 a의 값을 변경한다.
        System.out.println("a = " + a); // 20
        // 10, 변수 a의 값을 '복사'한 것이므로 변수 a의 값 변경에 영향을 받지 않는다.
        System.out.println("b = " + b);

        b = 30; // 변수 b의 값을 변경한다.
        System.out.println("a = " + a); // 20
        System.out.println("b = " + b); // 30
    }
}
