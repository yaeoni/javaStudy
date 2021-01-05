package interfaceOverriding;

public class DefaultMethod {
    public static void main(String args[]){
        Child c = new Child();
        c.method1(); // 부모것에서 오버라이딩 한 것
        c.method2(); // 부모 것 가져옴(상속한 메서드 실행)

        Myinterface.staticMethod();
        Myinterface2.staticMethod();
    }
}

interface Myinterface{
    default void method1(){
        System.out.println("method1 in interface1");
    }
    default void method2(){
        System.out.println("method2 in interface1");
    }
    static void staticMethod(){
        System.out.println("staticMethod() in interface1");
    }
}
interface Myinterface2{
    default void method1(){
        System.out.println("method1 in interface2");
    }
    static void staticMethod(){
        System.out.println("staticMethod() in interface2");
    }
}

class Parent{
    public void method2(){
        System.out.println("method 2 in parent");
    }
}

class Child extends Parent implements Myinterface, Myinterface2{
    public void method1(){ // method overriding
        System.out.println("method 1 in child");
    }
}