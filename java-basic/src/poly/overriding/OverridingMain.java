package poly.overriding;

public class OverridingMain {
    public static void main(String[] args) {
        // 자식 타입의 변수가 자식 인스턴스를 참조한다.
        Child child = new Child();
        System.out.println("Child -> Child");
        System.out.println("value = " + child.value);
        child.method();

        // 부모 타입의 변수가 부모 인스턴스를 참조한다.
        Parent parent = new Parent();
        System.out.println("Parent -> Parent");
        System.out.println("value = " + parent.value);
        parent.method();

        // 부모 타입의 변수가 자식 인스턴스를 참조한다. => 다형적 참조
        Parent poly = new Child();
        System.out.println("Parent -> Child");

        // 멤버 변수는 오버라이딩되지 않고, 메서드는 오버라이딩된다.
        System.out.println("value = " + poly.value); // value = parent

        // ** 오버라이딩 된 메서드는 가장 높은 우선권을 가진다. **
        parent.method();    // Child.method
    }
}
