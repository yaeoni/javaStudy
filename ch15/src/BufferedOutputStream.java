import java.io.*;

public class BufferedOutputStream {
    public static void main(String args[]){
        try{
            FileOutputStream fos = new FileOutputStream("./ch15/src/123.txt");

            // import 시켜놨는데 왜 이렇게 해야만 실행되는지는 모를 일, 아 class 이름이 ㅡㅡ 그대로임 ㅋ

            java.io.BufferedOutputStream bos = new java.io.BufferedOutputStream(fos, 5);
            // 이러면 버퍼에 5까지만 넣어짐 ->flush()나 close()를 안했기 때문이다....
            for(int i = '1' ; i<= '9' ; i++){
                bos.write(i);
            }
            bos.flush();
            fos.close();
        }catch(IOException e){
            e.printStackTrace();
        }
    }
}
