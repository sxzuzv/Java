package extends1.access.child;

import extends1.access.parent.Parent;

public class Child extends Parent {
    // 부모 클래스의 기능 중 어느 영역까지 자식 클래스에서 사용할 수 있는지를 판단한다.

    public void call() {
        // 외부 접근 가능하므로 사용 가능
        publicValue = 1;

        // protected : 같은 패키지 or 상속 관계일 경우 사용 가능
        // 현재 패키지는 다르나 상속 관계이므로 불러쓰는 것이 가능하다.
        protectedValue = 1;

        // defaultValue = 1; 같은 패키지인 경우에만 사용 가능하므로 사용 불가
        // privateValue = 1; 외부에서 접근 불가하므로 자식 클래스더라도 사용 불가

        publicMethod();
        protectedMethod();
        // defaultMethod();
        // privateMethod();

        // public 메소드이므로 외부 접근 가능, 사용 가능하다.
        printParent();
    }
}
