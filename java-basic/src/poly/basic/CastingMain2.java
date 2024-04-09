package poly.basic;

public class CastingMain2 {
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

        // 일시적 다운캐스팅 - 해당 메서드를 호출하는 순간에만 일시적으로 다운캐스팅한다.
        /* poly.childMethod(); => 변수 poly의 타입이 Parent인 상태이므로 불가하다.
           (자식의 기능인 childMethod()를 호출할 수 없다.)
           이때, 변수 poly를 다운캐스팅 해주는데 연산자 우선순위를 고려하여 작성해야 한다.
           poly.childMethod(); > (Child) : 메서드 호출이 우선순위가 높다.
           이를 고려하여, 강제 형변환이 먼저 일어날 수 있도록 괄호를 붙여준다.
         */
        ((Child) poly).childMethod();
    }
}
