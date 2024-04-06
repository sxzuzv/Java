package poly.basic;

public class PolyMain {
    public static void main(String[] args) {
        // 부모 타입의 변수를 생성하고 부모 인스턴스를 참조한다.
        System.out.println("Parent -> Parent");

        /* Parent 인스턴스를 생성한다.
           생성된 참조값은 Parent 타입의 변수인 parent에 담아둔다.
           이 경우, 부모 타입인 Parent를 생성하였으므로 메모리에는 Parent만 생성된다.
           (자식은 생성되지 않는다.) */
        Parent parent = new Parent();
        parent.parentMethod();

        // 자식 타입의 변수를 생성하고 자식 인스턴스를 참조한다.
        System.out.println("Child -> Child");

        /* Child 인스턴스를 생성한다.
           생성된 참조값은 Child 타입의 변수인 child에 담아둔다.
         이 경우, 자식 타입인 Child를 생성하였으므로 메모리에는 Parent와 Child가 생성된다.
        */
        Child child = new Child();
        child.parentMethod();   // 상속 관계이므로 부모의 메서드를 호출 가능하다.
        child.childMethod();

        // 부모 타입의 변수가 자식 인스턴스를 참조한다. => 다형적 참조
        System.out.println("Parent -> Child");

        /* Child 인스턴스를 생성한다.
        (이 경우, 자식 타입인 Child를 생성하였으므로 메모리에는 Parent와 Child가 생성된다.)
           생성된 참조 값은 Parent 타입 변수인 poly에 담아둔다.
           poly는 부모 타입 변수이며, new Child()를 통해 생성된 인스턴스는 자식 타입이다.
           Java에서 부모 타입은 자식 타입을 담을 수 있다(대입할 수 있다).
         */
        Parent poly = new Child();
        poly.parentMethod();

        // poly는 부모 타입 변수이므로, 부모의 기능만 알고 있다. 자식의 기능은 호출 불가!
        // poly.childMethod(); 컴파일 오류 발생!

        // Child child1 = new Parent(); 컴파일 오류 발생! (자식은 부모를 담을 수 없다.)
    }
}
