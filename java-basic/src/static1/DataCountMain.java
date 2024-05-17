package static1;

public class DataCountMain {
    public static void main(String[] args) {
        // 생성된 객체의 수를 세는 프로그램
        Data data1 = new Data("A");
        System.out.println("A Count = " + data1.count);

        Data data2 = new Data("B");
        System.out.println("B Count = " + data2.count);

        Data data3 = new Data("C");
        System.out.println("C Count = " + data3.count);
    }
}