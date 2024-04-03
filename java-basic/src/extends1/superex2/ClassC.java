package extends1.superex2;

public class ClassC extends ClassB {
    public ClassC() {
        /* ClassB 클래스의 경우, 기본 생성자를 사용하지 않고
           생성자를 직접 정의하였으므로 기본 생성자가 자동으로 만들어지지 않는다.
           (생성자가 없다면, Java에서 매개변수가 없는 기본 생성자를 자동으로 만들어준다.)
           즉, super() 사용 시 직접 정의한 생성자에 맞게 매개변수를 설정해주어야 한다. */
        // 생성자는 '하나만 호출'할 수 있으므로, ClassB의 생성자 중 하나를 선택하면 된다.

        // super()를 생략할 수 있는 경우 = 부모 클래스의 생성자가 '기본 생성자'일 때
        super(10, 20);  // 부모 클래스의 생성자가 별도 정의된 상태, 생략 불가하다.
        System.out.println("ClassC의 생성자!");
    }
}
