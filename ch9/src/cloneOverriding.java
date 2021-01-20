public class cloneOverriding {
    public static void main(String args[]){
        Point origin = new Point(1, 2);
        Point copy = (Point)origin.clone();

        System.out.println(origin);
        System.out.println(copy);

        if(origin == copy){
            System.out.println("같==");
        }
        if(origin.equals(copy)){
            System.out.println("같e");
        }

        Point[] originAry = new Point[2];

        originAry[0] = new Point(1,1);
        originAry[0] = new Point(2,2);

        Point[] copyAry = originAry.clone();

        if(originAry[0] == copyAry[0]){
            System.out.println("Object arry same");
        }

    }
}

class Point implements Cloneable{
    int x;
    int y;

    Point(int x, int y){
        this.x = x;
        this.y = y;
    }

    public Object clone(){
        Object obj = null;
        try{
            obj = super.clone();
        }catch(CloneNotSupportedException e){}
        return obj;
    }
    public String toString(){
        return "x : " + x + ", y : "+ y;
    }
}

