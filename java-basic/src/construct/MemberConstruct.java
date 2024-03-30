package construct;

public class MemberConstruct {
    String name;
    int age;
    int grade;

    // 생성자 이름은 클래스 이름과 동일해야 하며, 첫 글자는 대문자로 시작한다.
    // 생성자는 반환 타입이 없다. (비워둔다.)
    // 그 외에는 메서드와 동일하다.
    MemberConstruct(String name, int age, int grade) {
        System.out.println("생성자 호출!");

//        // 매개변수로 넘어온 값을 출력한다.
//        System.out.println("name : " + name);
//        System.out.println("age : " + age);
//        System.out.println("grade : " + grade);

        // 멤버 변수의 값을 매개변수 값으로 세팅한다.
        this.name = name;
        this.age = age;
        this.grade = grade;
    }
//
//    // 생성자 오버로딩 (overloading)
//    MemberConstruct(String name, int age) {
//        this.name = name;
//        this.age = age;
//        // 이름과 나이만 초기화될 경우, 성적은 50점으로 처리한다.
//        this.grade = 50;
//    }

    // 상단에 작성한 두 개의 생성자 코드에서, this. 키워드를 통해 멤버 변수의 값을 초기화해주는 부분이 공통된 것을 알 수 있다.
    // 공통된 부분을 축소하기 위해, this()를 사용한다.
    // this() : 자기 자신의 생성자를 호출한다.
    MemberConstruct(String name, int age) {
        // 이름과 나이만 입력된 상태라면, 자기 자신이 가지고 있는 생성자를 호출하여 값을 초기화한다.
        // this()는 생성자 내부에서만 사용가능하다.
        this(name, age, 50); // 변경
    }
}
