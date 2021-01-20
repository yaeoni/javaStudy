import java.io.*;

public class DataInput {
    public static void main(String args[]){
        FileOutputStream fos = null;
        DataOutputStream dos = null;

        try{
            fos = new FileOutputStream("./ch15/src/sample.dat");
            dos = new DataOutputStream(fos);

            dos.writeInt(10);
            dos.writeFloat(20.0f);
            dos.writeBoolean(true);

            dos.close();
        }catch(IOException e){
            e.printStackTrace();
        }
    }
}
