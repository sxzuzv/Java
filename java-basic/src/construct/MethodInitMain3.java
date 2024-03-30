package construct;

public class MethodInitMain3 {
    public static void main(String[] args) {
        // MemberInit 타입의 객체를 생성하고, 추가한 메서드를 통해 멤버 변수 값을 초기화한다.
        MemberInit member1 = new MemberInit();
        member1.initMember("user1", 15, 90);

        MemberInit member2 = new MemberInit();
        member2.initMember("user2", 16, 80);

        // MemberInit 타입의 배열 members를 생성과 동시에 선언한다.
        MemberInit[] members = {member1, member2};

        // 향상된 for문
        for (MemberInit m : members) {
            System.out.println("이름 : " + m.name + " 나이 : " + m.age + " 성적 : " + m.grade);
        }
    }
}
