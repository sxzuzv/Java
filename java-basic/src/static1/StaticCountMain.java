package static1;

public class StaticCountMain {
    public static void main(String[] args) {
        StaticData dataA = new StaticData("A");
        System.out.println("A count = " + StaticData.count);    // dataA.count가 아님에 주의!

        StaticData dataB = new StaticData("B");
        System.out.println("B count = " + StaticData.count);

        StaticData dataC = new StaticData("C");
        System.out.println("C count = " + StaticData.count);
    }
}