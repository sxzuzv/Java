package extends1.overriding;

public class CarMain {
    public static void main(String[] args) {
        ElectricCar electricCar = new ElectricCar();
        // 부모 클래스의 move()를 재정의한 상태이므로, "전기차를 빠르게 이동합니다."가 출력된다.
        electricCar.move();

        GasCar gasCar = new GasCar();
        gasCar.move();

        HydrogenCar hydrogenCar = new HydrogenCar();
        hydrogenCar.move();
    }
}
