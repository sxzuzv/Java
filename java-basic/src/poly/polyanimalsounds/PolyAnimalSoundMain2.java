package poly.polyanimalsounds;

public class PolyAnimalSoundMain2 {
    public static void main(String[] args) {
        // 배열과 for문을 사용한 중복 제거
        // 부모는 자식을 담을 수 있으므로, Animal 타입의 배열에 동물을 원소로 담을 수 있다.

        // 개선: (Ctrl+Alt+N) 각 동물 객체 생성과 배열 원소 적용을 동시에 처리한다.
        Animal[] animalArr = {new Dog(), new Cat(), new Cow()};   // = new Animal[]{...} 축약

        for (Animal animal : animalArr) {
            // 개선: (Ctrl+Alt+M) 선택한 코드 범위를 메서드로 자동 추출한다.
            soundAnimal(animal);
        }
    }

    // 동물의 추가 여부에 관계 없이 변경되지 않는 코드
    private static void soundAnimal(Animal animal) {
        System.out.println("동물 소리 테스트 시작!");
        animal.sound();
        System.out.println("동물 소리 테스트 종료!");
    }
}
