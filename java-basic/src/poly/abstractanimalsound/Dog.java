package poly.abstractanimalsound;

public class Dog extends AbstractAnimal {
    // 부모 클래스의 추상 메서드인 sound()를 반드시 오버라이딩 해야 한다.
    @Override
    public void sound() {
        System.out.println("멍멍!");
    }
}
