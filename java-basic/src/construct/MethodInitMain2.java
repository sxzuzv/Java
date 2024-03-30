package construct;

public class MethodInitMain2 {
    public static void main(String[] args) {
        // MemberInit 타입의 객체 생성
        // member1에는 객체의 참조값이 저장된다.
        MemberInit member1 = new MemberInit();
        initMember(member1, "user1", 15, 90);

        // MemberInit 타입의 객체 생성
        // member2에는 객체의 참조값이 저장된다.
        MemberInit member2 = new MemberInit();
        initMember(member2, "user2", 16, 80);

        // MemberInit 타입의 배열 members를 생성과 동시에 선언한다.
        MemberInit[] members = {member1, member2};

        // 향상된 for문
        for (MemberInit m : members) {
            System.out.println("이름 : " + m.name + " 나이 : " + m.age + " 성적 : " + m.grade);
        }
    }

    // 회원에 대한 정보를 초기화하는 메서드
    static void initMember(MemberInit member, String name, int age, int grade) {
        // 받은 매개변수 값을 객체의 멤버 변수에 넣는다. (초기화한다.)
        member.name = name;
        member.age = age;
        member.grade = grade;
    }
}
