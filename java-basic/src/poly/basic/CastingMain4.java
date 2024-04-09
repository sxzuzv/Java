package poly.basic;

public class CastingMain4 {
    public static void main(String[] args) {
        Parent parent1 = new Child();   // 자식 객체를 생성, 부모 타입의 변수에 담는다.
        // Child child1 = parent1; => X, 자식은 부모를 담을 수 없다.

        Child child1 = (Child) parent1; // 다운캐스팅
        child1.childMethod();   // 자식의 기능을 사용할 수 있다.

        Parent parent2 = new Parent();  // 부모 객체를 생성, 부모 타입의 변수에 담는다.

        // 아래 코드 실행 시, 런타임 에러(ClassCastException)가 발생한다.
        // 참조값을 통해 메모리에 접근 시, Parent 인스턴스만 존재하는 상태이기 때문이다.
        // Child child2 = (Child) parent2;
        // child2.childMethod(); => 실행 불가
    }
}
