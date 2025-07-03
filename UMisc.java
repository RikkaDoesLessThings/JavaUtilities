import java.io.*;
import java.net.*;

public class UMisc extends JavaUtilities {
    public static String requestPage(String pageUrl) {
        URL url = new URL(pageUrl).catch{System.out.println("Error")};
        InputStream is = url.openStream();
        int ptr = 0;
        StringBuffer buffer = new StringBuffer();
        while ((ptr = is.read()) != -1) {
            buffer.append((char)ptr);
        }
        return buffer.toString();
    }
    
    public static boolean ping(String hostUrl) {
        try{
            InetAddress address = InetAddress.getByName(hostUrl);
            boolean reachable = address.isReachable(10000);
            return reachable;
        } catch (Exception e){
            e.printStackTrace();
            return false;
        }
    }
}