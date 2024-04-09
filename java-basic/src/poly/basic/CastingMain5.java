package poly.basic;

public class CastingMain5 {
    public static void main(String[] args) {
        Parent parent1 = new Parent();
        // new Parent() instanceof Child => 조건을 만족하지 않는다.
        call(parent1);

        Parent parent2 = new Child();
        // new Child() instanceof Child => 조건을 만족한다.
        call(parent2);
    }

    private static void call(Parent parent) {
        // 이 경우, 매개변수로 Parent이 전달될 지 Child 타입이 전달될 지 알 수 없다.
        // 이를 파악하고 싶다면 'instanceof' 키워드를 이용한다.

        // 매개변수로 전달된 parent가 Child로부터 생성됐다면
        if (parent instanceof Child) {
            System.out.println("Child 인스턴스가 맞습니다.");

            // 만약 parent1이 넘어오는 경우라면, 다운캐스팅이 불가하다. ((Child) 타입이 메모리에 없으므로!)
            // 만약 parent2가 넘어오는 경우라면, 다운캐스팅이 가능하다. ((Child) 타입이 메모리에 있으므로!)
            Child child = (Child) parent;
            child.childMethod();
        } else {
            System.out.println("Child 인스턴스가 아닙니다.");
        }
    }
}
