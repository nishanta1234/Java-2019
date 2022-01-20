import java.net.*;
import java.io.*;
public class MyClient {
    public static void main(String[] args) throws IOException {
        Socket socket = new Socket("123.0.0.15" ,2332);
        DataOutputStream output = new DataOutputStream(socket.getOutputStream());
        output.writeUTF("MANCHESTER CITY");
        output.flush();
        output.close();

        socket.close();
    }
    
}
