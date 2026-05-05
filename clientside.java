import java.io.*;
import java.net.*;

class clientside {
    public static void main(String[] args) throws Exception {
        Socket sc = new Socket("localhost", 1212); // corrected
        DataInputStream br = new DataInputStream(sc.getInputStream());
        System.out.println(br.readLine()); // corrected
        br.close();
        sc.close();
    }
}
