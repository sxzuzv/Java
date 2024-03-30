package construct;

public class MemberInit {
    String name;
    int age;
    int grade;

    // 추가
    // MemberInit이 가진 멤버 변수의 초깃값을 지정하는 메서드이므로, 객체 지정은 동일하다.
    // 그러므로 매개변수는 멤버 변수 값만 받아오면 된다. (객체 지정이 필요없다.)
    void initMember(String name, int age, int grade) {
        // 받은 매개변수 값을 객체의 멤버 변수에 넣는다. (초기화한다.)
        this.name = name;
        this.age = age;
        this.grade = grade;
    }
}
