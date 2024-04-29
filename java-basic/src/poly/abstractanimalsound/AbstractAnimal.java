package poly.abstractanimalsound;

// 추상 메서드가 하나라도 존재하는 경우, 추상 클래스로 선언해야 한다.
// 추상 클래스, 추상 메서드 선언: 'abstract' 키워드를 부착한다.
public abstract class AbstractAnimal {
    // sound(): 메서드 바디 부분을 가지지 못하며, 자식 클래스에서 반드시 오버라이딩 해야 한다.
    public abstract void sound();
}
