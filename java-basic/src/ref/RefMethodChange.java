package ref;

public class RefMethodChange {
    public static void main(String[] args) {
        Data dataA = new Data();

        dataA.value = 10;

        System.out.println("메서드 호출 전 dataA.value : " + dataA.value); // 10
        changeReference(dataA); // dataA의 주소를 복사하여 메서드의 매개변수로 전달한다.
        System.out.println("메서드 호출 후 dataA.value : " + dataA.value); // 20
    }

    public static void changeReference(Data dataX) {
        // 메서드 실행 시, Data 객체인 dataX가 생성되며 dataA의 주소를 값으로 가진다.
        // => dataX를 통해서도 dataA에 접근하여 value 값을 변경할 수 있다.
        dataX.value = 20;   // dataA에 접근하여 value 값을 변경한다.
    }
}
