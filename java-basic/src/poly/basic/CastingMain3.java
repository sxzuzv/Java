package poly.basic;

public class CastingMain3 {
    // Upcasting vs Downcasting

    public static void main(String[] args) {
        Child child = new Child();

        // O, 부모는 자식을 담을 수 있다.
        /* 다만, 타입이 다를 때에는 반드시 캐스팅을 해줘야 하므로 원래는 (Parent) child;가 맞다.
           그런데 Upcasting의 경우 '생략이 가능하다.' (생략을 권장한다.)
           그러므로 우변의 (Parent)를 생략하고 child;만 작성한다. (Java가 자동으로 변환해준다.)
         */

        // 아래의 두 코드는 동일하다.
        Parent parent1 = (Parent) child;    // Upcasting 표기
        Parent parent2 = child;             // Upcasting 생략

        // Upcasting 하였으므로 부모의 기능을 사용할 수 있다.
        parent1.parentMethod();
    }
}
