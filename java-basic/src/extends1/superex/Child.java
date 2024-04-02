package extends1.superex;

public class Child extends Parent {
    public String value = "child";

    @Override
    public void hello() {
        System.out.println("child hello!");
    }

    public void call() {
        /* 부모와 필드, 메서드 이름이 동일할 때 super 키워드를 사용하면
           부모 클래스에 있는 기능을 사용할 수 있다. */

        // this : 자기 자신을 의미한다. 자기 자신에게서 해당 타입을 찾는다.
        // super : 부모를 의미한다. 자신의 부모에게서 해당 타입을 찾는다.
        // this.value에서 this 생략 시(value만 기재), 본인에게서 먼저 찾는다.
        System.out.println("this value = " + this.value);   // child
        System.out.println("super value = " + super.value); // parent

        this.hello();   // this 생략 가능
        super.hello();
    }
}
