public class equalsOverriding {
    public static void main(String args[]){
        Person p1 = new Person(1L);
        Person p2 = new Person(1L);

        if(p1 == p2) {
            System.out.println("같소");
        }else{
            System.out.println("다르오");
        }

        if(p1.equals(p2)) {
            System.out.println("equal 같소");
        }else{
            System.out.println("equal 다르오");
        }
    }
}

class Person{
    long id;

    public boolean equals(Object obj){
        if(obj != null && obj instanceof Person) {
            // obj 는 Object 타입, id값 참조하려면 Person으로의 형변환 필요
            // obj instanceof Person을 통해서 obj가 person의 인스턴스라는 거 확인됨 = 형변환 가
            // obj -> Person 넓은 곳으로 가는 거니깐 명시적 변환 필
            return id == ((Person) obj).id;
        }

        return false;
    }

    Person(long id){
        this.id = id;
    }
}
