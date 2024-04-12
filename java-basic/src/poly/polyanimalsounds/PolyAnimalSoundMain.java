package poly.polyanimalsounds;

public class PolyAnimalSoundMain {
    public static void main(String[] args) {
        Dog dog = new Dog();
        Cat cat = new Cat();
        Cow cow = new Cow();

        // Animal의 자식인 Dog, Cat, Cow 타입의 변수를 매개변수로 넘길 수 있다.
        soundAnimal(dog);
        soundAnimal(cat);
        soundAnimal(cow);
    }

    // 부모 타입(Animal)을 매개변수로 받는다.
    private static void soundAnimal(Animal animal) {
        System.out.println("동물 소리 테스트 시작");
        // 매개변수로 받은 자식 타입에서 재정의한 sound() 메서드를 실행한다.
        // 자식 클래스에서 오버라이딩 된 메서드가 가장 높은 우선권을 가짐에 유의한다.
        animal.sound();
        System.out.println("동물 소리 테스트 종료");
    }
}
