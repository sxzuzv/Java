package class1;

public class ClassStart3 {
    public static void main(String[] args) {
        // 학생의 데이터를 담을 수 있는 변수를 선언한다.
        // Student라는 타입을 받을 수 있는 변수 'student1'을 선언한다.
        // Student = Student라는 타입의 객체(인스턴스)를 받을 수 있다.
        Student student1;
        // 학생을 실제 메모리에 만들고, 학생이라는 정보를 student1에 담아둔다.
        // new Student() = 실제 객체 or 인스턴스 (이 순간에 실체가 만들어진다.)
        student1 = new Student();

        // 클래스의 멤버 변수에는 '.'을 통해 접근한다.
        student1.name = "학생 1";
        student1.age = 15;
        student1.grade = 90;

        // 실제 메모리에 새로운 학생을 만들고, 그 정보를 student2에 담아둔다.
        // Student 타입을 받을 수 있는 변수 'student2'에 새로운 Student 객체(인스턴스)를 담았다.
        Student student2 = new Student();

        student2.name = "학생 2";
        student2.age = 16;
        student2.grade = 80;

        System.out.println("이름 : " + student1.name + " 나이 : " + student1.age + " 성적 : " + student1.grade);
        System.out.println("이름 : " + student2.name + " 나이 : " + student2.age + " 성적 : " + student2.grade);

    }
}
