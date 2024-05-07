import java.net.*;
import java.io.*;

public class Server {
    public static void main(String[] args) throws IOException{
        ServerSocket ss = new ServerSocket( 4999);
        Socket s = ss.accept();
        System.out.println("Client connected.");

        //one way
        InputStreamReader in = new InputStreamReader(s.getInputStream());
        BufferedReader m = new BufferedReader(in);

        String str = m.readLine();
        System.out.println("client : "+ str);

        //two way
        PrintWriter p = new PrintWriter(s.getOutputStream());
        p.println("yes");
        p.flush();

    }
}
