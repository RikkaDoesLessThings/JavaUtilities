import java.util.Base64.*;
import java.security.*;
import java.io.FilterInputStream.*;
import java.io.InputStream.*;

public class UFiles extends JavaUtilities {
    // Conversions from *bit size to *bit size
    public static int bytesToKb(int num) {
        return (num/1024);
    }
    
    public static int bytesToMb(int num) {
        return (num/1048576);
    }
    
    public static int bytesToGb(int num) {
        return (num/1073741824);
    }
    
    public static int kbToBytes(int num) {
        return (num*1024);
    }
    
    public static int kbToMb(int num) {
        return (num/1024);
    }
    
    public static int kbToGb(int num) {
        return (num/1048576);
    }
    
    public static int mbToBytes(int num) {
        return (num*1048576);
    }
    
    public static int mbToKb(int num) {
        return (num*1024);
    }

    public static int mbToGb(int num) {
        return (num/1024);
    }
    
    public static int gbToBytes(int num) {
        return (num*1073741824);
    }
    
    public static int gbToKb(int num) {
        return (num*1048576);
    }
    
    public static int gbToMb(int num) {
        return (num*1024);
    }
    // end of conversions
    
    public static String sha256(String fileName) {
        byte[] buffer= new byte[8192];
        int count;
        MessageDigest digest = MessageDigest.getInstance("SHA-256");
        try (BufferedInputStream bis = new BufferedInputStream(new FileInputStream(fileName))) {
            while ((count = bis.read(buffer)) > 0) {
                digest.update(buffer, 0, count);
            }
        }
        
        byte[] hash = digest.digest();
        return (new Encoder().encode(hash));
    }
    
    public static int fileSize(String filePath) {
        File file = new File(filePath);
        return file.length();
    }
}