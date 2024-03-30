package extends1.access;

import extends1.access.child.Child;

public class ExtendsAccessMain {
    public static void main(String[] args) {
        // Child 클래스의 객체를 생성한다.
        Child child = new Child();

        // child 객체의 call 메소드를 호출한다.
        child.call();
    }
}
