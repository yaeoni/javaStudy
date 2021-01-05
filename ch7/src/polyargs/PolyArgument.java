package polyargs;

public class PolyArgument {
    public static void main(String args[]){
        Buyer b = new Buyer();

        b.buy(new Tv());
        b.buy(new Computer());

        System.out.println("남은 돈  : "+ b.money);
        System.out.println("뽀앵  : "+ b.bonusPoint);
        b.summary();
    }
}

class Product{
    int price;
    int bonusPoint;

    Product(int price){
        this.price = price;
        this.bonusPoint = (int)(price/10.0);
    }
}

class Tv extends Product{
    Tv(){
        super(100);
    }
    public String toString(){
        return "TV";
    }
}
class Computer extends Product{
    Computer(){
        super(200);
    }
    public String toString(){
        return "Computer";
    }
}
class Buyer{
    int money = 1000;
    int bonusPoint = 0;

    Product[] item = new Product[10];
    int i = 0;

    void buy(Product p){
        if(money<p.price){
            System.out.println("잔액 부족!");
            return;
        }

        money -= p.price;
        bonusPoint += p.bonusPoint;
        item[i++] = p;
        System.out.println(p.toString()+ " 구입 완");
    }
    void summary(){
        int sum = 0;
        String itemList = "";

        for(int i = 0 ; i < item.length ;i++){
            if(item[i]==null) break;

            sum += item[i].price;
            itemList += item[i] + ", ";
        }

        System.out.println("총 금액: "+sum);
        System.out.println("물품 목: "+itemList);


    }
}

