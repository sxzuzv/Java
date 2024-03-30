package construct;

public class MethodInitMain1 {
    public static void main(String[] args) {
        // MemberInit 타입의 객체 생성
        // member1에는 객체의 참조값이 저장된다.
        MemberInit member1 = new MemberInit();
        member1.name = "user1";
        member1.age = 15;
        member1.grade = 90;

        // MemberInit 타입의 객체 생성
        // member2에는 객체의 참조값이 저장된다.
        MemberInit member2 = new MemberInit();
        member2.name = "user2";
        member2.age = 16;
        member2.grade = 80;

        // MemberInit 타입의 배열 members를 생성과 동시에 선언한다.
        MemberInit[] members = {member1, member2};

        // 향상된 for문
        for (MemberInit m : members) {
            System.out.println("이름 : " + m.name + " 나이 : " + m.age + " 성적 : " + m.grade);
        }
    }
}
