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

/* [문제 풀이 2 : 배열 활용]
    배열을 활용하여 코드 변경을 최소화하는 것에는 성공할 수 있다.
    그러나, 한 명의 학생 기준에서는 데이터가 배열 3개로 쪼개져 있다.
    그러므로 데이터의 변경 및 삭제에 있어서 배열 인덱스를 고려하는 게 필요하다.
    (각 학생의 요소를 배열에서 찾아 정확하게 변경 및 삭제해야 한다.)
    => 이름, 나이, 성적을 나누어서 관리하는 것은 사람이 관리하기 좋은 방식이 아니다.
    사람이 관리하기 좋은 방식은? 학생이라는 개념을 하나로 묶는 것이다.
    그리고 각각의 학생마다 본인의 이름, 나이, 성적을 관리하는 것이다.
 */

public class ClassStart2 {
    public static void main(String[] args) {
        String[] studentNames = {"학생 1", "학생 2"};
        int[] studentAges = {15, 16};
        int[] studentGrade = {90, 80};

        // 학생이 몇 명인가에 따라 나이, 성적 배열의 길이도 동일하게 맞춰진다.
        // 그러므로 반복하는 횟수를 이름을 저장한 배열의 길이로 지정한다.
        for(int i = 0; i < studentNames.length; i++) {
            System.out.println("이름 : " + studentNames[i] + " 나이 : " + studentAges[i] + " 성적 : " + studentGrade[i]);
        }

    }
}