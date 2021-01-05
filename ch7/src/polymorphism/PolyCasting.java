package polymorphism;

public class PolyCasting {
    public static void main(String args[]){

        /* 1 */
        // car, fe 는 각각 Car, Fire의 타입을 가진 참조 변수
        Car car = null;
        Fire fe = new Fire();
        Fire fe2 = null;

        fe.water();

        // 자동 형변환 -> car = (Car)fe
        car = fe;

        // car.water <= 불가. (Car)로 형변환을 했기 때문에 Car에 속한 놈들만 참조 가능

        // car도 Fire로 Down-casting시 Fire에 속한 놈들 참조 가능하게 된다.
        fe2 = (Fire)car;
        fe2.water();

        /* 2 */
        Car car2 = new Car();
        Car car3 = null;
        Fire fe3 = null;

        car2.drive();

        //fe3 = (Fire)car2; <= ClassCastException 발생 = car2가 이미 Car의 인스턴스를 가지게 되었음.
       //fe3.drive();

        car3 = fe3;
        car3.drive();
    }
}

class Car {
    String color;
    int door;

    void drive() {
        System.out.println("Drive!!!");
    }
    void stop(){
        System.out.println("Stop!!!!!!!!!");
    }
}
class Fire extends Car {
    void water(){
        System.out.println("Watering~!!!!!");
    }
}