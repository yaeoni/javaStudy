package binding;

public class Binding {
    public static void main(String args[]){
        Parent p = new Child();
        Child c = new Child();

        System.out.println("parent : "+p.x);
        System.out.println("child : "+c.x);

        p.method();
        c.method();
    }
}

class Parent {
    int x = 100;

    void method(){
        System.out.println("Parent's method");
    }
}

class Child extends Parent {
    int x = 200;

    void method(){
        System.out.println("Child's method");
    }
}
