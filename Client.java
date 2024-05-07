import java.net.*;
import java.io.*;

public class Client {
    public static void main(String[] args) throws IOException{
        Socket s = new Socket("localhost", 4999);

        //one way
        PrintWriter p = new PrintWriter(s.getOutputStream());
        p.println("is it working?");
        p.flush();

        //two way
        InputStreamReader in = new InputStreamReader(s.getInputStream());
        BufferedReader m = new BufferedReader(in);

        String str = m.readLine();
        System.out.println("server : "+ str);
    }
    
}
