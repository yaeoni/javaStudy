package interfaceReturn;

public class ParserTest {
    public static void main(String args[]){
        // parser = new XMLParser() 과 의미가 같음
        Parseable parser = ParserManager.getParser("XML");
        parser.parse("document.xml");

        parser = ParserManager.getParser("HTML");
        parser.parse("documnet2.html");
    }
}

interface Parseable{
    //구문 분석 작업 수행
    public abstract void parse(String fileName);
}

// 이 클래스만 바꿔주면 새로운 인스턴스를 할당 해줄 수 있음!!
class ParserManager{
    //리턴 타입이 Parseable interface
    public static Parseable getParser(String type){
        if(type.equals("XML")){
            return new XMLParser();
        }else{
            // = return new HTMLParser();
            Parseable p = new HTMLParser();
            return p;
        }
    }
}

class XMLParser implements Parseable{
    public void parse(String fileName) {
        //구분 분석 코드 ~ 오버라이딩
        System.out.println("XML parsing!");
    }
}
class HTMLParser implements Parseable{
    public void parse(String fileName) {
        //구분 분석 코드 ~ 오버라이딩
        System.out.println("HTML parsing!");
    }
}