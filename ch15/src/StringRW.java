import java.io.*;

public class StringRW {
    public static void main(String args[]){
        String inputData = "ABCD";
        StringReader input = new StringReader(inputData);
        StringWriter output = new StringWriter();

        int data = 0;

        try{
            while((data = input.read())!=-1){
                output.write(data);
            }
        }catch(IOException e){}

        System.out.println("Input DAta : "+ inputData);
        System.out.println("Output Data : "+ output.toString());
    }
}
