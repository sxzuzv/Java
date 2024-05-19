package static1;

public class StaticData {
    public String name;
    public static int count;    // 공용으로 사용할 수 있는 static 변수 count

    public StaticData(String name) {
        this.name = name;
        count++;    // StaticData.count++; 로 작성해야 맞지만, 동일 클래스의 정적 변수 사용이므로 생략 가능하다.
    }
}