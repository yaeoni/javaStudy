import java.io.*;
import java.util.Arrays;

public class DataOutput2 {
    public static void main(String args[]){
        ByteArrayOutputStream bos = null;
        DataOutputStream dos = null;

        byte[] result = null;

        try{
            bos = new ByteArrayOutputStream();
            dos = new DataOutputStream(bos);
            dos.writeInt(10);

            dos.writeFloat(20.0f);
            dos.writeBoolean(true);

            result = bos.toByteArray();

            String[] hex = new String[result.length];

            for(int i = 0 ; i<result.length;i++){
                if(result[i] <0){
                    hex[i] = String.format("%02x", result[i]+256);
                }else{
                    hex[i] = String.format("%02x", result[i]);
                }
            }

            // 1byte씩 넣어서, 4byte짜리 표현
            System.out.println("10 진수 : "+ Arrays.toString(result));
            System.out.println("16 진수 : "+Arrays.toString(hex));

            dos.close();

        }catch(IOException e){
            e.printStackTrace();
        }
    }
}
