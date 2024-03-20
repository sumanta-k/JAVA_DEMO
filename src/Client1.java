import java.io.*;
import java.net.*;
public class Client1 {
    public static void main(String[] args)
    throws Exception{
        // create client socket with same port number
        Socket s = new Socket ("ip_address",1_2_3_4);
        InputStream obj = s.getInputStream();
        BufferedReader br = new BufferedReader(new InputStreamReader(obj));
        String str;
        while((str = br.readLine()) != null)
            System.out.println("From server: "+str);
        br.close();
        s.close();
    }
}
