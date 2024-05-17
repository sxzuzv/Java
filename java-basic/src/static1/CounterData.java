package static1;

public class CounterData {
    public String name;

    public CounterData(String name, Counter counter) {
        this.name = name;
        counter.count++;    // 카운팅을 위한 객체(Counter)의 필드를 통해 카운팅
    }
}