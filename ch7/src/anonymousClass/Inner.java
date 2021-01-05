package anonymousClass;

public class Inner {
    Object iv = new Object(){ void method(){}; }; // 익명 클래스
    static Object cv = new Object(){ void method(){}; };

    void myMethod(){
        Object lv = new Object(){ void method(){}; };
    }
}

