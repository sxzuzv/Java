package extends1.ex1;

public class CarMain {
    public static void main(String[] args) {
        // 전기차와 가솔린차는 주유 방법은 다르지만, 이동이라는 동일한 기능을 가진다.
        // 이 경우, 부모를 '자동차'로 두고 이동한다는 개념을 넣는 방식으로 상속 관계를 이용할 수 있다.
        ElectricCar electricCar = new ElectricCar();
        electricCar.move();
        electricCar.charge();

        GasCar gasCar = new GasCar();
        gasCar.move();
        gasCar.fillUp();
    }
}
