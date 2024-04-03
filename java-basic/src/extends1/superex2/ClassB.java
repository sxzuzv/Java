package extends1.superex2;

public class ClassB extends ClassA {
    /* ClassB는 ClassA를 상속 받았다.
     이 경우, ClassB는 생성자의 첫 줄에 super()를 사용하여
     부모 클래스의 생성자를 호출해야 한다. */

    public ClassB(int a) {
        /* 매개변수가 없는 기본 생성자의 경우, Java가 자동으로 만들어준다.
         원래는 자식 클래스에서 부모 클래스의 생성자를 호출해줘야 하지만(규칙),
         기본 생성자의 경우 Java가 자동으로 만들어주기 때문에 super() 생략이 가능하다. */

        // 기본 생성자 (ClassA의 생성자), 생략 가능하다.
        // super();

        /* 생성자의 첫 줄에 this(...) 사용도 가능하다.
         그러나, 자식 클래스의 생성자에서 반드시 한 번은 첫 줄에 super(...)를 사용하여
         부모 클래스의 생성자를 호출해주어야 한다. */
        this(a, 200);
        System.out.println("ClassB의 생성자! a = " + a);
    }

    public ClassB(int a, int b) {
        super();    // 기본 생성자 (ClassA의 생성자), 생략 가능하다.
        System.out.println("ClassB 생성자! a = " + a + " b = " + b);
    }
}
