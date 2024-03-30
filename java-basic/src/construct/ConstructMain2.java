package construct;

public class ConstructMain2 {
    public static void main(String[] args) {
        // 생성자 오버로딩, 원하는 생성자를 호출할 수 있다.
        MemberConstruct member1 = new MemberConstruct("user1", 15, 90);
        MemberConstruct member2 = new MemberConstruct("user2", 16);

        MemberConstruct[] members = {member1, member2};

        // 향상된 for문
        for(MemberConstruct m : members) {
            System.out.println("이름 : " + m.name + " 나이 : " + m.age + " 성적 : " + m.grade);
        }
    }
}
