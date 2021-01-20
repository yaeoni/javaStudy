import java.io.*;
import java.util.Arrays;

public class ByteArray {
    public static void main(String args[]){
        // byte 배열 inSrc의 데이터를 outSrc로 복사하는 예
        byte[] inSrc = {0,1,2,3,4,5,6,7,8,9};
        byte[] outSrc = null;

        ByteArrayInputStream input = null;
        ByteArrayOutputStream output = null;

        input = new ByteArrayInputStream(inSrc);
        output = new ByteArrayOutputStream();

        int data = 0;

        // read 함수는 1 byte씩 읽기 때문에 효율성이 떨어질 수 있음
        while((data = input.read()) != -1){
            output.write(data);
        }

        // 스트림의 내용을 byte의 배열로 반환.
        outSrc = output.toByteArray();

        System.out.println("Input : "+ Arrays.toString(inSrc));
        System.out.println("Output : "+ Arrays.toString(outSrc));

    }
}
