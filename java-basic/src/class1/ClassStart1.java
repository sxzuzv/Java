package class1;

/* 문제 : 학생 정보 출력 프로그램 만들기
 두 명의 학생 정보를 출력하는 프로그램을 작성하려고 한다.
 각 학생은 이름, 나이, 성적을 가지고 있다.

 요구 사항
 1) 첫 번째 학생의 이름은 '학생1', 나이는 15, 성적은 90
 2) 두 번째 학생의 이름은 '학생2', 나이는 16, 성적은 80
 3) 각 학생의 정보를 다음과 같은 형식으로 출력한다.
 => 이름 : [이름] 나이 : [나이] 성적 : [성적]
 4) 변수를 사용하여 학생 정보를 저장 및 출력해야 한다.
 */

/* [문제 풀이 1 : 변수 활용]
    문제 풀이 1의 경우, 학생이 늘어날 때마다 변수를 추가로 선언해야 한다.
    더불어 학생의 정보를 출력하는 코드 역시 추가해야 한다.
 */

/* 반복적인 코드(출력문)의 경우, 반복문을 적용하여 출력하게 하면 되는데
해당 문제의 경우 이름, 나이, 성적을 나타내는 변수명이 다르므로 반복문을 적용할 수 없다.
변수명을 통일해야 반복문 적용이 가능한데,
이 경우 동일한 자료형에 대해 저장이 가능한 '배열'을 활용할 수 있다. */

public class ClassStart1 {
    public static void main(String[] args) {
        String student1Name = "학생 1";
        int student1Age = 15;
        int student1Grade = 90;

        String student2Name = "학생 2";
        int student2Age = 16;
        int student2Grade = 80;

        System.out.println("이름 : " + student1Name + " 나이 : " + student1Age + " 성적 : " + student1Grade);
        System.out.println("이름 : " + student2Name + " 나이 : " + student2Age + " 성적 : " + student2Grade);
    }
}
