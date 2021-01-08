public class Exercise7_1 {
    public static void main(String args[]){
        SutdaDeck deck = new SutdaDeck();

        for(int i = 0; i < deck.cards.length ; i++){
            System.out.print(deck.cards[i]+", ");
        }
    }
}

class SutdaDeck{
    final int CARD_NUM = 20;
    SutdaCard[] cards = new SutdaCard[CARD_NUM];

    SutdaDeck(){
        // 배열 sutdaCard를 초기화 하시
        for(int i = 0 ; i < cards.length ;i++){
            if(i == 0 | i == 2 | i == 7 )   cards[i] = new SutdaCard(i+1, true);
            else if( i >= 10 ){
                cards[i] = new SutdaCard(i-9, false);
            }
            else cards[i] = new SutdaCard(i, false);

            /* 답안
            비트연사자를 쓸 수 있따는거 ~ !
            int num = i%10 +1;
            boolean isKwang = (i<10) && (num==1 | num==3|num==8);
            cards[i] = new SutdaCard(num, isKwang);  */
        }
    }

    // math.random 사용해 카드를 섞기
    public void shuffle(){
        for(int i = 0 ; i < cards.length ;i++){
            int left = (int)(Math.random()* cards.length)+1;
            int right = (int)(Math.random()* cards.length)+1;

            SutdaCard temp = cards[left];
            cards[left] =  cards[right];
            cards[right] = temp;
        }


    }

    // 지정 위치에 있는 카드 빼내기
    public SutdaCard pick(int index){
        // 범위의 유효성을 검사해줘야함
        if(index <= 0 || index > CARD_NUM)
            return null;

        return cards[index];
    }

    // 임의의 위치 있는 카드 빼내기 math.random
    public SutdaCard pick(){
        int pick = (int)(Math.random()*cards.length)+1;
        return cards[pick];
    }
}

class SutdaCard{
    int num;
    boolean isKwang;

    SutdaCard(){
        this(1, true);
    }
    SutdaCard(int num, boolean isKwang){
        this.num = num;
        this.isKwang = isKwang;
    }

    public String toString(){
        return num+(isKwang? "K":"");
    }
}