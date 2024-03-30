package construct;

public class ConstructMain1 {
    public static void main(String[] args) {
        // 객체를 생성하면서 생성자를 호출한다.
        // 메모리에 객체(인스턴스)를 실제 생성(할당)하면서 곧바로 생성자를 호출한다.
        // 객체를 생성하면서 어떤 생성자를 쓸 것인지 조건을 맞춰준다.
        MemberConstruct member1 = new MemberConstruct("user1", 15, 90);
        MemberConstruct member2 = new MemberConstruct("user2", 16, 80);

        MemberConstruct[] members = {member1, member2};

        // 향상된 for문
        for(MemberConstruct m : members) {
            System.out.println("이름 : " + m.name + " 나이 : " + m.age + " 성적 : " + m.grade);
        }
    }
}
