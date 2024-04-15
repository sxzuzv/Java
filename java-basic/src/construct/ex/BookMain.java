package construct.ex;

public class BookMain {
    public static void main(String[] args) {
        // 기본 생성자 사용
        Book book1 = new Book();
        book1.displayInfo();

        // title, author만을 매개변수로 받는 생성자 사용
        Book book2 = new Book("Hello Java!", "soo");
        book2.displayInfo();

        // 모든 멤버 변수를 매개변수로 받는 생성자 사용
        Book book3 = new Book("JPA 프로그래밍", "jin", 600);
        book3.displayInfo();
    }
}
