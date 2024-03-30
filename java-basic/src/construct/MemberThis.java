package construct;

public class MemberThis {
    String nameField;

    void initMember(String nameParameter) {
        // this 생략
        // 멤버 변수 이름과 매개 변수 이름이 다르다.
        // 이 경우, nameParameter를 먼저 찾는다.
        // scope 상 매개 변수로 넘어온 nameParameter가 가깝다는 것을 알게 된다.
        // 그러므로 매개 변수인 nameParameter가 선택이 된다.
        // 그리고 nameField를 찾게 되는데, scope 상 지역 변수에서 찾을 수 없으므로 자신의 멤버 변수에서 찾는다.
        // 멤버 변수에서 nameField를 찾을 수 있으므로, 멤버 변수 nameField를 선택하게 된다.
        // 이 경우 눈에는 보이지 않지만 JAVA에서 자체적으로 nameField 앞에 'this.'을 붙여준다.
        nameField = nameParameter;
    }
}
