package poly.overriding;

public class Child extends Parent {
    public String value = "child";

    @Override
    public void method() {  // 메서드 오버라이딩: 부모 클래스의 메서드를 재정의한다.
        System.out.println("Child.method");
    }
}
