package extends1.overriding;

// 상위 개념인 '자동차'가 가진 기능을 모두 물려받는다. => 별도로 move()를 만들 필요가 없다.
// extends 키워드를 사용하여 부모 클래스 (슈퍼 클래스)의 필드 및 메서드를 상속받을 수 있다.
public class GasCar extends Car {
    public void fillUp() {
        System.out.println("차를 주유합니다.");
    }
}
