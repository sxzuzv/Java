package static1;

public class StaticData {
    public String name;
    public static int count;    // 공용으로 사용할 수 있는 static 변수 count

    public StaticData(String name) {
        this.name = name;
        count++;
    }
}