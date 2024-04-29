package poly.abstractanimalsound;

public class AbstractMain {
    public static void main(String[] args) {
        // 추상 클래스는 인스턴스 생성이 불가하다. (추상적인 개념만 제공하는 클래스)
        // AbstractAnimal animal = new AbstractAnimal(); => X

        Dog dog = new Dog();
        Cat cat = new Cat();
        Cow cow = new Cow();

        soundAnimal(dog);
        soundAnimal(cat);
        soundAnimal(cow);
    }

    // 동물의 추가 여부에 관계 없이 변경되지 않는 코드
    private static void soundAnimal(AbstractAnimal animal) {
        // 세 동물 모두 AbstractAnimal 클래스의 자식 클래스에서 생성되므로 매개변수로 받을 수 있다.
        System.out.println("동물 소리 테스트 시작!");
        animal.sound();
        System.out.println("동물 소리 테스트 종료!");
    }
}