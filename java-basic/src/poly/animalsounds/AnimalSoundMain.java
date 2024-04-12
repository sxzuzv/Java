package poly.animalsounds;

public class AnimalSoundMain {
    public static void main(String[] args) {
        Dog dog = new Dog();
        Cat cat = new Cat();
        Cow cow = new Cow();

        /* 전통적인 방식의 경우, 메서드 사용 과정에서 소스코드의 중복이 발생한다.
         새로운 동물이 추가된다면 클래스를 만들고 객체 생성 및 메서드 사용 코드를 추가해줘야 한다.
         */
        System.out.println("동물 소리 테스트 시작");
        dog.sound();
        System.out.println("동물 소리 테스트 종료");

        System.out.println("동물 소리 테스트 시작");
        cat.sound();
        System.out.println("동물 소리 테스트 종료");

        System.out.println("동물 소리 테스트 시작");
        cow.sound();
        System.out.println("동물 소리 테스트 종료");
    }
}