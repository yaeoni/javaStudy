package interfaceTest;

class Interface {
    public static void main(String args[]){
        Fighter f = new Fighter();

        if(f instanceof Unit) System.out.println("Unit! class");
        if(f instanceof Fightable) System.out.println("Fightable interface");
        if(f instanceof Movable) System.out.println("Movable interface");
        if(f instanceof Attackable) System.out.println("Attackable interface!");
        if(f instanceof Object) System.out.println("Object interface!");
    }
}

class Fighter extends Unit implements Fightable{

    // Movable의 void는 (public abstract) void 이다
    public void move(int x, int y){ /* ... */ }
    public void attack(Unit u){ /* ... */ }
}

class Unit{
    int currentHP;
    int x;
    int y;
}

interface Fightable extends Movable, Attackable{}
interface Movable { void move(int x, int y);}
interface Attackable { void attack(Unit u);}