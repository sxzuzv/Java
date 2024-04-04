package ref;

public class RefVarChange {
    public static void main(String[] args) {
        Data dataA = new Data();
        dataA.value = 10;

        // 새로운 Data 객체 dataB를 만든다. 이때, dataB는 dataA의 주소를 가진다.
        // dataA의 '주소만 복사하여 대입'한다는 것에 유의한다.
        // => dataA라는 인스턴스 자체가 dataB에 대입되는 것이 아니다!
        Data dataB = dataA;

        // 객체가 생성된 메모리의 주소가 출력된다.
        // 이때, dataB는 dataA의 주소를 가지므로, 두 값은 동일하다.
        System.out.println("dataA 참조 값 = " + dataA);
        System.out.println("dataB 참조 값 = " + dataB);
        System.out.println("dataA.value = " + dataA.value); // 10
        // dataB는 dataA의 주소를 가지므로, dataA의 value에 접근하여 값을 가지고 온다.
        // 10
        System.out.println("dataB.value = " + dataB.value);

        // dataA의 value 값을 변경한다.
        dataA.value = 20;
        System.out.println("dataA 참조 값 = " + dataA);
        System.out.println("dataB 참조 값 = " + dataB);
        System.out.println("dataA.value = " + dataA.value); // 20
        // dataB는 dataA의 주소를 가지므로, dataA의 value에 접근하여 값을 가지고 온다.
        // 20
        System.out.println("dataB.value = " + dataB.value);

        // dataB(dataA의 주소를 가진다.)의 value 값을 변경한다.
        // 이때, dataA의 value 값에 접근해 30으로 변경된다.
        dataB.value = 30;
        System.out.println("dataA 참조 값 = " + dataA);
        System.out.println("dataB 참조 값 = " + dataB);
        System.out.println("dataA.value = " + dataA.value); // 30
        // dataB는 dataA의 주소를 가지므로, dataA의 value에 접근하여 값을 가지고 온다.
        // 30
        System.out.println("dataB.value = " + dataB.value);
    }
}
