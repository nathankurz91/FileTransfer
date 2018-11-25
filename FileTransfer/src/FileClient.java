import java.io.*;
import java.net.*;

public class FileClient {
    public static void main(String[] args) throws Exception {
        byte []b = new byte[2002];
        Socket s = new Socket ("localhost", 4333);
        InputStream is = s.getInputStream();
        FileOutputStream fr = new FileOutputStream("OutputFiles/newFile.txt");
        is.read(b, 0, b.length);
        fr.write(b, 0, b.length);
    }
}
