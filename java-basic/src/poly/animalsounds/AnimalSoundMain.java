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

        // 아래와 같이 메서드를 호출하는 방식으로 중복을 제거할 수 있다.
        // 그러나, 각 동물은 타입이 다른 클래스이므로 매개변수로 전달하는 것이 불가하다.
        soundCow(cow);

        // 배열과 for문을 활용하는 방식으로 중복을 제거할 수 있다.
        // 그러나, 하나의 배열에 세 동물을 모두 넣을 수는 없다.
        // Cow[] cowArr = {dog, cat, cow}; => 세 동물이 다른 타입(클래스)이므로 Cow 배열에 담을 수 없다.

//        for (Cow cow : cowArr) {
//            cowArr.sound();
//        }
    }

    private static void soundCow(Cow cow) {
        System.out.println("동물 소리 테스트 시작");
        cow.sound();
        System.out.println("동물 소리 테스트 종료");
    }
}
