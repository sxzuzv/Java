package poly.polyanimalsounds;

public class PolyAnimalSoundMain2 {
    public static void main(String[] args) {
        Dog dog = new Dog();
        Cat cat = new Cat();
        Cow cow = new Cow();

        // 배열과 for문을 사용한 중복 제거
        // 부모는 자식을 담을 수 있으므로, Animal 타입의 배열에 동물을 원소로 담을 수 있다.
        Animal[] animalArr = {dog, cat, cow};   // = new Animal[]{...} 축약

        // 동물의 추가 여부에 관계 없이 변경되지 않는 코드
        for (Animal animal : animalArr) {
            System.out.println("동물 소리 테스트 시작!");
            animal.sound();
            System.out.println("동물 소리 테스트 종료!");

        }
    }
}
