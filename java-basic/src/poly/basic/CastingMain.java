package poly.basic;

public class CastingMain {
    public static void main(String[] args) {
        // 부모 변수가 자식 인스턴스를 참조한다. => 다형적 참조
        Parent poly = new Child();

        // 자식 타입의 기능은 호출할 수 없다.
        // poly.childMethod(); -> 컴파일 오류 발생!

        // 이를 해결하기 위해, 다운 캐스팅을 진행한다.
        // 부모 타입 변수 poly를 자식 타입 변수에 대입한다. (참조값을 대입한다.)
        Child child = (Child) poly; // poly를 강제로 Child 타입으로 변경하여 대입한다.

        // Child 타입의 변수 child를 사용하여 childMethod()를 호출할 수 있다.
        child.childMethod();
    }
}
