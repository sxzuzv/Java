package construct.ex;

public class Book {
    String title;   // 제목
    String author;  // 저자
    int page;       // 페이지 수

    // 생성자 코드 작성
    // 1) 기본 생성자
    // 이미 생성자를 별도로 정의하였으므로, 기본 생성자를 사용하려면 직접 정의해주어야 한다.
    Book() {
        // 기본 생성자 내부를 비우지 않는다.
        this.title = "";
        this.author = "";
        // this.page = 0; 기본적으로 정수형 멤버 변수는 0으로 초기화된다.
    }

    // 2) title, author만을 매개변수로 받는 생성자
    Book(String title, String author) {
        this.title = title;
        this.author = author;
        this.page = 0;
    }

    // 3) 모든 멤버 변수를 매개변수로 받는 생성자
    Book(String title, String author, int page) {
        this.title = title;
        this.author = author;
        this.page = page;
    }

    void displayInfo() {
        System.out.println("제목 : " + title + " 저자 : " + author + " 페이지 수 : " + page);
    }
}
