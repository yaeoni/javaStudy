package accessModifier;

public class constructorAcess {
    public static void main(String args[]){
        //에러가 난다 -> 생성자가 private로 설정되어 있기 때문
        //PrivateConstructor s = new PrivateConstructor(); 에
        PrivateConstructor s = PrivateConstructor.getInstance();
    }
}

class PrivateConstructor{
    private static PrivateConstructor s= new PrivateConstructor();
    private PrivateConstructor(){
        //..
    }

    public static PrivateConstructor getInstance(){
        if(s==null){
            s = new PrivateConstructor();
        }
        System.out.println("생성 되었씁니다!");
        return s;
    }
}
