package poly.basic;

public class CastingMain6 {
    public static void main(String[] args) {
        Parent parent1 = new Parent();
        // new Parent() instanceof Child => 조건을 만족하지 않는다.
        call(parent1);

        Parent parent2 = new Child();
        // new Child() instanceof Child => 조건을 만족한다.
        call(parent2);
    }

    private static void call(Parent parent) {
        /* 보통 instanceof는 다운캐스팅 전 생성된 인스턴스를 파악하기 위해 사용한다.
           생성 인스턴스를 확인한 후, 곧바로 변수 선언을 진행한다.
         */
        if (parent instanceof Child child) {    // Java 16 이상 가능
            System.out.println("Child 인스턴스가 맞습니다.");

            // Child child = (Child) parent;
            
            // instacneof 키워드로 생성 인스턴스 파악 후, 곧바로 변수 선언까지 진행한 상태
            child.childMethod();
        } else {
            System.out.println("Child 인스턴스가 아닙니다.");
        }
    }
}
