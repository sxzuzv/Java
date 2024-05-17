package static1;

public class CounterMain {
    public static void main(String[] args) {
        Counter counter = new Counter();

        CounterData dataA = new CounterData("A", counter);
        CounterData dataB = new CounterData("B", counter);
        CounterData dataC = new CounterData("C", counter);

        // 동일한 객체 Counter를 매개변수로 넘겨주므로, count 필드도 공유된 상태로 사용된다.
        System.out.println("counter = " + counter.count);
    }
}