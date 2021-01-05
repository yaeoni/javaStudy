package interfaceCapsule;

public class InterfaceCapsule {
    public static void main(String args[]){
        A a = new A();
        a.autoPlay(new B());
        a.autoPlay(new C());
    }
}

interface I{
    public abstract void play();
}
class A {
    void autoPlay(I i){
        i.play();
    }
}
class B implements I{
    public void play(){
        System.out.println("play in B");
    }
}
class C implements I{
    public void play(){
        System.out.println("play in C");
    }
}