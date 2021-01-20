import java.io.*;
import java.util.Arrays;

public class ByteArray2 {
    public static void main(String args[]){

        byte[] inSrc = {0,1,2,3,4,5,6,7,8,9};
        byte[] outSrc = null;

        byte[] temp = new byte[10];

        ByteArrayInputStream input = null;
        ByteArrayOutputStream output = null;

        input = new ByteArrayInputStream(inSrc);
        output = new ByteArrayOutputStream();

        // 읽어온 데이터를 temp에 담는다.
        input.read(temp, 0, temp.length);
        //temp[5]부터 5개를 담는다.
        output.write(temp, 5, 5);

        outSrc = output.toByteArray();

        System.out.println("Input : "+ Arrays.toString(inSrc));
        System.out.println("Output : "+ Arrays.toString(outSrc));
        System.out.println("Temp : "+Arrays.toString(temp));
    }
}
